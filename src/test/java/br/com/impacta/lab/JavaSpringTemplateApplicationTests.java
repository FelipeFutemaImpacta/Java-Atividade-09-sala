package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveInstantiateCCWithSucess() {
		
		Conta cc = new ContaCorrente(10, 1, "CC");
		
		assertEquals("CC", cc.getTipo());
		
	}
	
	@Test
	public void shouldHaveInstantiateCPWithSucess() {
		
		Conta cp = new ContaPoupanca(5, 12, "CP");
		
		assertEquals("Cp", cp.getTipo());
		
	}
	
}
