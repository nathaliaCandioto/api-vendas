package br.com.vendas.api.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Vendedor extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    private Double salario;
    @Column
    private Double comissao;

    public Vendedor(String cpf, String nome, String email, String telefone){
        super(cpf,nome,email,telefone);

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
                "id=" + id +
                ", salario=" + salario +
                ", comissao=" + comissao +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
