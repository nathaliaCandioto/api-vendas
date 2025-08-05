package br.com.vendas.api.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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



}
