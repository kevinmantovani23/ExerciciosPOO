package controller;

public class Piloto extends Pessoa {
	
	private String docPiloto;
	private int anosExp;
	private String instituicao;
	
	public Piloto(String nome, int idade, String cpf, String docPiloto) {
		super(nome, idade, cpf);
		this.docPiloto = docPiloto;
	}
	
	public void pilotar(Aeronave aviao) {
		System.out.println("O piloto começou a manusear a aeronave " + aviao.getModelo());
	}
}
