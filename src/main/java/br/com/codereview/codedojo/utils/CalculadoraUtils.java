package br.com.codereview.codedojo.utils;

public class CalculadoraUtils {

	public Long somar(Long valor1, Long valor2) {
		return valor1 + valor2;
	}

	public Long dividir(Long valor1, Long valor2) throws Exception {
		if (valor1 == 0 || valor2 == 0) {
			throw new Exception("não se dividi por 0");
		}
		return valor1 / valor2;
	}

	public Long multiplicar(Long valor1, Long valor2) {
		return valor1 * valor2;
	}

	public Long subtrair(Long valor1, Long valor2) {
		return valor1 - valor2;
	}

}
