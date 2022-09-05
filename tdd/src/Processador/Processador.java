package Processador;

import java.util.ArrayList;

import Boleto.Boleto;
import Fatura.Fatura;
import Pagamento.Pagamento;

public class Processador {
	private ArrayList<Boleto> boletos;
	
	public Processador() {
		boletos = new ArrayList<>();
	}

	public Fatura pagarFatura(Pagamento pagamento, Boleto boleto, Fatura fatura) {
        this.boletos.add(boleto);
        return pagamento.getFatura();
	}
	
	public boolean verificaFatura(Fatura fatura) {
		return true;
    }
	
	public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }
}
