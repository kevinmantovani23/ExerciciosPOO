package controller;

public class Aeroporto {
	private String nome;
	private String localizacao;
	private int numAvioes;
	public Aeronave[] avioes;
	private int tam;
	
	public Aeroporto(String nome, String localizacao, int numAvioes) {
		this.nome = nome;
		this.localizacao = localizacao;
		this.numAvioes = numAvioes;
		avioes = new Aeronave[numAvioes];
	}
	
	public void gerenciaVoos() {
		
	}
	
	
	}

