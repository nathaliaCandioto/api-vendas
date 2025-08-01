package br.com.vendas.api.service;

import br.com.vendas.api.entity.Vendedor;
import br.com.vendas.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor cadastrarVendedor(Vendedor vendedor){
        return vendedorRepository.save(vendedor);

    }

    public List<Vendedor>listarTodosVendedores(){
        return vendedorRepository.findAll();
    }

    public List<Vendedor> findByatributes(String cpf, String nome, String email, String telefone,Double salario,Double comissao){
        return vendedorRepository.findByAttributes(cpf, nome, email, telefone,salario,comissao);

    }

    public void excluirVendedor(String cpf){
        Optional<Vendedor> v = vendedorRepository.findByCpf(cpf);
        if(v.isPresent()){
            vendedorRepository.delete(v.get());
        }
    }
}
