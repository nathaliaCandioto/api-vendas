package br.com.vendas.api.repository;

import br.com.vendas.api.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface VendedorRepository extends JpaRepository<Vendedor,Long> {

    @Query("""
            SELECT v FROM Vendedor v
            WHERE 1=1
            AND (v.cpf = :cpf OR :cpf IS NULL)
            AND(v.nome like :nome% OR :nome IS NULL)
            AND(v.email like :email% OR :email IS NULL)
            AND (v.telefone like :telefone% OR :telefone IS NULL)
            AND (v.comissao =:comissao OR :comissao IS NULL)
            AND (v.salario =:salario OR :salario IS NULL)
            """)

    List<Vendedor> findByAttributes(@Param("cpf")String cpf,
                                    @Param("nome") String nome,
                                    @Param("email") String email,
                                    @Param("telefone") String telefone,
                                    @Param("comissao") Double comissao,
                                    @Param("salario") Double salario);

    Optional<Vendedor> findByCpf(String cpf);
}
