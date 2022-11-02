package br.com.codereview.codedojo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codereview.codedojo.service.CalcularServiceImpl;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


	@Autowired
	private CalcularServiceImpl calcularServiceImpl;
	
	
	@GetMapping("/calcular")
	public ResponseEntity<Valor> getCalculo(@RequestBody Valor valor) {
		
		Long buscaResultado = buscaResultado(valor.getValor1(), valor.getValor2(), valor.getTipo());
		valor.setResultado(buscaResultado);
		
		return ResponseEntity.ok(valor);
	}

	
	/* método para trazer o resultado de acordo com o que voce mande, como o valor1 trazendo um valor o valor trazendo outro valor
	* O valor tipo trazendo qual tipo que ele vai utilizar para fazer a calculadora, sendo o + para somar o - para subtrair
	* o / para divir e o * para multiplicar e com isso vai retornar o valor correto para o usuário.
	*
	**/
	private Long buscaResultado(Long valor1,Long valor2,String tipo) {
		Long calcular = calcularServiceImpl.calcular(valor1, valor2, tipo);
		return calcular;
	}
	
	// deve subtrair o valor
	private long subtrai(long valor1, long valor2) {
		return valor1 - valor2;
	}
	
}
