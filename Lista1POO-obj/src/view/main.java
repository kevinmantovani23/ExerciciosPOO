package view;

import obj.Aluno;
import obj.Armario;
import obj.Carro;
import obj.Empresa;

public class main {
	
	double numOuro = 1.61803;
	public static void main(String[] args) {
		Aluno turma [] = new Aluno [10];
		for (int i = 0; i < 10; i++) {
			turma [i] = new Aluno ();
		}
		
		Carro carro = new Carro("321-X1", "12345", "Nissan GTR", "2014", "Azul", "José", true);
		
		Empresa empresa = new Empresa("Fatec ZL");
				
		Armario armario = new Armario (2);
		
		
	}

}
