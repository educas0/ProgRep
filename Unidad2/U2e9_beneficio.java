package ejercicios3;
import java.util.Scanner;

public class U2e9_beneficio {

	public static void main(String[] args) {
		/*
		 * 
    (Ejercicio Financiero): Supón que tienes 100€ de beneficio mensual en una cuenta bancaria con un interés anual de 3.75%.
     El interés mensual sería: 0.0375/12 = 0.003125.

    Después del primer mes la ganancia sería: 100 + (0.003125 *100) = 100.3125
    Después del segundo mes sería de: (100.3125 + 100) * ( 1 + .003125) = 200.9384765625

Realiza un programa que calcule y muestre por pantalla el beneficio de los 6 primeros meses. 
De entrada pide el beneficio mensual, ej 100€.
		 */
		
		//RARO MAL
		System.out.println("Introduce beneficio mensual: ");
		Scanner input = new Scanner(System.in);
		
		double uDinero = input.nextDouble();
		System.out.println("Ha elegido un beneficio personal de: " + uDinero + "\n");
		
		double bAnual = 0.0375;
		double bMensual = bAnual/12;
		
		//double mes1 = uDinero + (0.003125 *100);
		//double mes2 = (100.3125 + uDinero) * ( 1 + .003125);
		
		for(int i=1; i < 7; i++) {
			double beneTotal = uDinero + (bMensual * i);
			
			System.out.println("Mes" + i + ":\t" + beneTotal);
			beneTotal += 100;
		}
		
		
	}

}
