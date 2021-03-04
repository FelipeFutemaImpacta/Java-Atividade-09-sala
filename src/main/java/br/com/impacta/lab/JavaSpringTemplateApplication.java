package br.com.impacta.lab;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Crie três classes nesse mesmo pacote todas obedecendo o 
		 * pilar de encapsulamento
		 * 
		 * 1 - Conta
		 * Atributo		tipo do atributo
		 * numero		int
		 * agencia		int
		 * tipo			String
		 * 
		 * Construtor - 
		 * Um construtor para preencher todos os atributos no
		 * momento de instancia o objeto
		 * 
		 * método - 
		 * public String montarResumoDaConta()
		 * 
		 * que retorne o resumo da conta nesse formato
		 * "Numero: " + this.getNumero() + 
				" - Agencia: " + this.getAgencia() +
				" - Tipo: " + this.getTipo();
		 * 
		 * 
		 * 2-
		 * ContaCorrente que estenda de Conta
		 * 
		 * Construtor - 
		 * Construtor que receba todos os atributos de entrada e 
		 * passe para a superclasse (Conta)
		 * 
		 * 
		 * 3-
		 * ContaPoupança que estenda de Conta
		 * 
		 * Construtor - 
		 * Construtor que receba todos os atributos de entrada e 
		 * passe para a superclasse (Conta)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Conta cc = new ContaCorrente(10, 1, "CC");
		Conta cp = new ContaPoupanca(5, 12, "CP");
		
		System.out.println(cc.montarResumoDaConta());
		System.out.println(cp.montarResumoDaConta());
	}

}
