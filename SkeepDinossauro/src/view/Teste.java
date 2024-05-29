package view;

import java.util.Scanner;

import control.Dinossauro;

public class Teste {
	

	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro("Skeep", 100, 100, 28);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("\nO dinossauro " + skeep.getNome() + " apresenta as seguintes caracteristicas: \r\n"
					+ "Energia: " + skeep.getEnergia() +" \r\n"
					+ "Velocidade: " + skeep.getVelocidade()+ " \r\n"
					+ "Temperatura: " + skeep.getTemperatura()+ " \r\n"
					+ "Humor: " + skeep.getHumor());
			System.out.println("Digite 'sair' para sair, ou qualquer outra coisa para continuar. ");
			String escolha = scan.nextLine().toLowerCase();
			if (escolha.equals("sair")){
				break;
			}
			System.out.println("Escreva apenas a letra entre parenteses da opção que deseja.\r\n"
					+ " \r\n"
					+ "(P)ular           (C)orrer               Co(M)er\r\n"
					+ "C(A)ntar        Tomar (S)ol          Ficar na S(O)mbra");
			escolha = scan.nextLine().toUpperCase();
			switch (escolha) {
			case "P":
				skeep.pular();
				break;
			case "A":
				skeep.cantar();
				break;
			case "C":
				skeep.correr();
				break;
			case "M":
				skeep.comer();
				break;
			case "S":
				skeep.tomarSol();
				break;
			case "O":
				skeep.ficarNaSombra();
				break;
			default:
				System.out.println("Escolha indevida.");
			}
			
		}
		scan.close();
	}

}
