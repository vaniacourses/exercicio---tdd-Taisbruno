package Processador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Boleto.Boleto;
import Fatura.Fatura;
import Pagamento.Pagamento;

public class Processadortest {
	Processador processador;

	@BeforeEach
	public void incializaProcessador() {
		processador = new Processador();

	}
	
	@Test
	public void testpagarFatura() {
		Fatura fatura = new Fatura("10/08/2022", 320.00, "Julio da Silva Rodriguez");
		Pagamento pagamento = new Pagamento(200.00, "BOLETO", "08/08/2022", fatura);
		Boleto boleto = new Boleto(163950, 200.00, "08/08/2022", pagamento);
		Assertions.assertEquals(pagamento.getFatura(), processador.pagarFatura(pagamento, boleto, fatura));
	}
	
	@Test
	public void testverificaFatura() {
		Fatura fatura = new Fatura("10/08/2022", 320.00, "Julio da Silva Rodriguez");
		Pagamento pagamento = new Pagamento(200.00, "BOLETO", "08/08/2022", fatura);
		Boleto boleto = new Boleto(163950, 200.00, "08/08/2022", pagamento);
		Pagamento pagamento2 = new Pagamento(120.00, "BOLETO", "09/08/2022", fatura);
		Boleto boleto2 = new Boleto(197515, 120.00, "09/08/2022", pagamento);
		processador.pagarFatura(pagamento, boleto, fatura);
		processador.pagarFatura(pagamento2, boleto2, fatura);
		boolean taPaga = processador.verificaFatura(fatura);
		Assertions.assertTrue(taPaga);
		
	}
}
