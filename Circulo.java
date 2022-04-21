package MiCodigo;

public class Circulo {
	private double radio;
	private ParejaNumeros coordenadasCentro;
	
	public Circulo(double radio,double centro_x,double centro_y) {
		this.setRadio(radio);
		coordenadasCentro=new ParejaNumeros(centro_x,centro_y);
	}
	
	double devuelveArea(){
		double area;
		area=(double)(Math.PI*getRadio()*getRadio());
		return (area);
		
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * @return the coordenadasCentro
	 */
	public ParejaNumeros getCoordenadasCentro() {
		return coordenadasCentro;
	
	}
	/**
	 * @param radio the radio to set
	 */
	public void setCoordenadasCentro(ParejaNumeros coordenadasCentro) {
		this.coordenadasCentro=coordenadasCentro;
	}
	public double getCoordenadaCentroX() {
		return(coordenadasCentro.getNum1());
	}
	public double getCoordenadaCentroY() {
		return(coordenadasCentro.getNum2());
	}
}

