package edu.femxa.val;

import java.util.Scanner;

public class PalabrasYLetras {
		
	public static boolean letraEstaEnPalabra(String palabra, char letra)
	{
		boolean b_dev = false;
		int i = 0;
		
			do
			{
				if(letra == palabra.charAt(i))
					b_dev = true;
				i++;				
			}
			while(i < palabra.length());
		
		return b_dev;
	}
	
	public static void mostrarPalabraLetraALetra(String palabra)
	{
		for (int i = 0; i < palabra.length(); i++)
		{
			System.out.println(palabra.charAt(i));
		}
	}
	public static void mostrarLetrasPalabraHastaEncontrarLetra (String palabra, char letra)
	{
		int i = 0;
		boolean letraEncontrada = false;
		do
		{
			System.out.println(palabra.charAt(i));
			if(letra == palabra.charAt(i))
			    letraEncontrada = true;
			i++;
		}
		while((i < palabra.length()) && (!letraEncontrada));
	}
	
	public static void main(String[] args) {
		
		String palabra = "HOLA";
		char letra = 'L';
		
//		if(letraEstaEnPalabra(palabra,letra))
//			System.out.println("La letra " +letra +" está en la palabra " +palabra);
//		else
//			System.out.println("La letra " +letra +" NO está en la palabra " +palabra);
		
		//mostrarPalabraLetraALetra(palabra);
		mostrarLetrasPalabraHastaEncontrarLetra(palabra, letra);
		
	}

}
