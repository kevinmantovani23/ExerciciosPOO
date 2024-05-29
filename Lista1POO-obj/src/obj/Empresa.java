package obj;

public class Empresa {
	int TAMANHO_CARACTERES = 25;
	public int DIAS_FATURAMENTO = 10;
	public StringBuilder nome = new StringBuilder();
	public double salarios [] = new double [100];
	
	public Empresa(String nome) {
		this.nome.append(nome);
		this.nome.setLength(TAMANHO_CARACTERES);
	}
	
	
	}
	

