package controller;

public class Caixa {
	private double saldo;
	
	public Caixa (double saldo) {
		this.saldo = saldo;
	}
	
	public double venda (double... valoresProdutos) {
		for (double valorProduto : valoresProdutos) {
				this.saldo += valorProduto;
		}
		
		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
}
