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

    @Column
    private String descricao;

    @ManyToOne
    @JoinColumn
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="pagamento_id")
    private PagamentoEnum pagamento;

    @Enumerated(EnumType.STRING)
    @Column(name="status_id")
    private StatusPedidoEnum statusPedido;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPedidoEnum getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedidoEnum statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Pedido(Long id, Double preco, Long quantidade,String descricao,Vendedor vendedor, Cliente cliente, PagamentoEnum pagamento,StatusPedidoEnum statusPedido) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.statusPedido=statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", descricao='" + descricao + '\'' +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", pagamento=" + pagamento +
                ", statusPedido=" + statusPedido +
                '}';
    }

    public Pedido (){

    }
}
