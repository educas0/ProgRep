```java
package arraysFebrero;

import java.util.concurrent.ThreadLocalRandom;

public class ParesLuegoImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = rnd();
		int[] arr = new int[size];
		
		 int  cPares = 0; 
		 int cImpares = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rnd();//Asignar valores RANDOM al ARRAY
			//System.out.print(arr[i] + " | ");//PRINT ARRAY
			
			if(arr[i] % 2 == 0) {//COUNT PARES
				cPares++;
		}else{//COUNT IMPARES
				cImpares++;
		}
		
		

		
		//Asignar Valores PARES, asignar valores impares
		
		}//for		
		int[] pares = new int[cPares];//CREAR ARRAYS de PARES e IMPARES
		int[] impares = new int[cImpares];
		int x = 0; int y = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				pares[x] = arr[i];
				x++;
			}else{
				impares[y] = arr[i];
				y++;
			}
		}
		
		//PRINT size, size PAR, size IMPAR
		//PRINT array, print PAR, IMPÂR
		System.out.println("SIZE: " + size + "\tPares: "+ cPares + "\tImpares: "+ cImpares +"\n");
		System.out.println("*******************ARRAY***************************");
		printArr(arr);
		System.out.println("*******************PARES***************************");
		printArr(pares);
		System.out.println("*******************IMPARES*************************");
		printArr(impares);
		
		

		

		
	}//MAIN
	
	static int rnd() {
		int rnd = ThreadLocalRandom.current().nextInt(0, 11);
		return rnd;
	}
	
	static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();
		
	}

}

``` 