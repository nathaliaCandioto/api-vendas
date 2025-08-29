package br.com.vendas.api.repository;

import br.com.vendas.api.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

    @Query("""
           SELECT p FROM Pedido p
            WHERE 1=1
            AND (p.id=:id OR :id IS NULL)
            AND (p.preco=:preco OR :preco IS NULL)
            AND (p.quantidade=:quantidade OR :quantidade IS NULL)
            AND (p.vendedor.nome =:vendedorNome OR :vendedorNome IS NULL)
            AND (p.vendedor.cpf =:vendedorCpf OR :vendedorCpf IS NULL)
            AND (p.cliente=:cliente OR :cliente IS NULL)
            AND (p.pagamento=:pagamento OR :pagamento IS NULL)
            AND (p.statusPedido=:statusPedido OR :statusPedido IS NULL)
           """)
    List<Pedido> findByAttributes(@Param("id") Long id,
                                  @Param("preco") Double preco,
                                  @Param("quantidade") Long quantidade,
                                  @Param( "vendedorNome") String vendedorNome,
                                  @Param( "vendedorCpf") String vendedorCpf,
                                  @Param("cliente") Cliente cliente,
                                  @Param("pagamento") PagamentoEnum pagamento,
                                  @Param("statusPedido") StatusPedidoEnum statusPedido
    );
                                 

}
