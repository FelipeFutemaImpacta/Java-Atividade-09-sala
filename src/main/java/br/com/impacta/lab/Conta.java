package br.com.impacta.lab;

public class Conta {

	private int numero;
	private int agencia;
	private String tipo;

	public Conta(int numero, int agencia, String tipo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String montarResumoDaConta() {
		return "Numero: " + this.getNumero() + 
		" - Agencia: " + this.getAgencia() +
		" - Tipo: " + this.getTipo();
	}
	
}
