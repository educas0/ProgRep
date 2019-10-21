package e2u1;

import java.util.Scanner;

public class U1_E3_ejercicio1_Nota {

	public static void main(String[] args) {
		Scanner miScan = new Scanner(System.in);
		
		/* Ejercicio 3 U1
		 * 
		 * E1)
		 * Pedir una nota de 0 a 10 y que muestre el mensaje de la denominación de la calificación 
		 *
		 * */
		
		
		System.out.println("Introduce nota: ");
		
		int nota = miScan.nextInt();
		
		if ( nota > 8 ) {
			System.out.println("Eres superdotao");
		}else if( nota > 6 ){
			System.out.println("Eres notable");
		}else if( nota > 4 ) {
			System.out.println("Sos medicre");
		}else if ( nota > 3 ) {
			System.out.println("Suspenso!");
		}else {
			System.out.println("retrasao!");
		}
		

	}

}
