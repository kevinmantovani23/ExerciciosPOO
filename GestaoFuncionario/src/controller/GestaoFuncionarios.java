package controller;

import java.util.Date;
import java.util.Scanner;

public class GestaoFuncionarios {
	Scanner scan = new Scanner(System.in);
	private int indice = 0;
	private Funcionario[] funcionarios = new Funcionario[50];

	public void criar() {
		if (indice < 50) {
			System.out.println("Insira o nome do funcionario.");
			String nome = scan.nextLine();
			System.out.println("Insira o id do funcionario.");
			long id = Long.parseLong(scan.nextLine());
			System.out.println("Insira a matricula do funcionario.");
			String matricula = scan.nextLine();
			System.out.println("Insira o salário do funcionario.");
			float salario = Float.parseFloat(scan.nextLine());
			System.out.println("Insira o horário do funcionario.");
			String horario = scan.nextLine();
			System.out.println("Insira o dia de admissão do funcionario.");
			int dia = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o mes de admissão do funcionario.");
			int mes = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o ano de admissão do funcionario.");
			int ano = Integer.parseInt(scan.nextLine());
			Date dataadm = new Date(ano, mes, dia);
			this.funcionarios[indice] = new Funcionario(id, nome, matricula, dataadm, salario, horario);
			this.indice++;
		} else {
			System.out.println("A lista está cheia.");
		}
	}

	public void atualizar() {
		int ind = 99;
		System.out.println("Insira a matrícula do funcionário para atualizá-lo.");
		String matricula = scan.nextLine();
		for (int i = 0; i < 50; i++) {
			if (funcionarios[i] != null) {
				if (funcionarios[i].getMatricula().equals(matricula)) {
					ind = i;
					break;
				}
			}
		}
		if (ind != 99) {
			System.out.println("Funcionário encontrado. Digite o novo nome: "); 
			funcionarios[ind].setNome(scan.nextLine());
			System.out.println("Insira o novo dia da admissão: ");
			int dia = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o novo mes de admissão.");
			int mes = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o novo ano de admissão.");
			int ano = Integer.parseInt(scan.nextLine());
			Date dataadm = new Date(ano, mes, dia);
			funcionarios[ind].setAdmissao(dataadm);
			System.out.println("Insira o novo dia da demissão: (caso nao tenha, coloque 3000 no campo do ano.) ");
			dia = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o novo mes de demissão. (caso nao tenha, coloque 3000 no campo do ano.)");
			mes = Integer.parseInt(scan.nextLine());
			System.out.println("Insira o novo ano de demissão. (caso nao tenha, coloque 3000 no campo do ano.)");
			ano = Integer.parseInt(scan.nextLine());
			dataadm = new Date(ano, mes, dia);
			funcionarios[ind].setDemissao(dataadm);
			System.out.println("Digite o novo salário: "); 
			funcionarios[ind].setSalario(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite o novo horario: "); 
			funcionarios[ind].setHorario(scan.nextLine());
			
		} else {
			System.out.println("Funcionário não encontrado.");
		}
	}

	public void excluir() {
		int ind;

		System.out.println("Insira a matricula do funcionario para removê-lo.");
		String matricula = scan.nextLine();
		for (int i = 0; i < 50; i++) {
			if (funcionarios[i] != null) {
				if (funcionarios[i].getMatricula().equals(matricula)) {
					System.out.println("Funcionario " + funcionarios[i].getNome() + " foi removido.");
					funcionarios[i] = null;
					for (ind = i; ind < 49; ind++) {
						if (funcionarios[ind + 1] != null) {
							funcionarios[ind] = funcionarios[ind + 1];
							funcionarios[ind + 1] = null;
						} else {
							this.indice = ind + 1;
						}
					}
				}
			}
		}
	}

	public void exibir() {
		System.out.println("Insira a matrícula do funcionario para exibi-lo.");
		String matricula = scan.nextLine();
		for (int i = 0; i < 50; i++) {
			if (funcionarios[i] != null) {
				if (funcionarios[i].getMatricula().equals(matricula)) {
					funcionarios[i].exibir();
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
