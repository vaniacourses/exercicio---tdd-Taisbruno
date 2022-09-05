package Pagamento;

import Fatura.Fatura;

public class Pagamento {
    private double valorPagamento;
    private String tipoPagamento;
    private String dataPagamento;
    private Fatura fatura;

    public Pagamento(double valorPagamento, String tipoPagamento, String dataPagamento, Fatura fatura) {
        this.valorPagamento = valorPagamento;
        this.tipoPagamento = tipoPagamento;
        this.dataPagamento = dataPagamento;
        this.fatura = fatura;
    }

    public double getValorPagamento() {
        return this.valorPagamento;
    }
    
    public String getTipoPagamento() {
        return this.tipoPagamento;
    }

    public String getDataPagamento() {
        return this.dataPagamento;
    }

    public Fatura getFatura() {
        return this.fatura;
    }
}

