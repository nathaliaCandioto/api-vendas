package br.com.vendas.api.repository;

import br.com.vendas.api.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("""
           SELECT c FROM Cliente c
           WHERE 1=1
           AND (c.cpf = :cpf OR :cpf IS NULL)
           AND (c.nome like :nome% OR :nome IS NULL)
           AND (c.email like :email% OR :email IS NULL)
           AND (c.telefone like :telefone% OR :telefone IS NULL)
           """)
    List<Cliente> findByAttributes(@Param("cpf") String cpf,
                                   @Param("nome") String nome,
                                   @Param("email") String email,
                                   @Param("telefone") String telefone);

    Optional<Cliente> findByCpf (String cpf);

}
