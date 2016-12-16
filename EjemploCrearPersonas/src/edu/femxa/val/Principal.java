package edu.femxa.val;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona1 = null; //Declaración e inicialización.
		
		persona1 = new Persona("Vale", 33); //Llamada al constructor para reservar memoria para el objeto.
		
		Persona persona2 = null;
		
		persona2 = new Persona("Cristian", 28);
		
		System.out.println(persona1.nombre+"\0"+persona1.edad);
		System.out.println(persona2.nombre+"\0"+persona2.edad);
	}
}
