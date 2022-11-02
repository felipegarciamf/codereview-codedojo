package br.com.codereview.codedojo.service;

import org.springframework.stereotype.Service;

@Service
public class CalcularServiceImpl implements ICalcularService {

	public Long calcular(Long valor1, Long valor2, String tipo) {
		Long resultado = null;

		try {

			if (tipo.toString() == "-") {
				return valor1 - valor2;
			} else if (tipo == "+") {
				resultado = valor1 + valor2;
			} else if (tipo.equals("/") ) {
				if(valor1 > 0 || valor2 > 0) {
					return valor1 / valor2;
				}
			} else {
				resultado = valor1 * valor2;
			}

		} catch (Exception e) {
			System.out.println(e);
			return resultado;
		}
		return resultado;
	}

}
