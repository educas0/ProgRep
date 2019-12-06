``` java

		Scanner input = new Scanner(System.in);

		//U4 ej 22 PaquetePesoPrecio
		
		System.out.println("Introduce peso del paquete: ");
		double peso =  input.nextDouble();
		
		double resto = peso % 10;
		
		int iPeso = (int)peso;
		
		double precio = 0;
		
		if (iPeso >= 20) {
			System.out.println("No se pueden enviar paquetes con peso superior a 20");
		}else if(iPeso >= 10) {
			precio = 7.5;
		}else if(iPeso >= 4) {
			precio = 4.5;
		}else if(iPeso >= 2) {
			precio = 2.5;
		}else {System.out.println("Que seas muy feliz");}
		System.out.println("Con peso " + " el precio es " + (precio + resto/10));
```