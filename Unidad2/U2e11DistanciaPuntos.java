package ejercicios3;

import java.util.Scanner;

public class U2e11DistanciaPuntos {

	public static void main(String[] args) {
		/*Ejercicio 11
		 * Crea un un programa que pida dos puntos por teclado (x1, x2) e (y1, y2) 
		 * y muestre la distancia de ambos puntos. 
		 * La fórmula utilizada es sqrt((x2 - x1)^2 + (y2-y1)^2)) .
		 * El símbolo sqrt es raíz cuadrada y ^ es el exponente. 
		 * Se pueden utilizar la funciones Math.pow y Math.sqrt.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce 2 valores para obtejer un punto en el espacio: ");
		int x1 = input.nextInt();
		System.out.println("Introduce 2 valores para obtejer un punto en el espacio again: ");
		int x2 = input.nextInt();
		
		System.out.println("Introduce 2 valores para obtejer un punto en el espacio: ");
		int y1 = input.nextInt();
		System.out.println("Introduce 2 valores para obtejer un punto en el espacio again: ");
		int y2 = input.nextInt();
		
		
		//double resul = Math.pow(sqrt((x2 - x1),2) + Math.pow((y2-y1));

		int resul =  ( x2 - x1 )*(x2 -x1) + ( y2 - y1 ) * (y2 - y1)			;
		System.out.printf("La distancia entre (%d,%d) y (%d,%d) es de %d", x1,x2,y1,y2,resul);
		
	}

}
