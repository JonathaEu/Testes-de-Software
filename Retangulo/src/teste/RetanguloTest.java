package teste;
import dominio.Retangulo;
import static org.junit.Assert.*;
import org.junit.Test;

public class RetanguloTest {
	
	@Test
	public void testCalcularArea() {
		Retangulo cal = new Retangulo(5,2);
		assertEquals(10, cal.calcularArea(), 0);
	}
	
	@Test
	public void testCalcularPerimetro() {
		Retangulo cal = new Retangulo(5,2);
		assertEquals(14, cal.calcularPerimetro(), 0);
	}
}
