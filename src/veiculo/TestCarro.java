package veiculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCarro {
	Carro c = new Carro(10, 0, "Fusca");
	
	@Test
	void DefaultCar() {
		assertEquals(0, c.getVelocidade());
		assertEquals(10, c.getPocentia());
		assertEquals("Fusca", c.getNome());
	}
	@Test
	void AccelerateCar() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
		c.acelerar();
		c.acelerar();
		assertEquals(30, c.getVelocidade());
	}
	@Test
	void DessaccelerateCar() {
		c.velocidade = 30;
		c.frear();
		assertEquals(15, c.getVelocidade());
		c.frear();
		assertEquals(7, c.getVelocidade());
	}

}

