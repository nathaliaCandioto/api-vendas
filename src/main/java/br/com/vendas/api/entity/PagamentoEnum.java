package br.com.vendas.api.entity;

public enum PagamentoEnum {

    CREDITO("credito"),
    DEBITO("debito"),
    PIX("pix"),
    DINHEIRO("dinheiro");

    private String tipoPagamento;
    private PagamentoEnum(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;

    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }


}
