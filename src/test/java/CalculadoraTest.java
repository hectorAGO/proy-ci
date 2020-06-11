import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora ca;
	@BeforeEach
	void beforeEach() {
		ca = new Calculadora();
	}
	@Test
	void testSum() {
		assertEquals(3, ca.sum(1, 1));
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
	
	

}
