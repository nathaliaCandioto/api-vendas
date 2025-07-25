package br.com.vendas.api.service;

import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void cadastraCliente(Cliente cliente){
        clienteRepository.save(cliente);

    }

    public List<Cliente> listaTodosClientes(){
        return clienteRepository.findAll();
    }




}
