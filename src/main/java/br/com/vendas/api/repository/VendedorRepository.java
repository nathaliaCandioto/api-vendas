package br.com.vendas.api.repository;

import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VendedorRepository extends JpaRepository<Vendedor,Long> {

    @Query("""
            Select v FROM Vendedores v
            AND (v.cpf=:cpf OR :cpf IS NULL)
            AND(v.nome like :nome% OR :nome IS NULL)
            AND(v.email like :email% OR :email IS NULL)
            AND (v.telefone like :telefone% OR :telefone IS NULL)
            AND (v.comissao like :comissao% OR :comissao IS NULL)
            AND (v.salario like :salario% OR :salario IS NULL)
            """)

    List<Vendedor> findByAtributtes(@Param("cpf")String cpf,
                                    @Param("nome") String nome,
                                    @Param("email") String email,
                                    @Param("telefone") String telefone,
                                    @Param("comissao") Double comissao,
                                    @Param("salario") Double salario);


}
