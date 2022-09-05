package Processador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Boleto.Boleto;
import Fatura.Fatura;

public class Processadortest {
	Processador processador;

	@BeforeEach
	public void incializaProcessador() {
		processador = new Processador();

	}
	
	@Test
	public void testpagarFatura() {
		Boleto boleto = new Boleto(163950, 200.00, "08/08/2022");
		Assertions.assertEquals(boleto, processador.pagarFatura(boleto));
	}
	
	@Test
	public void testverificaFatura() {
		Fatura fatura = new Fatura("10/08/2022", 320.00, "Julio da Silva Rodriguez");
		Boleto boleto = new Boleto(163950, 200.00, "08/08/2022");
		boolean taPaga = processador.verificaFatura(fatura);
		Assertions.assertTrue(taPaga);
		
		
	}
}
