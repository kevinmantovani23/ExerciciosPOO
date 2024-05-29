package control;

public class Dinossauro {
	private String nome;
	private double energia;
	private double velocidade;
	private double temperatura;
	private String humor;

	public Dinossauro(String nome, double energia, double velocidade, double temperatura) {
		this.energia = energia;
		this.nome = nome;
		this.velocidade = velocidade;
		this.temperatura = temperatura;
		this.humor = "feliz";
		check();
	}

	public void pular() {
		if (energia < 10) {
			System.out.println("O dinossauro " + nome + " está muito cansado para pular.");
		}else {
			energia -= 20;
			velocidade-=10;
			humor = "feliz";
			check();
			System.out.println("O dinossauro " + nome + " pulou e agora está com " + energia + " de energia, " + velocidade + " de velocidade"
					+ " e feliz.");
		}
		
	}

	public void correr() {
		if (energia < 10) {
			System.out.println("O dinossauro " + nome + " está muito cansado para correr.");
		}else {
			energia -= 20;
			velocidade-=10;
			humor = "feliz";
			check();
			System.out.println("O dinossauro " + nome + " correu e agora está com " + energia + " de energia, " + velocidade
					+ " e feliz.");
		}
		
	}

	public void comer() {
		energia+= 50;
		velocidade-=10;
		humor = "feliz";
		check();
		System.out.println("O dinossauro " + nome + " comeu e agora está com " + energia + " de energia, " + velocidade
				+ " e feliz.");
	}

	public void cantar() {
		if (energia < 10) {
			System.out.println("O dinossauro " + nome + " está muito cansado para cantar.");
		}else {
			energia -= 20;
			humor = "feliz";
			check();
			System.out.println("O dinossauro " + nome + " cantou e agora está com " + energia + " de energia e feliz.");
		}
	}

	public void tomarSol() {
		if (temperatura > 40) {
			System.out.println("O dinossauro " + nome + " está muito quente para tomar sol.");
		} else {
			velocidade += 20;
			temperatura += 5;
			humor = "feliz";
			check();
			System.out.println("O dinossauro " + nome + " tomou Sol e agora está com " + velocidade + " de velocidade, " + temperatura
					+ " de temperatura e feliz.");
		}
	}

	public void ficarNaSombra() {
		if (temperatura < 25) {
			System.out.println("O dinossauro " + nome + " está com muito frio para ficar na sombra.");
		} else {
			temperatura -= 5;
			energia+=20;
			humor = "triste";
			check();
			System.out.println("O dinossauro " + nome + " ficou na sombra e agora está com " + energia + " de energia, " + temperatura
					+ " de temperatura e triste.");
		}
	}

	private void check() {
		if (energia > 100) {
			energia = 100;
		} else if (energia < 0) {
			energia = 0;
		}
		if (velocidade > 100) {
			velocidade = 100;
		} else if (velocidade < 0) {
			velocidade = 0;
		}
		if (temperatura > 100) {
			temperatura = 100;
		} else if (temperatura < 0) {
			temperatura = 0;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEnergia() {
		return energia;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public String getHumor() {
		return humor;
	}
	
	

}
