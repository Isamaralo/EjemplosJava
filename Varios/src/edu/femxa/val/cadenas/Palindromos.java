package edu.femxa.val.cadenas;

import java.util.Scanner;

public class Palindromos {
	
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
	 * Recibe una cadena y devuelve si la cadena es un palíndromo.
	 * @param cadena Cadena que recibe
	 * @return True si es un palíndromo y false si no lo es
	 */
	public static boolean esPalindromo (String cadena)
	{
		boolean b_dev = true;
		int longitud = cadena.length();
		
			int i = 0;
			while(i<cadena.length() && b_dev)
			{
				if(cadena.charAt(i) == cadena.charAt(longitud-1-i))
					b_dev = true;
				else
					b_dev = false;
				i++;
			}
		
		return b_dev;
	}
	
	public static void main(String[] args) {
		
		String cadena = null;
		
		cadena = pedirCadena();
		if (esPalindromo(cadena))
			System.out.println("La cadena \"" +cadena+ "\" es un palíndromo.");
		else
			System.out.println("La cadena \"" +cadena+ "\" NO es un palíndromo.");
	}
}
