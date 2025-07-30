package br.com.vendas.api.repository;

import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor,Long> {
}
