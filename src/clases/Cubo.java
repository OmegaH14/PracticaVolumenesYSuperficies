package clases;

public class Cubo {
	
	private int lado;
	
	/*
	 * @Constructor base cuyo lado es 1
	 */
	public Cubo() {
		this.lado = 1;
	}
	
	/*
	 * @param int lado
	 */
	public Cubo(int lado) {
		this.lado = lado;
	}
	
	/*
	 * @Return superficie = lado * lado * 6
	 */
	public int superficie() {
		return this.lado * this.lado * 6;
	}
	
	/*
	 * @Return volumen = lado * lado * lado
	 */
	public int volumen() {
		return this.lado * this.lado * this.lado;
	}
}
