package br.alura.refatoracao.cap4;

public abstract class ContaBancaria {

	protected double saldo;

	protected String titulo;

	public ContaBancaria(String titulo, double saldo) {
		this.saldo = saldo;
		this.titulo = titulo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitulo() {
		return titulo;
	}
	
}
