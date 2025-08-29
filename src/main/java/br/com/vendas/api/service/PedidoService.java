package br.com.vendas.api.service;


import br.com.vendas.api.entity.*;
import br.com.vendas.api.repository.PedidoRepository;
import br.com.vendas.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository PedidoRepository;

    public Pedido cadastrarPedido(Pedido pedido) {
        return PedidoRepository.save(pedido);
    }

    public List<Pedido> listaTodosPedidos() {
        return PedidoRepository.findAll();
    }

    public List<Pedido> findByAttributes(Long id, Double preco, Long quantidade, String vendedorNome, String vendedorCpf, Cliente cliente, PagamentoEnum pagamento, StatusPedidoEnum statusPedido) {
        return PedidoRepository.findByAttributes(id, preco, quantidade, vendedorNome, vendedorCpf, cliente, pagamento, statusPedido);
    }


}
