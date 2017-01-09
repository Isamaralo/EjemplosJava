package edu.femxa.val.practicaNavidad;

import java.util.Scanner;

public class PrincipalPersona {

	public static final int NUM_PERSONAS = 5;
	
	public static void main(String[] args) {
				
		int opcion = 0;
		int contador = 0;
		Persona[] array_personas = null;
		array_personas = new Persona[NUM_PERSONAS];
		String nombre = null;
		int edad = 0;
		Persona persona = null;
		persona = new Persona();
		
		do
		{
			EntradaSalida.mostrarMenu();
			opcion = EntradaSalida.pedirOpcion();
			
			switch (opcion){
			case 1:
				if(contador < NUM_PERSONAS)
				{
					nombre = EntradaSalida.pedirNombre();
					edad = EntradaSalida.pedirEdad();
					persona = new Persona(nombre, edad);
				
					ArrayPersonas.insertarPersona(array_personas, persona);
					contador++;
				}
				else
					System.out.println("La lista está llena.\n");
				break;
			case 2:
				if(contador != 0)
					ArrayPersonas.listarPersonas(array_personas, contador);
				else
					System.out.println("La lista esta vacía.\n");
				break;
			case 3:
				if(contador != 0)
				{
					nombre = EntradaSalida.pedirNombre();
					ArrayPersonas.buscarPersonaPorNombre(array_personas, nombre, contador);
				}
				else
					System.out.println("La lista esta vacía.\n");
				break;
			case 4:
				if(contador != 0)
				{
					boolean borrado = false;
					nombre = EntradaSalida.pedirNombre();
					borrado = ArrayPersonas.borrarPersona(array_personas, nombre, contador);
					if (borrado)
						contador --;
				}
				else
					System.out.println("La lista esta vacía.\n");
				break;
			case 5:
				if(contador != 0)
					ArrayPersonas.ordenarPersonasPorEdad(array_personas, contador);
				else
					System.out.println("La lista esta vacía.\n");
				break;
			case 6:
				if(contador < NUM_PERSONAS)
				{
					nombre = EntradaSalida.pedirNombre();
					edad = EntradaSalida.pedirEdad();
					persona = new Persona(nombre, edad);
				
					ArrayPersonas.insertarPersonasOrdenadas(array_personas, persona);
					contador++;
				}
				else
					System.out.println("La lista está llena.\n");
				break;
			default:
				break;
			}
			
		}
		while(opcion!=7);
		System.out.println("Está saliendo del programa.");
	}
}