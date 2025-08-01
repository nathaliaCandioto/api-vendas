package br.com.vendas.api.controller;

import br.com.vendas.api.entity.Vendedor;
import br.com.vendas.api.repository.VendedorRepository;
import br.com.vendas.api.service.VendedorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/vendedor")
public class VendedorController {

    private VendedorService vendedorService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public  void cadastrarVendedor(@RequestBody Vendedor vendedor){
        vendedorService.cadastrarVendedor(vendedor);
    }




}
