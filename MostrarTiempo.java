package septiembre;

import java.util.Scanner;

public class MostrarTiempo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 
    Crea un programa llamado MostrarTiempo.java que tomando una cantidad 
    por teclado de segundos (entero positivo) muestre la cantidad de minutos 
    y segundos contenidos. Ejemplo salida:

Introduzca un entero para segundos: 500
500 seconds son 8 minutos y 20 segundos

Nota: para calcular los segundos se puede hacer uso de módulo pues 
el resto son los segundos que faltan.
	LO TENGO BIEN HECHO EN CASA * */
		System.out.println("\n\nIntroduse segundos: ");
		int segundos = input.nextInt();
		int restoSeg = segundos % 60;
		
		int minutos = segundos /60;
		int restoMin = minutos % 60;
		
		int horas = minutos/60;
		int restoHoras = horas * horas;
		System.out.println((segundos+restoSeg) + " segundos son " + (minutos+restoMin) + " minutos ó " + (horas+restoHoras) + " horas.");
		
		System.out.println("resto Segundos: " + restoSeg);
		System.out.println("resto Segundos: " + restoMin);
		System.out.println("resto Segundos: " + restoHoras);

		
		input.close();

	}

}
