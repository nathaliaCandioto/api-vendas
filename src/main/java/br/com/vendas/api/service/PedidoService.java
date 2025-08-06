package br.com.vendas.api.service;


import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.entity.PagamentoEnum;
import br.com.vendas.api.entity.Pedido;
import br.com.vendas.api.entity.Vendedor;
import br.com.vendas.api.repository.PedidoRepository;
import br.com.vendas.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository PedidoRepository;

    public Pedido cadastrarPedido (Pedido pedido){
        return  PedidoRepository.save(pedido);
            }

   public List<Pedido>listaTodosPedidos(){
        return PedidoRepository.findAll();
   }

   public List<Pedido> findByAttributes (Long id,Double preco, Long quantidade, Vendedor vendedor, Cliente cliente, PagamentoEnum pagamento){
     return PedidoRepository.findByAttributes(id,preco, quantidade, vendedor, cliente, pagamento);
    }

}
