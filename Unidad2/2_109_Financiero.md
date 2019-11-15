``` java 
package noviembre;
import java.util.Scanner;

public class Basura {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca beneficio mensual: ");
		double entraMes = 100;// input.nextDouble();
		
		double intAnual = 0.0375;//3.75%
		double intMes = intAnual/12;//0.003125
		
		double mes1 = entraMes + (entraMes * intMes);
		System.out.println("Beneficio del mes " + 1 + " es: " + mes1);
		double mes2 = (mes1 + entraMes) *  (1 + intMes);
		System.out.println("Beneficio del mes " + 2 + " es: " + mes2);
		double mes3 = (mes2 + entraMes) *  (1 + intMes);
		System.out.println("Beneficio del mes " + 3 + " es: " + mes3);
		double mes4 = (mes3 + entraMes) *  (1 + intMes);
		System.out.println("Beneficio del mes " + 4 + " es: " + mes4);
		double mes5 = (mes4 + entraMes) *  (1 + intMes);
		System.out.println("Beneficio del mes " + 5 + " es: " + mes5);
		double mes6 = (mes5 + entraMes) *  (1 + intMes);
		System.out.println("Beneficio del mes " + 6 + " es: " + mes6);
	}
}
```