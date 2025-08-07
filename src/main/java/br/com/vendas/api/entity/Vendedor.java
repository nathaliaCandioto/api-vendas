package br.com.vendas.api.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Vendedor extends Pessoa {

    @Column
    private Double salario;
    @Column
    private Double comissao;

    public Vendedor(Long id, String cpf, String nome, String email, String telefone,Double salario,Double comissao){
        super(id,cpf,nome,email,telefone);

    }
    public Vendedor(){

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
               "salario=" + salario +
               ", comissao=" + comissao +
               ", nome='" + nome + '\'' +
               ", email='" + email + '\'' +
               ", telefone='" + telefone + '\'' +
               ", cpf='" + cpf + '\'' +
               "} " + super.toString();
    }
}
