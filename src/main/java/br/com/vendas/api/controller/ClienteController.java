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

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List <Cliente> listarTodosVendedores(){
        return clienteService.listaTodosClientes();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List <Cliente> listarCliente(@RequestParam(value = "cpf", required = false) String cpf,
                                        @RequestParam(value = "nome", required = false) String nome,
                                        @RequestParam(value="email",required=false) String email,
                                        @RequestParam(value="telefone",required = false)String telefone){
        return clienteService.findByAttributes(cpf, nome,email,telefone);
    }

    @DeleteMapping ("/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirCliente(@PathVariable(value = "cpf") String cpf){
        clienteService.excluirCliente(cpf);
    }
}
