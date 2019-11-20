``` java
package noviembre;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

	public static void main(String[] args) {
		
//4_113_Loteria
		Scanner input = new Scanner(System.in);
		
		int uiDecenas = input.nextInt();
		int uiUnidades = input.nextInt();
		String usDecenas = Integer.toString(uiDecenas);
		String usUnidades = Integer.toString(uiUnidades);
		String usTotal = usDecenas + usUnidades;
		int uiTotal = Integer.parseInt(usTotal);
		
		
		int iDecenas = ThreadLocalRandom.current().nextInt(0, 9 +1);
		int iUnidades = ThreadLocalRandom.current().nextInt(0, 9 +1);
		
		String sDecenas = Integer.toString(iDecenas);
		String sUnidades = Integer.toString(iUnidades);
		String sTotal = sDecenas + sUnidades;
		
		int iTotal = Integer.parseInt(sTotal);
		
		System.out.println("Su número es:\t" + usTotal + "\nEl número premiado es:\t" + iTotal);
		
		
		int premio=0;
		if(uiTotal == iTotal) {
			 premio = 10000;
			 
		}else if(	(uiDecenas == iDecenas || uiDecenas == iUnidades) 
					&&
					(uiUnidades == iDecenas || uiUnidades == iUnidades)    )
		{
			
			premio = 3000;
			
		}else if(	
				
					(		(uiDecenas == iDecenas || uiDecenas == iUnidades) 
											||
							(uiUnidades == iDecenas || uiUnidades == iUnidades)   
					)
				
				) 
		{
			premio = 1000;	
		}

		
		System.out.println("Por lo tanto usted ha ganado: " + premio + "€");
		
		
		
		input.close();
		
		
	}

}



```