package br.com.vendas.api.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double preco;

    @Column
    private Long quantidade;

    @ManyToOne
    @JoinColumn
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    @Enumerated(EnumType.ORDINAL)
    @Column
    private PagamentoEnum pagamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PagamentoEnum getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoEnum pagamento) {
        this.pagamento = pagamento;
    }

    public Pedido(Long id, Double preco, Long quantidade, Vendedor vendedor, Cliente cliente, PagamentoEnum pagamento) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", pagamento=" + pagamento +
                '}';
    }
    public Pedido (){

    }
}
