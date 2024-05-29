package view;
import controller.Caixa;
public class Main {

	public static void main(String[] args) {
		
		Caixa caixaLoja = new Caixa(500);
		
		System.out.println("Novo saldo do caixa após a venda: "+  caixaLoja.venda(50, 10, 13.2) + " reais");
	}

}
