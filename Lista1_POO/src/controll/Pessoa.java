package controll;


public class Pessoa {
	
	private String nome;
	private double altura;
	private double peso;
	private String dataNasc;
	private String nacionalidade;
	
	public Pessoa(String nome, double altura, double peso, String dataNasc, String nacionalidade) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.dataNasc = dataNasc;
		this.nacionalidade = nacionalidade;
	}
	
	public void rir() {
		System.out.println(nome + " está rindo.");
	}
	
	public void andar () {
		System.out.println(nome + " está andando.");
		
	}
	
	public void dormir () {
		System.out.println(nome + " está dormindo.");
	}
	
	
	//Getters e setters...

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	
}

