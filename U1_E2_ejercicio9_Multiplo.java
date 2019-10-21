package e2u1;

import java.util.Scanner;

public class U1_E2_ejercicio9_Multiplo {

	public static void main(String[] args) {
		/*Ejerccio 9
		 * 
		(Múltiplos) Escriba una aplicación que lea dos enteros,
		 determine si el primero es un múltiplo del segundo 
		 e imprima el resultado. [Sugerencia: use el operador residuo].
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introdusca númeró unó");
		int no1 = input.nextInt();
		
		System.out.println("Untrodusa segundo nómero");
		int no2 = input.nextInt();
		
		int resto = no1%no2;
		
		if( resto == 0  ) {
			System.out.println(no1 + " y " + no2 + " Son múltiplos");
		}else {
			System.out.println("No son múltiplos");
		}
		

	}

}
