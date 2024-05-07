package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class minimaNota {

	static int[] n1 = {9, 5, 6, 2, 3};
	static int[] n2 = {7, 1, 3, 4, 5};
	static int[] n3 = {82, -2, 10, 843, 95};
	
	@BeforeAll
	static void setup() throws Exception {
		n1 = new int[5];
		n2 = new int[5];
		n3 = new int[5];
	}
	
	@Test
	void testMinimoNotas1() {
		int MinimaEsperada = 2;
		int MinimaObtenida = MisArrays.minimaNota(n1);
		assertEquals(MinimaEsperada, MinimaObtenida);
	}
	
	@Test
	void testMinimoNotas2() {
		int MinimaEsperada = 1;
		int MinimaObtenida = MisArrays.minimaNota(n2);
		assertEquals(MinimaEsperada, MinimaObtenida);
	}
	
	@Test
	void testMinimoNotas3() {
		assertThrows(IllegalArgumentException.class, () -> {
			 MisArrays.mediaNotas(n3);
	     });
	}
	
}
