package dispositivo;

public class PlacaMae {
	private String modelo;
	private String fabricante;
	
	public PlacaMae(String modelo, String fabricante) {
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public PlacaMae() {
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
}
