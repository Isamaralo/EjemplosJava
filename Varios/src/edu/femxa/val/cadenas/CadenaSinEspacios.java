package edu.femxa.val.cadenas;

import java.util.Scanner;

public class CadenaSinEspacios {
	
	/**
	 * Pide al usuario que introduzca una cadena por teclado.
	 * @return La cadena que ha introducido el usuario
	 */
	public static String pedirCadena()
	{
		String cadena = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca la cadena: ");
			cadena = sc.nextLine(); 
					
		return cadena;
	}
	
	/**
	 * Recibe una cadena y devuelve la cadena sin espacios en blanco.
	 * @param cadena Cadena que recibe
	 * @return Cadena sin espacios
	 */
	public static String quitarEspacios (String cadena)
	{
		String cadena_sin_espacios = "";
		
			for (int i = 0; i < cadena.length(); i++) {
				
				if(cadena.charAt(i) != ' ')
					cadena_sin_espacios += cadena.charAt(i);
			}
		
		return cadena_sin_espacios;
	}
	
	public static void main(String[] args) {
		
		String cadena = null;
		String cadena_sin_espacios = null;
		
		cadena = pedirCadena();
		cadena_sin_espacios = quitarEspacios(cadena);
		System.out.println(cadena_sin_espacios);
		
	}

}
