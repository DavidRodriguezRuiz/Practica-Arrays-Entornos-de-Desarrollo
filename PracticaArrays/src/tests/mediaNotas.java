package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class mediaNotas {

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
	void testMediaNotas1() {
		float MediaEsperada = 5;
		float MediaObtenida = MisArrays.mediaNotas(n1);
		assertEquals(MediaEsperada, MediaObtenida);
	}
	
	@Test
	void testMediaNotas2() {
		float MediaEsperada = 4;
		float MediaObtenida = MisArrays.mediaNotas(n2);
		assertEquals(MediaEsperada, MediaObtenida);
	}
	
	@Test
	void testMediaNotas3() {
		 assertThrows(IllegalArgumentException.class, () -> {
			 MisArrays.mediaNotas(n3);
	     });
	}
	
}
