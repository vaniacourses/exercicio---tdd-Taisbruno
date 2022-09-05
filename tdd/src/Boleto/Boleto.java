package Boleto;

public class Boleto {
	private int codigo;
    private double valorPago;
    private String dataBoleto;
	
	public Boleto(int codigo, double valorPago, String dataBoleto) {
		this.codigo = codigo;
        this.dataBoleto = dataBoleto;
        this.valorPago = valorPago;
		
	}

}
