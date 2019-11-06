package ejercicios3;

import java.util.Scanner;

public class U2e11_separaNumeros {

	public static void main(String[] args) {
		/*
		 * (Separación de los dígitos en un entero) Escribe una aplicación que reciba del usuario 
		 * un número compuesto por cinco dígitos, que separe ese número en sus dígitos individuales y los imprima,
		 *  cada uno separado de los demás por tres espacios. Por ejemplo, 
		 *  si el usuario escribe el número 42339, el programa debe imprimir
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce  número ");
		int n1 = input.nextInt();
		System.out.println("otro ");
		int n2 = input.nextInt();
		System.out.println("otro");
		int n3 = input.nextInt();
		System.out.println("ya falta menos ");
		int n4 = input.nextInt();
		System.out.println("otro");
		int n5 = input.nextInt();
		
		System.out.println(n1+"   "+n2+"   "+n3+"   "+n4+"   "+n5+"   ");
		
	}

}
