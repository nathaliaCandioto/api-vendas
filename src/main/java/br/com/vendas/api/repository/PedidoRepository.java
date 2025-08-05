package br.com.vendas.api.repository;

import br.com.vendas.api.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
