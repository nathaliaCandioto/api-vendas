package br.com.vendas.api.controller;

import br.com.vendas.api.entity.*;
import br.com.vendas.api.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pedido")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarPedido(@RequestBody Pedido pedido) {
        pedidoService.cadastrarPedido(pedido);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Pedido> listaTodosPedidos() {
        return pedidoService.listaTodosPedidos();

    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidoPor(Long id, Double preco, Long quantidade, String vendedorNome, String vendedorCpf, /*Cliente cliente*/ PagamentoEnum pagamento, StatusPedidoEnum statusPedido) {
        List<Pedido> byAttributes = pedidoService.findByAttributes(id, preco, quantidade, vendedorNome, vendedorCpf, null, pagamento, statusPedido);
        if (byAttributes.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(byAttributes);

    }
}
