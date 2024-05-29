package locomotiva;

public class Trem {
	private String tipo;
	private double peso;
	private Vagao vagao;
	public Buzina buzina;
	
	
	public Trem(String tipo, double peso, Vagao vagao, Buzina buzina) {
		this.tipo = tipo;
		this.peso = peso;
		this.vagao = vagao;
		this.buzina = buzina;
	}
	
	public Trem() {
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Vagao getVagao() {
		return vagao;
	}

	public void setVagao(Vagao vagao) {
		this.vagao = vagao;
	}

	public Buzina getBuzina() {
		return buzina;
	}

	public void setBuzina(Buzina buzina) {
		this.buzina = buzina;
	}
	
	
	
	
}
