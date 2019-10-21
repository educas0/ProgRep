package e2u1;

import java.util.Scanner;

public class U1_E2_ejercicio8_ParImpar {

	public static void main(String[] args) {
		/*Ejercici 8
		 * 
		 * (Par o impar) Escriba una aplicación que lea un entero y que determine 
		 * e imprima si es impar o par [sugerencia: use el operador residuo. 
		 * Un número par es un múltiplo de 2. Cualquier múltiplo de 2 
		 * deja un residuo de 0 cuando se divide entre 2]
		 * */
		
		 	Scanner miScan = new Scanner (System.in);

		System.out.println("Mete el núm, crack");
		int nPar = miScan.nextInt();
		
		if( (nPar%2)==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		

	}

}
