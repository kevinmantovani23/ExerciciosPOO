package view;
import automovel.*;
import dispositivo.*;
import locomotiva.*;


public class Main {

	public static void main(String[] args) {
		Chassi chassi1 = new Chassi(1923);
		Neon neonVermelho = new Neon("Vermelho");
		Carro c1 = new Carro("Fiat Uno", "Azul", neonVermelho, chassi1);
		PlacaMae placa = new PlacaMae("B450M", "Asus");
		Led ledAzul = new Led("Azul", 2);
		Computador pc = new Computador("18/02/2018", 3, placa, ledAzul);
		Buzina buSorvete = new Buzina ("Buzina de carro de sorvete");
		Vagao vagao1 = new Vagao(40);
		Trem trem1 = new Trem("Fumaça", 2.4, vagao1, buSorvete);
		
	}

}
