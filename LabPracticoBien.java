package septiembre;

public class LabPracticoBien {
	public static void main(String[] args) {

		/* 
		 * 

    Lab Práctico

Puedes utilizar la función System.currentTimeMillis() que devuelve el número total de milisegundos
 desde el 01/01/1970. Este tiempo se llama Unix epoch. 
Comienza en 1970 que es cuando se introdujo Unix.

Puedes utilizar este método para saber cuál es el minuto, hora y segundo actuales:

    Obtener el total de milisegundos con System.currentTimeMillis(). 
    	Obtenlo en una variable totalMilisegundos.
    Obtener el total de segundos en una variable totalSegundos (totalMilisegundos/1000).
    Obtener el segundo en el que estamos (actual), simplemente con totalSegundos % 60.
    Obtener el númeto total de minutos: totalSegundos / 60 en una variable totalMinutos.
    Obtener el minuto actual mediante: totalMinutos % 60.
    Obtener el número total de horas mediante: totalMinutos / 60 en una variable totalHoras.
    Obtener la hora actual mediante totalHoras % 60.

El programa debe de calcular todo lo anterior
y mostrar el mensaje con los cálculos hechos de la hora actual: 
									La hora del sistema es 17:35:07 GMT
		 * */
	double ctm = System.currentTimeMillis();
		System.out.println("Current Time Millis: " + ctm);
		
	double totalSegundos = ctm /1000;
	double segundoActual = totalSegundos % 60;
		
	double MinTotales = System.currentTimeMillis() / (60 * 1000);
	double MinActuales = (double) (MinTotales % (24 * 60));
	
	double horas = MinActuales / 60;
	double minutos = MinActuales % 60;
	double segundos = segundoActual;

	System.out.println("\nLa hora del sistema es " + Math.round(   horas + 2) + ":" + Math.round(minutos) + ":" + Math.round(segundos) + " GTM"  );
	

	
	}

}
