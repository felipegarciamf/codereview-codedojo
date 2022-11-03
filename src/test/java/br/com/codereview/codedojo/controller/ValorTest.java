package br.com.codereview.codedojo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.codereview.codedojo.service.Valor;

class ValorTest {

	@BeforeEach
	public void init() {

	}

	@Test
	public void getValoresTodos() {
		Valor valor = new Valor(1L,1L,3L);
		valor.setTipo("/");
		
		assertEquals(valor.getResultado(), 3L);
		assertEquals(valor.getTipo(), "/");
		assertEquals(valor.getValor1(), 1L);
		assertEquals(valor.getValor2(), 1L);
	}

}
