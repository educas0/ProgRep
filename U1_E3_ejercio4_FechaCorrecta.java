package e2u1;

import java.util.Scanner;

public class U1_E3_ejercio4_FechaCorrecta {

	public static void main(String[] args) {
		/*	E2)
		 * Pedir el día, mes y año (todos datos enteros) de una fecha e indicar si la fecha es correcta.
		 *  Suponiendo que todos los meses son 30 días. 
		 *  Los años parten desde el año 1,
		 *   menores son incorrectos.
		 * */
		
		Scanner miScan = new Scanner(System.in);
		
		System.out.println("A ver si metes la fecha correcta");
		int valido;
		
		System.out.println("Dame día");
		int dia = miScan.nextInt();
		
		System.out.println("Dame mes");
		int mes = miScan.nextInt();
		
		System.out.println("Dame año");
		int ano = miScan.nextInt();
		
		if( dia > 30|| 
			dia < 1 ||
			mes < 1 ||
			mes >12 ||
			ano < 1 ||
			ano > 2020) {
			System.out.println("MAL");
			valido = 0;
		}else {
			System.out.println("BIEN");
			valido = 1;	
		}
		
		
	validar(valido);

		
		}

		private static void validar(int v) {
			
					if(v == 0) {
				System.out.println("La cagaste!!!");
			}else {
				System.out.println("Fetén.");
			}
					
		System.out.println("\t\t\t\tvalido = " + v);	
		

	}

}
