```java


		// Los arrays de enteros sin contenido se les asigna 0
		// Los arrays de String sin contenido se les asigna null
		
		//COPIA DE ARRAY (Con direcciones de memoria distintas)
		double[] myList = new double[10];
		myList[0] = 34;
		myList[1] = 456; 
		myList[2] = 24; 
		myList[3] = 345; 
		myList[4] = 39; 
		myList[5] = 34; 
		myList[6] = 45; 
		myList[7] = 343; 
		myList[8] = 888;
		myList[9] = 567; 


		double[] myList2 = new double[10];
		
		for(int i=0; i < myList.length; i++) {
			myList2[i] = myList[i];
		}
		for(int i=0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		System.out.println("\n---------------------------------------------------------------------");
		
		for(int i=0; i < myList.length; i++) {
			System.out.print(myList2[i] + " ");

		}
		
		
		double max = myList[0];

	}


``` 