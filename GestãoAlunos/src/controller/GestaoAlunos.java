package controller;

import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos {
	Scanner scan = new Scanner(System.in);
	private int indice = 0;
	private Aluno[] alunos = new Aluno[50];

	public void criar() {
		if (indice < 50) {
			System.out.println("Insira o nome do aluno.");
			String nome = scan.nextLine();
			System.out.println("Insira o id do aluno.");
			long id = Long.parseLong(scan.nextLine());
			System.out.println("Insira o RA do aluno.");
			String ra = scan.nextLine();
			System.out.println("Insira o dia de nascimento do aluno.");
			int dia = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o mes de nascimento do aluno.");
			int mes = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o ano de nascimento do aluno.");
			int ano = Integer.parseInt(scan.nextLine());
			Date datanasc = new Date(ano, mes, dia);
			this.alunos[indice] = new Aluno(id, datanasc, ra, nome);
			this.indice++;
		} else {
			System.out.println("A lista está cheia.");
		}
	}

	public void atualizar() {
		int ind = 99;
		System.out.println("Insira o RA do aluno para atualizá-lo.");
		String ra = scan.nextLine();
		for (int i = 0; i < 50; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					ind = i;
					break;
				}
			}
		}
		if (ind != 99) {
			System.out.println("Aluno encontrado. Digite o novo nome: ");
			alunos[ind].setNome(scan.nextLine());
			System.out.println("Insira o novo dia da data de nascimento: ");
			int dia = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o novo mes de nascimento do aluno.");
			int mes = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o novo ano de nascimento do aluno.");
			int ano = Integer.parseInt(scan.nextLine());
			Date datanasc = new Date(ano, mes, dia);
			alunos[ind].setNascimento(datanasc);
		} else {
			System.out.println("Aluno não encontrado.");
		}
	}

	public void excluir() {
		int ind;

		System.out.println("Insira o RA do aluno para removê-lo.");
		String ra = scan.nextLine();
		for (int i = 0; i < 50; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					System.out.println("Aluno " + alunos[i].getNome() + " foi removido.");
					alunos[i] = null;
					for (ind = i; ind < 49; ind++) {
						if (alunos[ind + 1] != null) {
							alunos[ind] = alunos[ind + 1];
							alunos[ind + 1] = null;
						} else {
							this.indice = ind + 1;
						}
					}
				}
			}
		}
	}

	public void exibir() {
		System.out.println("Insira o RA do aluno para exibi-lo.");
		String ra = scan.nextLine();
		for (int i = 0; i < 50; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					System.out.println(alunos[i].toString());
					break;
				}
			}
		}
	}

	public void menu() {
		String out;
		char escolha = 'a';

		while (escolha != 'S') {
			System.out.println("                    MENU\r\n" + "ESCREVA A PRIMEIRA LETRA DA OPCAO QUE DESEJA.\r\n"
					+ "\r\n" + "(C)riar           (E)xibir             (R)emover               \r\n"
					+ "                (A)tualizar    (S)air");
			out = scan.nextLine().toUpperCase();
			escolha = out.charAt(0);
			switch (escolha) {
			case 'C':
				criar();
				break;
			case 'E':
				exibir();
				break;
			case 'R':
				excluir();
				break;
			case 'A':
				atualizar();
				break;
			case 'S':
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

}
