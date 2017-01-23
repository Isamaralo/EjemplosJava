package edu.femxa.val.jdbc.ejercicioCasa;

import java.sql.Date;
import java.util.Scanner;

public class EntradaSalida {
	
	/**
	 * Muestra el men� con las opciones del programa
	 */
	public static void mostrarMenu ()
	{
		System.out.println("Elija una opci�n: ");
		System.out.println("1. DAR DE ALTA A UN EMPLEADO");
		System.out.println("2. DAR DE BAJA A UN EMPLEADO");
		System.out.println("3. SALIR");
	}
	
	/**
	 * Pide un n�mero de tipo entero al usuario 
	 * @return El n�mero que el usuario introduce por teclado
	 */
	public static int pedirEntero ()
	{
		int entero = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			entero = sc.nextInt();
			
		return entero;
	}
	
	/**
	 * Pide una cadena al usuario por teclado.
	 * @return La palabra que el usuario introduce por teclado
	 */
	public static String pedirCadena()
	{
		String cadena = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			cadena = sc.nextLine(); 
					
		return cadena;
	}
	
	/**
	 * Pide una cadena por teclado con formato "yyyy-[m]m-[d]d"
	 * y lo transforma en tipo Date para poder trabajar con el 
	 * dato en BD.
	 * @return Objeto de tipo Date
	 */
	public static Date pedirFecha()
	{
		Date fecha = null;
		String s_fecha = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			s_fecha = sc.nextLine();
			fecha.valueOf(s_fecha);
		
		return fecha;
	}
	
}
