package edu.femxa.val.practicaNavidadV2;

import java.util.Scanner;

import edu.femxa.val.practicaNavidadV2.ArrayPersonas;

public class PrincipalPersona {
	
	public static void main(String[] args) {
				
		int opcion = 0;
		ArrayPersonas array_personas = null;
		array_personas = new ArrayPersonas();
		int contador = 0;
		
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
				nombre = EntradaSalida.pedirNombre();
				edad = EntradaSalida.pedirEdad();
				persona = new Persona(nombre, edad);
				
				if(array_personas.insertarPersona(persona))
					System.out.println("Ha introducido una nueva persona en la lista.\n");
				else
					System.out.println("La lista está llena.\n");
				
				break;
			case 2:
				array_personas.listarPersonas();
				break;
			case 3:		
				if(array_personas.num_personas == 0)
					System.out.println("La lista está vacía.\n");
				else
				{
					nombre = EntradaSalida.pedirNombre();
					persona = array_personas.buscarPersonaPorNombre(nombre);
					if(persona != null)
						System.out.println(persona.toString()+"\n");
					else
						System.out.println("No se ha encontrado ninguna persona en la lista de nombre " +nombre+ ".\n");
				}
				break;
			case 4:
				if(array_personas.num_personas==0)
					System.out.println("La lista está vacía.\n");
				else
				{
					nombre = EntradaSalida.pedirNombre();
					if(array_personas.borrarPersona(nombre))
						System.out.println(nombre +" ha sido borrada de la lista.\n");
					else
						System.out.println("No se ha encontrado ninguna persona en la lista de nombre " +nombre+ ".\n");
				}
				
				break;
			case 5:
				array_personas.ordenarPersonasPorEdad();
				break;
			case 6:
				if(contador < array_personas.num_personas)
				{
					nombre = EntradaSalida.pedirNombre();
					edad = EntradaSalida.pedirEdad();
					persona = new Persona(nombre, edad);
				
					//ArrayPersonas1.insertarPersonasOrdenadas(array_personas, persona);
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