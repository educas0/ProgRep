```java


import java.util.concurrent.ThreadLocalRandom;

public class TemperaturaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] tempArr = new double[12];
		fillArr(tempArr);
		impArr(tempArr);
		System.out.println(" ");
		impNice(tempArr);
	}
	static void impNice(double[] tempArr){
		
	    for (int i = 0; i < tempArr.length; i++){
	        System.out.print("Mes "+(i+1)+": ");
	        for (int j = 0; j < tempArr[i]; j++){
	          System.out.print("*");
	        }
	        System.out.println();
	      }
	}
	
	
	 static void impArr(double[] arr) {
			for(int i =  0; i < arr.length; i++) {
				System.out.println(i+1 +" - "+ arr[i]);
			}
	}

	static void fillArr(double[] arr) {
		for(int i =  0; i < arr.length; i++) {
			arr[i] = rnd();
		}
	}
	static double rnd() {
		double rnd = ThreadLocalRandom.current().nextDouble(0, 21);
	return rnd;
	}
}


``` 