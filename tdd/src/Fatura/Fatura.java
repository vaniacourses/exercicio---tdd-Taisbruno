package Fatura;

public class Fatura {
	private String dataFatura;
    private double valorTotal;
    private String nomeCliente;

    public Fatura(String dataFatura, double valorTotal, String nomeCliente) {
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.dataFatura = dataFatura;
    }
}
