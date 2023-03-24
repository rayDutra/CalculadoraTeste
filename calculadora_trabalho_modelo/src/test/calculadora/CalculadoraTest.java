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
	public void testarExponenciarMemoriaPor1(){
		Calculadora calc = new Calculadora();
		assertThrows(Exception.class, ()->calc.exponenciar(1));

	}
	@Test
	public void testarExponenciarMemoriaPor10() {
		Calculadora calc = new Calculadora(10);
		assertThrows(Exception.class, ()->calc.exponenciar(11));
	}
	@Test
	public void testarZerarMemoria(){
		Calculadora calc = new Calculadora(1);
		calc.zerarMemoria();
		int memoriaEsperada = 0;
		int memoriaObtida = calc.getMemoria();
		assertEquals(memoriaEsperada, memoriaObtida);
	}	
}



