```java

package noviembre;
import java.util.Scanner;

public class Chino {

	public static void main(String[] args) {
		
//4_114 horóscopo chino
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce año: ");
		int ano =  input.nextInt();
		
		
		int num = ano % 12;
		System.out.println(num);
		

		
		switch (num) {
		  case 0:
		    System.out.println("Mono");
		    break;
		  case 1:
			    System.out.println("Gallo");
			    break;
		  case 2:
		    System.out.println("Perro");
		    break;
		  case 3:
		    System.out.println("Cerdo");
		    break;
		  case 4:
		    System.out.println("Rata");
		    break;
		  case 5:
		    System.out.println("Buey");
		    break;
		  case 6:
		    System.out.println("Tigre");
		    break;
		  case 7:
		    System.out.println("Conejo");
		    break;
		  case 8:
			    System.out.println("Dragón");
			    break;
		  case 9:
			    System.out.println("Serpiente");
			    break;
		  case 10:
			    System.out.println("Caballo");
			    break;
		  case 11:
			    System.out.println("Oveja");
			    break;
		 default: System.out.println("Umpa Lumpa");
		}
		
	}

}

```