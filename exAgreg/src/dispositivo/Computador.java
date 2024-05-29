package dispositivo;

public class Computador {
	private String dataMontado;
	private int garantia;
	private PlacaMae placa;
	private Led led;
	
	public Computador(String dataMontado, int garantia, PlacaMae placa, Led led) {
		this.dataMontado = dataMontado;
		this.garantia = garantia;
		this.placa = placa;
		this.led = led;
	}
	
	public Computador() {
	}

	public String getDataMontado() {
		return dataMontado;
	}

	public void setDataMontado(String dataMontado) {
		this.dataMontado = dataMontado;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public PlacaMae getPlaca() {
		return placa;
	}

	public void setPlaca(PlacaMae placa) {
		this.placa = placa;
	}

	public Led getLed() {
		return led;
	}

	public void setLed(Led led) {
		this.led = led;
	}
	
	
	
}
