package septiembre;

import java.util.Scanner;

public class MillasKm {

	public static void main(String[] args) {
		/*

	    (Convertir de millas a km): Escribe un programa que lea millas como valor double
	     de la consola y lo convierta en km mostrando el resultado. 
	     La fórmula para la conversión es: 
	     									1 milla = 1.6 km Ejemplo:

	Enter miles: 96 
	96 miles is 153.6 kilometers
*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce valor en Millas pa pasarlo a Kilómetros: ");
		
		double millas = input.nextDouble();
		
		System.out.println( millas + " millas = " + (millas * 1.6) + " kilómetros"  );
		

	}

}
