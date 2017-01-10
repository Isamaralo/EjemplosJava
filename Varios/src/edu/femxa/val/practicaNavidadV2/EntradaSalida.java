package edu.femxa.val.practicaNavidadV2;

import java.util.Scanner;

public class EntradaSalida {
	
	/**
	 * Muestra el menú con las opciones del programa
	 */
	public static void mostrarMenu ()
	{
		System.out.println("Elija una opción: ");
		System.out.println("1. INSERTAR PERSONA");
		System.out.println("2. LISTAR PERSONAS");
		System.out.println("3. BUSCAR PERSONA POR NOMBRE");
		System.out.println("4. BORRAR PERSONA");
		System.out.println("5. ORDENAR POR EDAD");
		System.out.println("6. INSERTAR ORDENADO");
		System.out.println("7. SALIR");
	}
	
	/**
	 * Pide un número de tipo entero al usuario 
	 * @return El número que el usuario introduce por teclado
	 */
	public static int pedirOpcion ()
	{
		int opcion = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
		return opcion;
	}
	
	/**
	 * Pide un nombre al usuario
	 * @return La palabra que el usuario introduce por teclado
	 */
	public static String pedirNombre()
	{
		String nombre = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca el nombre: ");
			nombre = sc.nextLine(); 
					
		return nombre;
	}
	
	/**
	 * Pide una edad al usuario
	 * @return El número entero que el usuario introduce por teclado
	 */
	public static int pedirEdad ()
	{
		int edad = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca la edad: ");
			edad = sc.nextInt();
			
		return edad;
	}
}