```java
	
package arrays;

public class Print3 {
	
		static String[][] arr1 = {
				{"Cacaolat", "Perro", "Culmen", "Pizza"},
				{"Colacao", "Maravillao"},
				{"Retromonguer", "Retrasado", "Retraído"},
				{"A", "E", "I", "O", "U"}
		};
		
		static String[][] arr2 = {
				{"first"},
				{"Coronavirus", "Maravillao", "Estocolmo"},
				{"Doñano", "Retroviral", "Retraído", "Doñana"},
				
		};
		static String[][] arr3 = {
				{"Zenit", "yoga", "Octógono", "Pináculo"},
				{"Google", "Maravillao","UTF-8"},
				{""},
				{"A", "E", "I", "O", "U"},
				{"Caca", "Pedo", "Culo", "Pis"}
				
		};
	public static void main(String[] args) {
		// print 3 arraysBi en 3 columnas

		imp(arr1, arr2, arr3);
		System.out.println("===============================");
		impf(arr1, arr2, arr3);
		
	}
	
	static void imp(String[][] a1, String[][] a2,String[][] a3 ) {
		
		for(int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length;j++) {
				System.out.print(a1[i][j] + " | ");
				
				
			}
			System.out.println();
			
		}
		
		
	}
	
	static void impf(String[][] a1, String[][] a2,String[][] a3 ) {
		
		System.out.println(" uno  |  dó  |    tré\n-------|---------|-------");
		for(int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length;j++) {
				System.out.printf("%4s | %5s |%8s\n", a1[i][j], a2[i][j], a3[i][j]);
				
				
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
		}
		
		
	}

}

``` 