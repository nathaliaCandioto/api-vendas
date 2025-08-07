package br.com.vendas.api.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Cliente extends Pessoa {



    @Override
    public String toString() {
        return "Cliente{} " + super.toString();
    }

    public Cliente(){
        super();
    }


    public Cliente(String cpf, String nome, String email, String telefone, Long id) {
        super(id,cpf, nome, email, telefone);

    }


}
