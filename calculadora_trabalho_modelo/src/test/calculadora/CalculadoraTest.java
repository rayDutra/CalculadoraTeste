package test.calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraTest {
	private Calculadora calc;
	
	@BeforeEach
	public void before( ) {
		calc = new Calculadora(0);
	}
	@Test
	public void testarConstrutorSemParametroIniciaMemoriaComZero() {
		//definir cenário
		int resultadoEsperado = 0;
		//executar
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();
		//comparar
		assertEquals(resultadoEsperado, resultadoObtido,"Construtor vazio com falha,inicializa memória incorretamente");
		
		
	}
	
	@Test
	public void testerConstrutorComParametroRecebendoValor0() {
			calc = new Calculadora(0);
			int resultadoEsperado = 0;
			int resultadoObtido = calc.getMemoria();
			assertEquals(resultadoEsperado, resultadoObtido);
		}
	
	@Test
	public void testerConstrutorComParametroRecebendoValorNegativo() {
			calc = new Calculadora(-10);
			int resultadoEsperado = -10;
			int resultadoObtido = calc.getMemoria();
			assertEquals(resultadoEsperado, resultadoObtido);
		}
	@Test
	public void testerConstrutorComParametroRecebendoValorPositivo() {
			calc = new Calculadora(10);
			int resultadoEsperado = 10;
			int resultadoObtido = calc.getMemoria();
			assertEquals(resultadoEsperado, resultadoObtido);
		}
	@Test
	public void testerSomarNumeroNegativo() {
		    calc.somar(-7);
			int resultadoEsperado = -7;
			int resultadoObtido = calc.getMemoria();
			assertEquals(resultadoEsperado, resultadoObtido);
		}
	@Test
	public void testerSubtrairNumeroPositivo() {
		    calc.subtrair(3);
			int resultadoEsperado = 3;
			int resultadoObtido = calc.getMemoria();
			assertEquals(resultadoEsperado, resultadoObtido);
		}
	
	@Test
	public void testerMultiplicarNumeroPositivo() {
		    calc.multiplicar(9);
			int resultadoEsperado = 0;
			int resultadoObtido = calc.getMemoria();
			assertEquals(resultadoEsperado, resultadoObtido);
		}
	@Test
	public void testarDividirPorZero() throws Exception {
		assertThrows(Exception.class,()-> calc.dividir(0));
	}
	@Test
	public void testarDividirPorNumeroPositivo() throws Exception {
	    calc= new Calculadora(10);
		calc.dividir(2);
		int resultadoEsperado = 5;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	@Test
	public void testarExponenciarPor1() throws Exception {
		Calculadora calc = new Calculadora(1);
		assertThrows(Exception.class,()-> calc.exponenciar(22));
	}

	@Test
	public void testarExponenciarPor10() throws Exception {
		Calculadora calc = new Calculadora(1);
		assertThrows(Exception.class,()-> calc.exponenciar(10));
	}
	

	
}

