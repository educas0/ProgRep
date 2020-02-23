```java
	


	public class PrintColumn {


	  public static void main(String[] args) {
	    
	      int[] numero = new int[20];
	      int[] cuadrado = new int[20];
	      int[] cubo = new int[20];

	      int i;
	      
	      for (i = 0; i < 20; i++) {
	        numero[i] = (int)(Math.random()*101);
	        cuadrado[i] = numero[i] * 2;
	        cubo[i] = cuadrado[i] * 2;
	      }
	      
	      System.out.println("\nA continuación se muestran en tres columnas, un número aleatorio entre 0 y 100, su cuadrado y su cubo:\n");
	      
	      System.out.println(" uno    |  dó    |    tré\n--------|--------|-------");
	      for (i = 0; i < 20; i++) {
	        System.out.printf("%d\t| %d\t |%d\t\n", numero[i], cuadrado[i], cubo[i]);
	      }
	  }
	}

``` 