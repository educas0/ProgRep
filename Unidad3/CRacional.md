```java

package objetos;

class CRacional

{

 private int numerador;

 private int denominador;

 
  CRacional(){
	  
  }
  
  CRacional(int n, int d){
	  numerador = n;
	  denominador = d;
  }
  

  void asignarDatos(int num, int den)

  {

    numerador = num;

    if (den == 0) den = 1; // el denominador no puede ser cero

    denominador = den;

  }

 

  void visualizarRacional()

  {

    System.out.println(numerador + "/" + denominador);

  }

 

  public static void main (String[] args)

  {

    // Punto de entrada a la aplicación

    CRacional r1 = new CRacional(2, 5); // crear un objeto CRacional


    r1.visualizarRacional();

  }

}


``` 