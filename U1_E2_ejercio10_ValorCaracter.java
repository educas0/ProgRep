package e2u1;

public class U1_E2_ejercio10_ValorCaracter {

	public static void main(String[] args) {
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

	}

}
