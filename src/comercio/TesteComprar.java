package comercio;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComprar {

	@Test
	void compraAVista() {
		Compra c = new Compra(500);
		
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorParcelas());
		assertEquals(500, c.getValorTotal());		
	}
	
	@Test
	void compraParcelado() {
		Compra c = new Compra(4, 250);
		
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(250, c.getValorParcelas());
		assertEquals(1000, c.getValorTotal());		
	}

}
