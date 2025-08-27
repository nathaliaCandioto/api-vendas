package br.com.vendas.api.repository;

import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.entity.PagamentoEnum;
import br.com.vendas.api.entity.Pedido;
import br.com.vendas.api.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

    @Query("""
           SELECT p FROM Pedido p
            WHERE 1=1
            AND (p.id=:id OR :id IS NOT NULL)
            AND (p.preco=:preco OR :preco IS NOT NULL)
            AND (p.quantidade=:quantidade OR :quantidade IS NOT NULL)
            AND (p.vendedor=:vendedor OR :vendedor IS NOT NULL)
            AND (p.cliente=:cliente OR :cliente IS NOT NULL)
            AND (p.pagamento=:pagamento OR :pagamento IS NOT NULL)
           """)
    List<Pedido> findByAttributes(@Param("id") Long id,
                                  @Param("preco") Double preco,
                                  @Param("quantidade") Long quantidade,
                                  @Param( "vendedor") Vendedor vendedor,
                                  @Param("cliente") Cliente cliente,
                                  @Param("pagamento") PagamentoEnum pagamento
    );
                                 

}
