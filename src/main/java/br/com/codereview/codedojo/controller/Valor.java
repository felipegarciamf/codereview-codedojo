package br.com.codereview.codedojo.controller;

public class Valor {

	public Valor(Long valor1, Long valor2, Long resultado) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.resultado = resultado;
	}

	private Long valor1;

	private Long valor2;
	
	private String tipo;

	private Long resultado;

	public Long getResultado() {
		return resultado;
	}

	public Long getValor1() {
		return valor1;
	}

	public Long getValor2() {
		return valor2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setValor1(Long valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(Long valor2) {
		this.valor2 = valor2;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setResultado(Long resultado) {
		this.resultado = resultado;
	}
	
	
	

}
