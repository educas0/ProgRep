package test1;

import java.util.Scanner;

public class Ej2U1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		
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
		
		*/
		
		
		/* ejercicio 6
		 * (Cálculo trayecto del automóvil) Escriba una aplicación que calcule el coste del trayecto de un automóvil:

    Total de kilómetros conducidos por trayecto
    Costo por litro de gasolina/diesel.
    Número litros/100km.

		 * */
		
		
		
		int km;
		int litro;
		int diesel;
		
		Scanner miScan = new Scanner(System.in);
		
		System.out.println("Introduce kilómetros recorridos: ");
		
		km = miScan.nextInt();
		
		System.out.println("Introduce litros consumidos por");
		
		litro = miScan.nextInt();
		
		
		int costo = litro * km;
		
		System.out.println("El costo es de " + costo + " €udros.");
		
		
		
		
		
	}

}
