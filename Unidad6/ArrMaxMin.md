```java
	

package arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrMaxMin {//FALLA EL MIN

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		Scanner input = new Scanner(System.in);
		int i = 0;
		int max = arr[0];
		int min = arr[0];//FALLA
		
		System.out.println("Introduzca 5 números: ");
		
		
		
		for( i = 0; i < arr.length; i++) {
			
			//int v = input.nextInt();
			int v = rnd();
			arr[i] = v;

			if(v > max ) {
				max = arr[i];
			}
			if (v < min){
				
				min = arr[i];//ALGO FALLA
			}
			
			
			
			
		}
		
		for( i = 0; i < arr.length; i++) {
				System.out.print(" | " + arr[i] + " | ");
			}
			System.out.println("\nMAX: " + max +"\t"+ "MIN: "+ min);
		
	}
	
	static int rnd() {
		int rnd = ThreadLocalRandom.current().nextInt(0, 1001);
		return rnd;
	}

}



``` 