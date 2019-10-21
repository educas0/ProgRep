package e2u1;

import java.util.Scanner;

public class U1_E2_ejercicio7_ComparaEnteros {

	public static void main(String[] args) {
		/* Ejercicio 7 
		 * 
		 * (Comparación de enteros) Escriba una aplicación que pida al usuario que 
		 * escriba dos enteros, que obtenga los números del usuario 
		 * y muestre el número más grande, seguido de las palabras “es más grande”. 
		 * Si los números son iguales, imprima el mensaje “Estos números son iguales”.
		 */
		
		Scanner miScan = new Scanner (System.in);
		
		System.out.println("Introduse un nómero: ");
		
		int n1 = miScan.nextInt();
		
		System.out.println("Introduse otro nómero: ");
		
		int n2 = miScan.nextInt();
		
		System.out.println(  Math.max(n1,n2) + " Es más grande :)" );
		
		
	}

}
