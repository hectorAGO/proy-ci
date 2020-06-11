import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora ca;
	Calculadora2 calculadora2;
	
	@BeforeEach
	void beforeEach() {
		ca = new Calculadora();
		List <Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		calculadora2 = new Calculadora2(li);
		
	}
	@Test
	void testSum() {
		assertEquals(2, ca.sum(1, 1));
		assertEquals(0, ca.sum(5, -5));
	}
	@Test
	void testRes() {
		assertEquals(0, ca.res(1, 1));
		assertEquals(10, ca.res(5, -5));
	}
	@Test
	void testMult() {
		assertEquals(1, ca.mult(1, 1));
		assertEquals(-25, ca.mult(5, -5));
		assertEquals(0, ca.mult(2, 0));
	}
	@Test
	void testDiv() {
		assertEquals(5, ca.div(10, 2));
		assertEquals(0, ca.div(5, 0));
		assertEquals(8, ca.div(24, 3));
	}
	@Test
	void testRaiz() {
		assertEquals(4, ca.raizCuadrada(16));
		assertEquals(5, ca.raizCuadrada(25));
		
	}
	@Test
	void testSumatoria() {
		assertEquals(15, calculadora2.sumatoria());
	}
	@Test
	void testMultiplicarLista() {
		assertEquals(120, calculadora2.multiplicarLista());
	}
	@Test
	void testContarIgual() {
		assertEquals(1, calculadora2.contarIgual(1));
	}
	@Test
	void testEliminarRepetidos() {
		Calculadora2 calculadora2;
		List <Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(1);
		li.add(4);
		li.add(1);
		calculadora2 = new Calculadora2(li);
		assertEquals(3, calculadora2.eliminarRepetidos().size());
	}
	@Test
	void testPromedio() {
		assertEquals(3, calculadora2.promedio());
	}
	
	
	

}
