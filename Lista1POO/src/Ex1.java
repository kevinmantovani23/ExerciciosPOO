import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));
		double c = a + b;
		System.out.println("A soma do primeiro numero com o segundo numero e: " + c);
	}

}
