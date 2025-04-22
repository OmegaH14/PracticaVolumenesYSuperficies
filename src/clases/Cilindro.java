package clases;

public class Cilindro {
	private int radio, altura;
	
	/*
	 * Constructor base cuyo radio y altura es 1
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	
	/*
	 * param int radio, int altura
	 */
	public Cilindro(int radio, int altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	/*
	 * Return superficie = 2 * Math.PI * radio * radio + 2 * Math.PI * radio * altura
	 */
	public double superficie() {
		return ((2 * Math.PI * this.radio * this.radio) + (2 * Math.PI * this.radio * this.altura));
	}
	
	/*
	 * Return volumen = Math.PI * radio * radio
	 */
	public double volumen() {
		return Math.PI * this.radio * this.radio;
	}
}
