package br.com.vendas.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Cliente extends  Pessoa{

    public Cliente(String cpf, String nome, String email, String telefone) {
        super(cpf, nome, email, telefone);
    }

    @Override
    public String toString() {
        return "Cliente{} " + super.toString();
    }
}
