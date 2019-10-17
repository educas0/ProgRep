package ejercicios3;
import java.util.Scanner;

public class U2e19_mediaDeseada {

	public static void main(String[] args) {
		/*
		 * 
    Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación
     para obtener la media deseada. 
     Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.

Ejemplo 1:

Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.

Ejemplo 2:

Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen

		 * */


//J 17 Oct casa		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce nota 1er exámen: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Introduce promedio que deseas tener: ");
		double deseo = input.nextDouble();
		
		double nota2 = ((deseo - (nota1*0.4))/0.6);
				
		System.out.println("Para tener un promedio de " + deseo + " necesitas sacar un " + nota2 + " en el segundo exámen." );
		 input.close();
	}

}
