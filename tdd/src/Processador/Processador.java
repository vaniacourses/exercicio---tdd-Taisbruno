package Processador;

import java.util.ArrayList;

import Boleto.Boleto;

public class Processador {
	private ArrayList<Boleto> boletos;
	
	public Processador() {
		boletos = new ArrayList<>();
	}

	public String pagarFatura(Boleto boleto) {
		return "boleto";
		
	}
	
	public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }
}
