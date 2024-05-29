public class Vestuario {
	private String tipo;
	private String cor;
	private String tamanho;
	
	public String getTipo(){
		return tipo;
	}

	public String getCor(){
		return cor;
	}

	public String getTamanho(){
		return tamanho;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}

	@Override
	public String toString(){
		return("Tipo: " + tipo + " Tamanho: " + tamanho);
	}
}