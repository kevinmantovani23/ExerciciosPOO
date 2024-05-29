package controller;

import java.util.Date;

public class Aluno {
	private long id;
	private Date nascimento;
	private String ra;
	private String nome;
	
	
	public Aluno(long id, Date nascimento, String ra, String nome) {
		this.id = id;
		this.nascimento = nascimento;
		this.ra = ra;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return("Nome do Aluno: " + nome
				+ "\nID do aluno: " + id
				+ "\nData de nascimento do aluno: " + nascimento.getDate() + "/" + nascimento.getMonth() + "/" + nascimento.getYear()
				+ "\nRA do aluno: " + ra);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
