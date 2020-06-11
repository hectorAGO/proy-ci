import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Calculadora2 {
	/**
	 * Esta clase calcula en base a una lista 
	 */
	private List<Integer> _lista;

	public Calculadora2(List<Integer> lista) {
		_lista = lista;
	}
	 /**
	  * Metodo que suma todos los elementos de una lista
	  */
	public int sumatoria() {
		return _lista.stream().reduce(0, (x1 , x2) -> x1 + x2);
	}
	/**
	 * Metodo que multiplica todos los elementos de una lista
	 * @param args
	 */
	public int multiplicarLista() {
		return _lista.stream().reduce(1, (x1 , x2) -> x1 * x2);
	}
	/**
	 * Metodo que cuenta cuantos numero iguales hay de un numero dado
	 * @param args
	 */
	public int contarIgual(int x) {
		return Collections.frequency(_lista, x);
	}
	/**
	 * Metodo que elimina los repetidos de una lista
	 * @param args
	 */
	public List<Integer> eliminarRepetidos(){
		return _lista.stream().distinct().collect(Collectors.toList());
	}
	/**
	 * Metodo que saca el promedio de una lista de int
	 * @param args
	 */
	public double promedio() {	
		return _lista.stream().reduce(1,(x1 , x2) -> x1 + x2)/_lista.size();
	}
}
