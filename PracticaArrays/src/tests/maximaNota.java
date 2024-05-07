package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class maximaNota {

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
	void testMaximoNotas1() {
		int MaximaEsperada = 9;
		int MaximaObtenida = MisArrays.maximaNota(n1);
		assertEquals(MaximaEsperada, MaximaObtenida);
	}
	
	@Test
	void testMaximoNotas2() {
		int MaximaEsperada = 7;
		int MaximaObtenida = MisArrays.maximaNota(n2);
		assertEquals(MaximaEsperada, MaximaObtenida);
	}
	
	@Test
	void testMaximoNotas3() {
		assertThrows(IllegalArgumentException.class, () -> {
			 MisArrays.mediaNotas(n3);
	     });
	}
	
}
