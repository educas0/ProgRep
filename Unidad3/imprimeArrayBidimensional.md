```java

		int [][] distancias = {
				{1, 2, 3, 4},
				{3, 2, 10, 40},
				{500, 32, 23, 20}, 
				{3,345,345, 34, 34}, 
				{234, 436, 34, 65},
				{234, 25, 53, 234},
				{2, 3, 5 ,2}
		};
		
		
		for (int x=0; x < distancias.length; x++){
	        for (int y=0; y < distancias[x].length; y++)
	              System.out.print(" | " + distancias[x][y]+ " | ");   
	        System.out.println("\n----------------------------------------");

	}

``` 