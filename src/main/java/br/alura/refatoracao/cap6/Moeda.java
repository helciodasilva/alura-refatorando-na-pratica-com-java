package br.alura.refatoracao.cap6;

public enum Moeda {

	DOLLAR(2.7),
	EUERO(3.0);

	private double taxa;

	Moeda(double taxa) {
		this.taxa = taxa;

	}

	public double getTaxa() {
		return taxa;
	}

}
