package ejercicios3;

public class PuntoMedio {

	public static void main(String[] args) {
		/*
		 * 
    Escribe un programa que muestre la siguiente tabla calculando el punto medio de dos puntos. 
    El punto medio se calcula sumando las dos coordenadas por separado y dividirla entre 2.

  a      b       Punto medio
(0, 0) (2, 1)  (1.0, 0.5)
(1, 4) (4, 2)  (2.5, 3.0)
(2, 7) (6, 3)  (4.0, 5.0)
(3, 9) (10, 5) (6.5, 7.0)
(4, 11) (12, 7) (8.0, 9.0)

		 */
		
double[] a = {0,0};
double[] b = {2,1};
PuntoMedio(1,4,4,2);

	}
	


private static void PuntoMedio(double x, double y, double j, double i){
	System.out.println("\tA\tB\tPunto Medio");
	System.out.println( "\t(" + x + "," + y + ")\t" + "(" + j + "," + i + ")\t" + "(" + (x+j)/2 + "," + (y+i)/2 + ")" );
	
}

}
