package br.com.vendas.api.entity;

public enum PagamentoEnum {

    CREDITO("credito"),DEBITO("debito"),PIX("pix"),DINHEIRO("dinheiro");
    private String descricao;
    private PagamentoEnum(String descricao){
        this.descricao=descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
