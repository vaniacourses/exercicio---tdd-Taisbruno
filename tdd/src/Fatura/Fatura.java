package Fatura;

/**
 * Classe responsável por representar uma fatura.
 */

public class Fatura {
    private String dataFatura;
    private double valorTotal;
    private String nomeCliente;

    public Fatura(String dataFatura, double valorTotal, String nomeCliente) {
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.dataFatura = dataFatura;
    }

    public String getDataFatura() {
        return this.dataFatura;
    }

    public void setValorTotal(double valor) {
        valorTotal -= valor;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

}
