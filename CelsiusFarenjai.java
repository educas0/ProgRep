package septiembre;

import java.util.*;

public class CelsiusFarenjai {

	/*Ejercicio 3 
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
	public static void main(String[] args) {
		
		System.out.println("CONVERTIDOR\nElige 'celsius' o 'farenjai'");
		Scanner input = new Scanner(System.in);
		String opc = input.nextLine();
		
		System.out.println("Introduzca valor a convertir");
		int grados = input.nextInt();
		
		switch(opc) {
		case "celsius" : System.out.println(grados +" Cº son " + (	(grados * 9 / 5) + 32) + " Fº"	);
			break;
		case "farenjai" : System.out.println(grados + " Fº son " + (	(grados - 32) * 5 / 9) + " Cº"	);
				break;
		default : System.out.println("Introduzca válido valor");
		}
		
		

	}

}
