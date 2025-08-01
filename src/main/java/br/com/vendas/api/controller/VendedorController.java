package br.com.vendas.api.controller;

import br.com.vendas.api.entity.Vendedor;
import br.com.vendas.api.repository.VendedorRepository;
import br.com.vendas.api.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarVendedor(@RequestBody Vendedor vendedor) {

        vendedorService.cadastrarVendedor(vendedor);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Vendedor> listaTodosVendedores() {
        return vendedorService.listarTodosVendedores();

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Vendedor> listarVendedoresPorAtributo(@RequestParam(value = "cpf", required = false) String cpf,
                                                      @RequestParam(value = "nome", required = false) String nome,
                                                      @RequestParam(value = "email", required = false) String email,
                                                      @RequestParam(value = "telefone", required = false) String telefone,
                                                      @RequestParam(value = "salario", required = false) Double salario,
                                                      @RequestParam(value = "comissao", required = false) Double comissao) {
        return vendedorService.findByatributes(cpf, nome, email, telefone, salario, comissao);

    }

    @DeleteMapping("/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarVendedor(@PathVariable(value = "cpf") String cpf){
        vendedorService.excluirVendedor(cpf);
    }


}
