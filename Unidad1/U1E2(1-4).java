package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
		
		/*
		int a = 8;
		int b = 4;
		int c;
		System.out.printf("hola te comento que %d más %d es igual a  %d", 5,7,a + b );
		

		
		
		//Ejercicios 2 Unidad 1
		
		//E1
		/*(Aritmética) Escriba una aplicación que pida al usuario que escriba dos números,
		 *  que obtenga los números del usuario e imprima
		 *  la suma, producto, diferencia y cociente (división) de los números.
		*/
		/*
		
		Scanner miScan = new Scanner(System.in);
		
		System.out.println("\n\nEscriba 2 números");

		int n1 = miScan.nextInt();
		int n2 = miScan.nextInt();
		
		System.out.printf("La suma entre %d y %d es %d\n", n1, n2, n1+n2);
		System.out.printf("El producto de %d y %d es %d\n", n1, n2, n1*n2);
		System.out.printf("La divisió entre %d y %d es %d\n", n1, n2, n1/n2);
		*/
		
		//ej 2
		/*
	    double r = 5;
	    double pi = 3.1416;
	    double diametro = 2*r;
	    double circunferencia = 2*pi*r;
	    double area = pi*r*2;
	    
	    
	      System.out.printf("Radio %f\nPI %f\nDiámetro %f\nCircunferencia %f\nÁrea %f\n\n"
	      , r, pi, diametro, circunferencia, area);
		*/
		
		//ej3
			/*Ejercicio 3
(Aritmética: menor y mayor) Escriba una aplicación que reciba tres enteros del usuario 
y muestre la suma, promedio, producto, menor y mayor de esos números.
*/
	/*	
		int nu1 = 4;
		int nu2 = 2;
		int nMax = Math.max(nu1, nu2);
		int nMin = Math.min(nu1, nu2);
		System.out.printf("El número %d es superior a %d", nMax, nMin);
					
	*/	
		
		/*
		 * ejercicio 4 
		 
		 (Tabla de cuadrados y cubos) Escriba una aplicación que calcule los cuadrados y cubos de los números del 0 al 10, 
		y que imprima los valores resultantes en formato de tabla*/

		/*
    	System.out.println("Num.base\tCuadrados\tCubos\n");
		
		for(int i=0; i<11; i++) {
		    
	    //System.out.println(i);
	    
		System.out.printf("%d\t%d\t%d\n", i, i*i, i*i*i);
		}
		*/
		
		// ejercicio 5
		
		/*
		 * Cree una calculadora del BMI que lea el peso del usuario 
		 * BMI =  pesoEnKilogramos  / ( alturaEnMetros × alturaEnMetros )
		 * VALORES DE BMI
			Bajo peso: menos de 18.5
			Normal: entre 18.5 y 24.9
			Sobrepeso: entre 25 y 29.9
			Obeso: 30 o más
		 */
		
		Scanner miScan = new Scanner(System.in);
		
		
		System.out.println("Introduzca Altura ");
		int iAlt = miScan.nextInt();
		
		System.out.println("Introduzca peso");
		int iPes = miScan.nextInt();
		
		int BMI = iPes / (iAlt*iAlt);
		
		System.out.println(BMI);
		
		if(BMI > 29) {
			System.out.println("Estás hecho una foca");
		}else if(BMI > 24) {
			System.out.println("Tas gordete");
		}else if (BMI > 18) {
			System.out.println("Estás fetén");
		}else {
			System.out.println("Tu existencia está en entredicho");
		}
		miScan.close();
		
		
		
		
		
	}

}
   