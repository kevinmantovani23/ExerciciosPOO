package view;

import controll.*;

public class Main {

	public static void main(String[] args) {
		
		Comida arroz = new Comida("Arroz", "salgado", 120, "01/25", 400);
		Comida feijao = new Comida("Feijão", "salgado", 135, "02/25", 250);
		arroz.comer();
		feijao.comer();
		arroz.acabar();
		feijao.estragar();
		arroz.setCalorias(114);
		System.out.println("Calorias do arroz: " + arroz.getCalorias());
		Movel cadeira = new Movel("Cadeira", "madeira", "assento", "marrom", "12/01/2019");
		Movel mesa = new Movel("Mesa", "plástico", "colocar objetos", "branca", "11/11/2016");
		cadeira.utilizar();
		mesa.desmontar();
		cadeira.deteriorar();
		cadeira.setCor("esverdeado");
		System.out.println("Data de fabricação da mesa: " + mesa.getDataFabricacao());
		Pessoa p1 = new Pessoa("João", 1.70, 53, "14/02/2001" , "brasileiro");
		Pessoa p2 = new Pessoa("In TuYung", 1.60, 41, "11/02/2005" , "chinês");
		p1.andar();
		p2.dormir();
		p1.rir();
		
	}

}
