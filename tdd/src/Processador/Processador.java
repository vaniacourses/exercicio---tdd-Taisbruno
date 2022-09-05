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

	public void pagarFatura(Pagamento pagamento, Boleto boleto, Fatura fatura) {
        this.boletos.add(boleto);
        fatura.setValorTotal(boleto.getValorPago());
    }
	
	public boolean verificaFatura(Fatura fatura) {
        for (Boleto boleto: boletos) {
            if (boleto.getPagamento().getFatura().getValorTotal() <= 0) {
                return true;
            }
           
        }
        return false;
    }
	
	public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }
}
