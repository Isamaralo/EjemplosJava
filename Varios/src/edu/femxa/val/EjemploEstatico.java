package edu.femxa.val;

public class EjemploEstatico {

	//Static es una sección de código que se ejecuta 1 vez sólo y es la primera 
	//que se encuentra el nombre de la clase en el código
	static
	{
		System.out.println("SECCIÓN STATIC");
	}
	
	public EjemploEstatico ()
	{
		System.out.println("Llamo al constructor");
	}
	
}
