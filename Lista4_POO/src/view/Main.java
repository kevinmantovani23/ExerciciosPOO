package view;
import controller.*;
public class Main {

	public static void main(String[] args) {
		Aeronave aviao1 = new Aeronave("Blue", 2010, "Boeing");
		Aeronave aviao2 = new Aeronave("Yamaha", 2020, "Boeing");
		Passageiro pa1 = new Passageiro("Joao", 20, "4210239021", "299103", "19/02/2023 20:00", "economico");
		Passageiro pa2 = new Passageiro("Joana", 32, "3139942010", "291930", "19/02/2023 19:00", "executivo");
		Piloto p1 = new Piloto("Wilson", 39, "3941230012", "992130");
		Piloto p2 = new Piloto("Jonas", 40, "2939431230", "923910");
		Aeroporto aero1 = new Aeroporto("Aeroporto de guarulhos", "Guarulhos, SP", 20);
		Aeroporto aero2 = new Aeroporto("Aeroporto de Congonhas", "São Paulo, SP", 15);

	}

}
