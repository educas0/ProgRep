package test1;

import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce segundos a convertir: ");
		
		int segundos = input.nextInt();
		int horas = segundos / 3600;
		int minutos = (segundos - horas*3600)/60;
		int RestoSegundos = segundos - horas*3600 - minutos*60;


		
		System.out.println(segundos +" segundos son " + horas + " horas, " + minutos + " minutos y " + RestoSegundos + " segundos." );

	}

}
