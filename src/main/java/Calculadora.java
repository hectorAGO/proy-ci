
public class Calculadora {
	/***
	 * Clase simple de una calculadora 
	 */
	public Calculadora() {	
	}
	/**
	 * Metodo que realiza una suma entre x e y
	 * @param x
	 * @param y
	 * @return
	 */
	
	public int sum(int x, int y) {
		return x+y;
	}
	/**
	 * Metodo que realiza una resta entre x e y
	 * @param x
	 * @param y
	 * @return
	 */
	public int res(int x, int y) {
		return x-y;
	}
	/**
	 * Metodo que realiza una multipicacion entre x e y
	 * @param x
	 * @param y
	 * @return
	 */
	public int mult(int x, int y) {
		return x*y;
	}
	/**
	 * Metodo que realiza una division entre x e y
	 * @param x
	 * @param y
	 * @return
	 */
	public double div(int x, int y) {
		if(y==0) {
			System.out.println("No se puede dividir entre cero");
			return 0;
		}
        else {
        	return (double)(x/y);
        }
	}
	/**
	 * Metodo que saca la raiz cuadrada de un numero dado
	 * @param x
	 * @return
	 */
	public double raizCuadrada(int x) {
		return Math.sqrt((double)x);
	}
	

}
