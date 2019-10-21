package septiembre;

import java.util.Scanner;

public class LongTriangulo {

	public static void main(String[] args) {
		/*5. (Volumen de un triángulo) Escribe un programa que lee la longitud 
		 * de los lados de un triángulo equilátero y calcula el area y 
		 *  volumen utilizando las siguientes fórmulas:
		 *  
Area = ( Sqrt(3) / 4 ) * lado^2

Volumen = area * longitud (todos los lados)

 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduse base: ");
		double base = input.nextDouble();
		
		System.out.println("Introduse altura: ");
		double altura = input.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("El área es: " + area);
		
				 

		
		
	}

}
