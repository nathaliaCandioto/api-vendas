package br.com.vendas.api.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Cliente extends Pessoa {

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Cliente(String cpf, String nome, String email, String telefone) {
        super(cpf, nome, email, telefone);
    }

    @Override
    public String toString() {
        return "Cliente{} " + super.toString();
    }

    public Cliente(){
        super();
    }

    public Cliente(String cpf, String nome, String email, String telefone, Long id) {
        super(cpf, nome, email, telefone);
        this.id = id;
    }


}
