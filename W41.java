package septiembre;

import java.util.Scanner;

public class W41 {

	static Persona qPersona = new Persona();
	
	public static void main(String[] args) {
		
		System.out.println("Programa inicializado...\n");
		
		Object miObj;
		
		Persona persona1 = new Persona();
		
		persona1.nombre = "Claudio";
		persona1.dni = "46456456C";
		persona1.altura = 185;
		
		persona1.saludar();
		
//---------------------------------------------------		
		
		Persona persona2 = new Persona();
		
		persona2.nombre = "Patricia";
		persona2.dni = "45453674Z";
		persona2.altura = 160;
		
		persona2.saludar();
		
//---------------------------------------------------		
		
		Persona persona3 = new Persona();
		
		persona3.nombre = "Ruperto";
		persona3.dni = "4534709U";
		persona3.altura = 175;
		
		persona2.saludar();

//---------------------------------------------------			
		
	
		
		System.out.println("Personas establecidas...\n");
		menu();
		
		Scanner input = new Scanner(System.in);
		int opc = input.nextInt();
		
		switch(opc)	//Elige pavo
		{

		   case 1 :	setPersona(persona1);
		   			verDatos(qPersona);
			   		break; 
		   
		   case 2 :	setPersona(persona2);
		   			verDatos(qPersona);
			   		break;
		      
		   case 3 : setPersona(persona3);
		   			verDatos(qPersona);
			   		break;   
		   case 4 :System.out.println("Saliendo...");
		   		break;    
		      
		   default : System.out.println("Eliga un número correcto");
		   			menu();	

		}
		
		
	}

	private static void verDatos(Persona kPersona) { //recibe la persona elegida ej: persona2
		
		System.out.println("Nombre: " +kPersona.nombre);
		System.out.println("DNI: " + kPersona.dni);
		System.out.println("Altura: " + kPersona.altura);
		
		System.out.println("\n\n");
		
		kPersona.saludar();
		kPersona.insular();
		kPersona.Despedirse();
		
		
		
	}

	public static void menu(){
		System.out.println("\t\tMENU\nSeleccione persona a inspeccionar:\n\n1. Claudio\n2. Patricia\n3. Ruperto\n4. -SALIR-");
	}
	   public static void setPersona (Object asignaPersona) {

	        qPersona = (Persona) asignaPersona; 
	        System.out.println("Persona establecida como:\t" + qPersona.nombre);
	        
	  }
	   }
	
	   //public void setPersona(Persona i = new Persona()){}
	


