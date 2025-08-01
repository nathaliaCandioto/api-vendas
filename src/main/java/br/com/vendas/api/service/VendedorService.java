package br.com.vendas.api.service;

import br.com.vendas.api.entity.Vendedor;
import br.com.vendas.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor cadastrarVendedor(Vendedor vendedor){
        return vendedorRepository.save(vendedor);

    }

    public List<Vendedor>vendedores(){
        return vendedorRepository.findAll();
    }

    public List<Vendedor> findByatributes(String cpf, String nome, String email, String telefone,Double salario,Double comissao){
        return vendedorRepository.findByAtributtes(cpf, nome, email, telefone,salario,comissao);

    }
}
