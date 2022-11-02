package br.com.codereview.codedojo.service;

import org.springframework.stereotype.Service;

@Service
public class CalcularServiceImpl implements ICalcularService {

	public Long calcular(Long valor1, Long valor2, String tipo) {

		Long resultado;

		if (tipo == "-") {
			return valor1 - valor2;
		} else if (tipo == "+") {
			resultado = valor1 + valor2;
		} else if (tipo == "/") {
			return valor1 / valor2;
		} else {
			resultado = valor1 * valor2;
		}

		return resultado;

	}

}
