package ejercicios3;
import java.util.*;

public class Ejercios3 {

	public static void main(String[] args) {
		// Pasa de Fª a Cº y viversa
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Elige tipo de conversión:\n1. Celsius\n2. Farenjai");
		String tipoGrado = input.nextLine();
		
		System.out.println("indique valor a convertir: ");
		float fValor = input.nextFloat();
		
		switch(tipoGrado) {
		
			case "1" : 
				System.out.println("Ha elegido Celsius");
				System.out.println(fValor + "Cº son " + ( (fValor  * 9 / 5) + 32 ) + "Fº");
				break;
				
			case "celsius": System.out.println("Ha elegido Celsius");
			System.out.println(fValor + "Cº son " + ( (fValor  * 9 / 5) + 32 ) + "Fº");
			break;
	
			case "2" : System.out.println("Ha elegido Farenjai");
			System.out.println(fValor + "Fº son " + ( (fValor - 32) * 5 / 9 ) + "Cº");
			break;
			case "farenjai": System.out.println("Ha elegido Farenjai");
			System.out.println(fValor + "Fº son " + ( (fValor - 32) * 5 / 9 ) + "Cº");	
			break;
	
			default : System.out.println("No ha seleccionado valor correcto");
			
			break;

		}
		input.close();
		
		
		

	}

}
