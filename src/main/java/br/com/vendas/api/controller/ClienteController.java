package br.com.vendas.api.controller;

import br.com.vendas.api.entity.Cliente;
import br.com.vendas.api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente(@RequestBody Cliente cliente){
        return clienteService.cadastraCliente(cliente);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List <Cliente> listarCliente(){
        return clienteService.listaTodosClientes();
    }

}
