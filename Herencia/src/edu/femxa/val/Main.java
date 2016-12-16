package edu.femxa.val;

import java.util.Scanner;

public class Main {
	
	//Declaro una constante
	public static final int NUMERO_ALUMNOS = 5;
	
	public static String pedirNombre()
	{
		String nombre = null;
		Scanner sc = null;
		
			System.out.println("Introduzca el nombre: ");
			sc = new Scanner(System.in);
			nombre = sc.nextLine();
	        
		return nombre;
	}
	
	public static int pedirEdad()
	{
		int edad = 0;
		Scanner sc = null;
		
			System.out.println("Introduzca la edad: ");
			sc = new Scanner(System.in);
			edad = sc.nextInt();
	        
		return edad;
	}
	
	public static void main(String[] args) {
		
		String nombre = null;
		int edad = 0;
		
		//UTILIZANDO GETTERS AND SETTERS
		Persona p = null;
		p = new Persona();
		
		for (int i = 0; i < NUMERO_ALUMNOS; i++) {
			
			nombre = pedirNombre();
			edad = pedirEdad();
			p.setNombre(nombre);
			p.setEdad(edad);
			p.mostrarPersona();
			
		}
/**************************************************************************************		
//		//CON LISTA DE PERSONAS
//		Persona[] listaPersonas = null;
//		
//		listaPersonas = new Persona[5];
//		
//		for (int i = 0; i < NUMERO_ALUMNOS; i++)
//		{
//			nombre = pedirNombre();
//			edad = pedirEdad();
//			listaPersonas[i] = new Persona(nombre, edad);
//		}
//		
//		for (int i = 0; i < 5; i++)
//		{
//			System.out.println("\nPERSONA " +(i+1));
//			listaPersonas[i].mostrarPersona();
//		}
 * 
*****************************************************************************************/
/**************************************************************************************					
//		for (int i = 0; i < NUMERO_ALUMNOS; i++)
//		{
//     		nombre = pedirNombre();
//			edad = pedirEdad();
//			Persona persona = null;
//			persona = new Persona(nombre, edad);
//			persona.mostrarPersona();
//		}
*****************************************************************************************/
		
	}
}
