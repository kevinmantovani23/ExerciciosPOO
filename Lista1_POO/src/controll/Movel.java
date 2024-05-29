package controll;

public class Movel {
	
	private String nome;
	private String material;
	private String funcao;
	private String cor;
	private String dataFabricacao;
	
	public Movel(String nome, String material, String funcao, String cor, String dataFabricacao) {
		this.nome = nome;
		this.material = material;
		this.funcao = funcao;
		this.cor = cor;
		this.dataFabricacao = dataFabricacao;
	}
	
	public void deteriorar() {
		System.out.println(nome + " está se deteriorando.");
	}
	
	public void utilizar() {
		System.out.println(nome + " foi utilizado.");
	}
	
	public void desmontar() {
		System.out.println(nome + " foi desmontado.");
	}
	

	
	//Getters e setters...

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	
	
}
