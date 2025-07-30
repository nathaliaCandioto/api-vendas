package br.com.vendas.api.service;

import br.com.vendas.api.entity.Vendedor;
import br.com.vendas.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor cadastrarVendedor(Vendedor vendedor){
        return vendedorRepository.save(vendedor);

    }
}
