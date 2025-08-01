package br.com.vendas.api.service;

import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastraCliente(Cliente cliente){
        return clienteRepository.save(cliente);

    }

    public List<Cliente> findByAttributes(String cpf, String nome,String email,String telefone) {
        return clienteRepository.findByAttributes(cpf, nome,email,telefone);
    }

    public List<Cliente> listaTodosClientes(){
        return clienteRepository.findAll();
    }

    public void excluirCliente(String cpf) {
        Optional<Cliente> cliente = clienteRepository.findByCpf(cpf);
        if (cliente.isPresent()) {
            clienteRepository.delete(cliente.get());
        }
    }



}
