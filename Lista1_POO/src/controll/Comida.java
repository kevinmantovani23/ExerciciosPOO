package controll;

public class Comida {
	
	private String nome;
	private String sabor;
	private double calorias;
	private String validade;
	private double peso;
	
	public Comida (String nome, String sabor, double calorias, String validade, double peso) {
		this.nome = nome;
		this.sabor = sabor;
		this.calorias = calorias;
		this.validade = validade;
		this.peso = peso;
	}
	
	public void comer() {
		System.out.println("Um pedaço de " + nome + " foi comido.");
	}
	
	public void estragar() {
		System.out.println(nome + " está estragado.");
	}
	
	public void acabar () {
		this.peso = 0;
		System.out.println(nome + " acabou.");
	}

	

	
	//Getters e setters...
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
