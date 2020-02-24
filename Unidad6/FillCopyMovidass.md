```java
	

package arrays;

public class FillCopyMovidas {

	public static void main(String[] args) {
		
		System.out.println((char)169 );
		
		int[][] arr = new int[5][4];
		System.out.println( "Espacio en memoria\t" + arr );
		
		int[][] arr2 = arr.clone();
		System.out.println( "Espacio en memoria\t" + arr2 );
		
		System.out.println("");
		
		rellenarRandom(arr);
		mostrar(arr);
		mostrarChar(arr);
		
		System.out.println("\n***************************************************\n");
		
		rellenarRandom(arr2);
		mas10(arr2);
		mostrar(arr2);
		mostrarChar(arr2);
	}


//rellenar arr con números aleatorios
	public static void rellenarRandom(int arr[][]) {
		System.out.println("Rellenando Array" + arr);
		for(int y = 0; y < arr.length; y++) {
			for(int x = 0; x < arr[y].length; x++) {
				
				int rnd = (int) (Math.random()*10);
				arr[y][x] = rnd;
			}
		}
	}
	

//sumar 10
	public static void mas10(int[][] arr) {
		System.out.println("Modificando +10 Array" + arr );
		for(int y = 0; y < arr.length; y++) {
			for(int x = 0; x < arr[y].length; x++) {
				
				arr[y][x] += 10;
			}
		}
	}
	

	
//mostrar arr sumar y avg
	public static void mostrar(int arr[][]) {
		System.out.println("MOSTRAR Array " + arr );
		int max = arr[0][0];
		int min = arr[0][0];
		int y = 0;
		int x = 0;
		double sum = 0;
		for( y = 0; y < arr.length; y++) {
			for( x = 0; x < arr[y].length; x++) {
				
				System.out.print( 	arr[y][x] + " | "	);
				sum += arr[y][x];
			
				if(max < arr[y][x]) {
				max = arr[y][x];
				}
				if(min > arr[y][x]) {
					min = arr[y][x];
				}
			
			}
			System.out.println("\n____________");
		}
		
		double avg = sum / (y * x);
		
		
		
		
		System.out.print("\nsuma: " + sum + "\t");
		System.out.print("promedio: " + avg + "\t");
		System.out.print("max: " + max + "\t");
		System.out.print("min: " + min + "\t");
		
		
		
	}

//mostrar  to_char
	public static void mostrarChar(int arr[][]) {
		System.out.println("MOSTRAR charrArray " + arr);
		int y = 0;
		int x = 0;
		double sum = 0;
		for( y = 0; y < arr.length; y++) {
			for( x = 0; x < arr[y].length; x++) {
				
				System.out.print( 	(char)(arr[y][x] + 33) + " | "	);
				sum += arr[y][x] +33;
			}
			System.out.println("\n____________");
		}
		
		double avg = (char) (sum / (y * x) );
		System.out.print("\nsuma: " + (char) sum + "\t");
		System.out.println("promedio: " + (char)avg );
		
	}








}//class


``` 