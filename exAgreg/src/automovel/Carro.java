package automovel;

public class Carro {
	private String modelo;
	private String cor;
	public Neon neon;
	private Chassi chassi;
	
	public Carro(String modelo, String cor, Neon neon, Chassi chassi) {
		this.modelo = modelo;
		this.cor = cor;
		this.neon = neon;
		this.chassi = chassi;
	}
	
	public Carro() {
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Neon getNeon() {
		return neon;
	}

	public void setNeon(Neon neon) {
		this.neon = neon;
	}

	public Chassi getChassi() {
		return chassi;
	}

	public void setChassi(Chassi chassi) {
		this.chassi = chassi;
	}
	
	
	
}
