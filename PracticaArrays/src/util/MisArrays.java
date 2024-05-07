package util;
import java.util.Arrays;

public abstract class MisArrays {
	
	/**
	 * Hace la media de los números dentro del array notas.
	 * @param [] notas
	 * @return sumas / notas.length
	 */
	public static float mediaNotas(int[] notas) {
        float suma = 1;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] < 0 || notas[i] > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
            }
        }
        return suma / notas.length;   
    }
	
	/**
	 * Hace la mediana de los números dentro del array notas.
	 * @param [] notas
	 * @return n
	 */
	public static float medianaNotas(int[] notas) {
        Arrays.sort(notas);
        int n = notas.length;
        for (int i = 0; i < notas.length; i++) {
        	if (notas[i] < 0 || notas[i] > 10) {
        		throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
            }
        }
        for (int i = 1; i < notas.length; i++) {
        	if (n % 2 == 0) {
            	return (notas[n / 2 - 1] + notas[n / 2]) / 2;
        	} else {
            	return notas[n / 2];
        	}
        }
		return n;
    }
	
	/**
	 * Obtiene el valor maximo dentro del array notas.
	 * @param [] notas
	 * @return max
	 */
	public static int maximaNota(int[] notas) {
	        int max = 0;
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] > max) {
	                max = notas[i];
	            }
	            if (notas[i] < 0 || notas[i] > 10) {
	                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
	            }
	        }
	        return max;
	}

	/**
	 * Obtiene el valor minimo dentro del array notas.
	 * @param [] notas
	 * @return min
	 */
	public static int minimaNota(int[] notas) {
	        int min = 0;
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] < min) {
	                min = notas[i];
	            }
	            if (notas[i] < 0 || notas[i] > 10) {
	                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
	            }
	        }
	        return min;
	}
}
