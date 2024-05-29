package controller;

public class Passageiro extends Pessoa {
	
	private String passaporte;
	private String dataVoo;
	private String tipoAssento;
	
	public Passageiro(String nome, int idade, String cpf, String passaporte, String dataVoo, String tipoAssento) {
		super(nome, idade, cpf);
		this.dataVoo = dataVoo;
		this.passaporte = passaporte;
		this.tipoAssento = tipoAssento;
	}
	
	public void chamaAeromoça() {
		System.out.println(nome + " chamou a aeromoça.");
	}

}
