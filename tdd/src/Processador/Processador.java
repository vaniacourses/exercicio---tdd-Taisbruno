package Processador;

import java.util.ArrayList;

import Boleto.Boleto;
import Fatura.Fatura;
import Pagamento.Pagamento;

/**
 * Classe responsável por administrar um Processador de Boletos.
 */

public class Processador {
    private ArrayList<Boleto> boletos;

    public Processador() {
        boletos = new ArrayList<>();
    }

    public boolean verificaFatura(Fatura fatura) {
        for (Boleto boleto: boletos) {
            if (boleto.getPagamento().getFatura().getValorTotal() <= 0) {
                return true;
            }
           
        }
        return false;
    }

    public void pagarFatura(Pagamento pagamento, Boleto boleto, Fatura fatura) {
        this.boletos.add(boleto);
        fatura.setValorTotal(boleto.getValorPago());
    }

    public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }

}
