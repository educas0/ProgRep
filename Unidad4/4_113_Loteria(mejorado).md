``` java

package noviembre;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoteriaMejorado {

	public static void main(String[] args) {
		
//4_113_Loteria
		
		//		RANDOM
		int iDecenas = ThreadLocalRandom.current().nextInt(0, 9 +1);
		int iUnidades = ThreadLocalRandom.current().nextInt(0, 9 +1);
		
		String sDecenas = Integer.toString(iDecenas);
		String sUnidades = Integer.toString(iUnidades);
		String sTotal = sDecenas + sUnidades;
		
		int iTotal = Integer.parseInt(sTotal);
		System.out.println("//" + iTotal);
		
		//		USER NUM
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce número de 2 dígitos");
		int iNum = input.nextInt();
		int uiUnidades = iNum % 10;
		iNum = iNum / 10;
		int uiDecenas = iNum % 10;
		
		String usDecenas = Integer.toString(uiDecenas);
		String usUnidades = Integer.toString(uiUnidades);
		String usTotal = usDecenas + usUnidades;
		int uiTotal = Integer.parseInt(usTotal);

		//System.out.println("Su número es:\t\t" + usTotal + "\nEl número premiado es:\t" + iTotal);
		
		
		String premio= "";
		if(uiTotal == iTotal) {//Coinciden los dos
			 premio = "10.000";
			 
		}else if(	(uiDecenas == iDecenas || uiDecenas == iUnidades) 
					&&												//	Mismos números en distinto órden			
					(uiUnidades == iDecenas || uiUnidades == iUnidades)    )
		{
			
			premio = "3.000";
			
		}else if(				
					(
							(uiDecenas == iDecenas || uiUnidades == iUnidades) 
																		//	Un número coincidente
							  
					)
				) 
		{
			premio = "1.000";	
		}else {
			premio = "NADA. Pruebe otra vez...";
		}

		
		System.out.println("Por lo tanto usted ha ganado: " + premio + "€");
		
		
		
		input.close();
		
		
	}

}














```