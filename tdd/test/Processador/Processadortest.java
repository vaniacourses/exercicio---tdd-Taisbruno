package Processador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Processadortest {
	Processador processador;

	@BeforeEach
	public void incializaProcessador() {
		processador = new Processador();

	}

	@Test
	public void testpagarFatura() {
		Assertions.assertEquals("boleto", pagarFatura(boleto));
	}

	@Test
	public void testverificaFatura() {

	}
	

}

