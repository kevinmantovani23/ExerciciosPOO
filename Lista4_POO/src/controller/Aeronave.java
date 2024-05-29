package controller;

public class Aeronave {
	private String fabricante;
	private int anoFabricacao;
	private String tipo;
	private String modelo;
	
	public Aeronave(String fabricante, int anoFabricacao, String tipo) {
		this.anoFabricacao = anoFabricacao;
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.modelo = fabricante + " " + tipo;
	}
	
	public void voar() {
		System.out.println("A aeronave decolou.");
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
