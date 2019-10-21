package test1;

import java.util.Scanner;

public class Septiembre {

	public static void main(String[] args) {
		// Ejercicios2 Unidad1
		
		/* Ejercicio 7 
		 * 
		 * (Comparación de enteros) Escriba una aplicación que pida al usuario que 
		 * escriba dos enteros, que obtenga los números del usuario 
		 * y muestre el número más grande, seguido de las palabras “es más grande”. 
		 * Si los números son iguales, imprima el mensaje “Estos números son iguales”.
		 */
		
		Scanner miScan = new Scanner (System.in);
		/*
		System.out.println("Introduse un nómero: ");
		
		int n1 = miScan.nextInt();
		
		System.out.println("Introduse otro nómero: ");
		
		int n2 = miScan.nextInt();
		
		System.out.println(  Math.max(n1,n2) + " Es más glande :)" );
		*/
		
		/*Ejercici 8
		 * 
		 * (Par o impar) Escriba una aplicación que lea un entero y que determine 
		 * e imprima si es impar o par [sugerencia: use el operador residuo. 
		 * Un número par es un múltiplo de 2. Cualquier múltiplo de 2 
		 * deja un residuo de 0 cuando se divide entre 2]
		 * */
		
		/*
		 * 		Scanner miScan = new Scanner (System.in);

		System.out.println("Mete el núm, crack");
		int nPar = miScan.nextInt();
		
		if( (nPar%2)==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		*/
		
		/*Ejerccio 9
		 * 
		(Múltiplos) Escriba una aplicación que lea dos enteros,
		 determine si el primero es un múltiplo del segundo 
		 e imprima el resultado. [Sugerencia: use el operador residuo].
		 * */
		/*
		System.out.println("Introdusca númeró unó");
		int no1 = miScan.nextInt();
		
		System.out.println("Untrodusa sekundo nómero");
		int no2 = miScan.nextInt();
		
		int resto = no1%no2;
		
		if( resto == 0  ) {
			System.out.println(no1 + " y " + no2 + " son múltiplos");
		}else {
			System.out.println("No se son múltiplos");
		}
		*/
		
		/* Ejersisio 10
		 * 
		 * (Valor entero de un carácter) Java puede también representar letras en mayúsculas, 
		 * en minúsculas y en una considerable variedad de símbolos especiales. 
		 * Cada carácter tiene su correspondiente representación entera. 
		 * El conjunto de caracteres que utiliza una computadora, 
		 * junto con las correspondientes representaciones enteras de esos caracteres, 
		 * se conocen como el conjunto de caracteres de esa computadora. 
		 * Usted puede indicar un valor de carácter en un programa 
		 * con sólo encerrar ese carácter entre comillas sencillas, 
		 * como en ‘A’.

		Usted puede determinar el equivalente entero de un carácter si antepone a ese carácter 
		la palabra (int), como en(int) 'A'
		Esta forma se conoce como operador de conversión de tipo (casting). 
		La siguiente instrucción imprime un carácter y su equivalente entero:

		System.out.printf( “El caracter %c tiene el valor %d%n”, ‘A’, ((int) ‘A’));

		Cuando se ejecuta esta instrucción, 
		muestra el carácter A y el valor 65 (del conjunto de caracteres conocido como Unicode® 
		como parte de la cadena. El especificador de formato %c es un receptáculo 
		para un carácter (en este caso, elcarácter 'A').
		Utilizando instrucciones similares a la mostrada anteriormente en este ejercicio, 
		escriba una aplicación que muestre los equivalentes enteros 
		de algunas letras en mayúsculas, en minúsculas, dígitos y símbolos especiales. 
		Muestre los equivalentes enteros de los siguientes caracteres: 
		A B C a b c 0 1 2 $ * + / y el carácter en blanco.
		 */
		
		
	
		char n1 = 'A';
		char n2 = 'B';
		char n3 = 'C';
		char n4 = 'a';
		char n5 = 'b';
		char n6 = 'c';
		char n7 = '0';
		char n8 = '1';
		char n9 = '2';
		char n10 = '$';
		char n11 = '*';
		char n12 = '+';
		char n13 = '/';
		
		System.out.println(		n1 + " = " + (int)n1 + "\n"+
								n2 + " = " + (int)n2 + "\n"+
								n3 + " = " + (int)n3 + "\n"+
								n4 + " = " + (int)n4 + "\n"+
								n5 + " = " + (int)n5 + "\n"+
								n6 + " = " + (int)n6 + "\n"+
								n7 + " = " + (int)n7 + "\n"+
								n8 + " = " + (int)n8 + "\n"+
								n9 + " = " + (int)n9 + "\n"+
								n10 + " = " + (int)n10 + "\n"+
								n11 + " = " + (int)n11 + "\n"+
								n12+ " = " + (int)n12 + "\n"+
								n13 + " = " + (int)n13 + "\n");

		







		
		
		miScan.close();
	}

}
