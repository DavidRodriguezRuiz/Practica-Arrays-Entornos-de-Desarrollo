package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class medianaNotas {

	static int[] n1 = {5, 5, 5, 5, 5};
	static int[] n2 = {4, 4, 4, 4, 4};
	static int[] n3 = {82, -2, 10, 843, 95};
	
	@BeforeAll
	static void setup() throws Exception {
		n1 = new int[5];
		n2 = new int[5];
		n3 = new int[5];
	}
	
	@Test
	void testMedianaNotas1() {
		float MedianaEsperada = 5;
		float MedianaObtenida = MisArrays.medianaNotas(n1);
		assertEquals(MedianaEsperada, MedianaObtenida);
	}
	
	@Test
	void testMedianaNotas2() {
		float MedianaEsperada = 4;
		float MedianaObtenida = MisArrays.medianaNotas(n2);
		assertEquals(MedianaEsperada, MedianaObtenida);
	}
	
	@Test
	void testMedianaNotas3() {
		assertThrows(IllegalArgumentException.class, () -> {
			 MisArrays.mediaNotas(n3);
	     });
	}
	
}
