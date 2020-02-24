```java
	

package arrays;

import java.util.concurrent.ThreadLocalRandom;

public class MaxMinResuelto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int maximo = Integer.MIN_VALUE;//Esto no sé que es pero me sirve...
	    int minimo = Integer.MAX_VALUE;//...Para inicializar MIN y mola.
	    int i;
		int size = rnd10();
	    int[] numero = new int[size];
	    
	    for( i = 0; i < numero.length; i++) {//Asignar valores RANDOM al ARRAY
	    	numero[i] = rnd1000();
	        if (numero[i] < minimo) {//asignar MAX y MIN
	            minimo = numero[i];
	          }
	          
	          if (numero[i] > maximo)  {
	            maximo = numero[i];
	          }
	    }
	    
	    System.out.println("Tamaño del ARRAY: " + size);
	    for( i = 0; i < numero.length; i++) {
	    	System.out.print(numero[i] + " | ");
	    }
    	System.out.println("\nMAX: " + maximo + "\tMIN: " + minimo);

		
		
	}
	
	
	static int rnd1000() {
		int rnd = ThreadLocalRandom.current().nextInt(0, 1001);
		return rnd;
	}
	
	static int rnd10() {
		int rnd = ThreadLocalRandom.current().nextInt(2, 11);
		return rnd;
	}

}




``` 