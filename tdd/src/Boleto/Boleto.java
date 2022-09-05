package Boleto;

import Pagamento.Pagamento;

public class Boleto {
    private int codigo;
    private double valorPago;
    private String dataBoleto;
    private Pagamento pagamento;

    public Boleto(int codigo, double valorPago, String dataBoleto, Pagamento pagamento) {
        this.codigo = codigo;
        this.dataBoleto = dataBoleto;
        this.valorPago = valorPago;
        this.pagamento = pagamento;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public String getDataBoleto() {
        return this.dataBoleto;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }
    
}
