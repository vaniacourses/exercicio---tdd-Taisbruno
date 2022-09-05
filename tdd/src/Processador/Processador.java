package Processador;

import java.util.ArrayList;

import Boleto.Boleto;
import Fatura.Fatura;

public class Processador {
	private ArrayList<Boleto> boletos;
	
	public Processador() {
		boletos = new ArrayList<>();
	}

	public Boleto pagarFatura(Boleto boleto) {
		return boleto;
		
	}
	
	public boolean verificaFatura(Fatura fatura) {
		return true;
    }
	
	public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }
}
