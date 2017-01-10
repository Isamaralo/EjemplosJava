package edu.femxa.val;

public class MainEquals {

	public static void main(String[] args) {
		
		String palabra1 = "ADIOS";
		String palabra2 = "ADIOS";
		
		Persona p1 = new Persona("VAL", 33);
		Persona p2 = new Persona("VAL", 33);
		
		//En el caso de la clase String, los dos objetos apuntan a la misma dirección de memoria.
		if(palabra1 == palabra2)
		{
			System.out.println("PALABRAS IGUALES");
		}
		else
		{
			System.out.println("PALABRAS DISTINTAS");
		}
		
		//Con método equals
		if(palabra1.equals(palabra2))
		{
			System.out.println("PALABRAS IGUALES");
		}
		else
		{
			System.out.println("PALABRAS DISTINTAS");
		}
		
		/*En el caso de la clase Persona, cada persona está en una dirección de memoria distinta, aunque el 
		contenido sea el mismo, pero tanto el método equals como == comparan las direcciones en las que se 
		encuentran los objetos que compara. Para comparar los datos que tiene, hay que modificar el método
		equals en la clase Persona.*/
		
		if(p1 == p2) 
		{
			System.out.println("PERSONAS IGUALES");
		}
		else
		{
			System.out.println("PERSONAS DISTINTAS");
		}
		
		//Con método equals
		if(p1.equals(p2))
		{
			System.out.println("PERSONAS IGUALES");
		}
		else
		{
			System.out.println("PERSONAS DISTINTAS");
		}
		
	}
}
