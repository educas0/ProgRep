package e2u1;

import java.util.Scanner;

public class U1_E3_ejercicio3_PasarGrados {

	public static void main(String[] args) {
		/*Ejercicio 3 U2E3??
		 *Escribe un programa que realice el cambio de ºC a ºF y viceversa.
		 * El programa debe preguntar por si el usuario quiere Celsius o Fahrenheit. 
		 * El programa debe verificar que si el usuario introduce por teclado "Celsius" 
		 * debe luego preguntar por el número y calcular y mostrar en pantallas la conversión a ºF. 
		 * De forma análoga si el usuario introduce "Fahr" para comprobar que 
		 * el usuario quiere de ºF a ºC.

	La fórmula es C = (5/9) * (F * 32). Despeja la F para poder calcular los ºF.

	Ejemplo de salida:

	#### Conversión ºF a ºC / ºC a ªF
	>Escriba 0 si quiere convertir de ºF a ºC y escriba 1 si quiere pasar de ºC a ºF.
	0
	> Ha elegido pasar de ºF a ºC, escriba el número de ºF?
	70º
	> La conversión de 77 ºF son 25 ºC.
	(1 °C × 9 / 5) + 32 = 33,8 °F
	(1 °F − 32) × 5 / 9 = -17,22 °C
		 * */
		float cGOf;
		float fGOc;
		String sSys;
		
		System.out.println("Escribe sistema favorito\n1. CELSIUS\n2. FARENJAI");
		Scanner input = new Scanner(System.in);
		String sOPC = input.nextLine();
		
		/*switch(sOPC) {
		case  "celsius": 	
				
				 break; 
		case "farenjai" :
			  		break;
		}*/
		
		System.out.println("Introduse valor: ");
		float fOPC = input.nextFloat();
		
		switch(sOPC) {
			case "celsius" : cGOf = (fOPC * 9 / 5) + 32;
								sSys= " Fº";
								System.out.println(cGOf + sSys);
							break;
			case "farenjait" : fGOc= (fOPC - 32) * 5 / 9;
								sSys = " Cº";
								System.out.println(fGOc + sSys);
							break;
		}
		System.out.println("\nFinalisando pograma...");

	}

}
