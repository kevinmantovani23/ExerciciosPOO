package dispositivo;

public class Led {
	private String cor;
	private int velocidade;
	
	public Led(String cor, int velocidade) {
		this.cor = cor;
		this.velocidade = velocidade;
	}
	
	public Led() {
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
}
