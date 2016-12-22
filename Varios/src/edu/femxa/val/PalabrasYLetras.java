package edu.femxa.val;

import java.util.Scanner;

public class PalabrasYLetras {
	
	/**
	 * Dada una palabra y una letra, te devuelve si la letra está incluida
	 * en la palabra.
	 * @param palabra
	 * @param letra
	 * @return Devuelve true si la letra está en la palabra.
	 */
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
	
	/**
	 * Dada una palabra, la muestra por pantalla letra a letra.
	 * @param palabra Cadena que hay que recorrer y mostrar letra a letra.
	 */
	public static void mostrarPalabraLetraALetra(String palabra)
	{
		for (int i = 0; i < palabra.length(); i++)
		{
			System.out.println(palabra.charAt(i));
		}
	}
	
	/**
	 * Va mostrando por pantalla la palabra que le pasas hasta que encuentra la letra
	 * que le pasas.
	 * @param palabra
	 * @param letra
	 */
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
	
	/**
	 * Muestra por pantalla los n primeros caracteres de la palabra que le pasas.
	 * @param palabra
	 * @param n Número de caracteres que hay que mostrar.
	 */
	public static void nPrimerosNumerosDeLaCadena (String palabra, int n)
	{
		int i = 0;
		
		while((i < n) && i<palabra.length())
		{
			System.out.println(palabra.charAt(i));
			i++;
		}
	}
	
	/**
	 * Muestra por pantalla los n últimos caracteres de la palabra que le pasas.
	 * @param palabra
	 * @param n Número de caracteres que hay que mostrar.
	 */
	public static void nUltimosNumerosDeLaCadena (String palabra, int n)
	{
		//int contador = 0;
		
		if(n < palabra.length())
		{
			for(int i = palabra.length()-1; i >= palabra.length()-n; i--)
			{
				//if(contador < n)
				//{
					System.out.println(palabra.charAt(i));
				//}
				//contador++;
			}
		}
		else
			System.out.println("La palabra no tiene tantas letras.");
		
		//CON WHILE 
//		 
//		int lim_sup = palabra.length()-1;
//		int lim_inf = palabra.length()-n;
//		
//		while(lim_sup >= lim_inf)
//		{
//			System.out.println(palabra.charAt(lim_sup));
//			lim_sup--;
//		}
		
	}
	
	/**
	 * Calcula el número de veces que está la letra que le pasas en la palabra 
	 * que le pasas.
	 * @param palabra
	 * @param letra
	 * @return Número de veces que está la letra en la palabra.
	 */
	public static int vecesQueEstaLaLetra(String palabra, char letra)
	{
		int contadorLetraEncontrada = 0;
		
			for (int i = 0; i < palabra.length(); i++)
			{
				if(letra == palabra.charAt(i))
					contadorLetraEncontrada++;
			}
		return contadorLetraEncontrada;
	}
	
	/**
	 * Dada una palabra, muestra por pantalla esa palabra al revés.
	 * @param palabra Palabra que hay que invertir.
	 */
	public static void palabraInvertida(String palabra)
	{
		String palabraAlReves = null;
		palabraAlReves = new String();
		
		for(int i = palabra.length()-1; i >= 0; i--)
		{
				palabraAlReves += palabra.charAt(i);
		}
		
		System.out.println(palabraAlReves);
	}
	
	public static void main(String[] args) {
		
		String palabra = "HOLA";
		char letra = 'L';
		int numero = 3;
		int numVeces = 0;
		
//		if(letraEstaEnPalabra(palabra,letra))
//			System.out.println("La letra " +letra +" está en la palabra " +palabra);
//		else
//			System.out.println("La letra " +letra +" NO está en la palabra " +palabra);

		//mostrarPalabraLetraALetra(palabra);

		//mostrarPalabraLetraALetra(palabra);
		
		//mostrarLetrasPalabraHastaEncontrarLetra(palabra, letra);
		
		//nPrimerosNumerosDeLaCadena(palabra, numero);
		//nUltimosNumerosDeLaCadena(palabra, numero);
		
//		numVeces = vecesQueEstaLaLetra(palabra, letra);
//		System.out.println("La letra está " +numVeces +" veces.");
		
		palabraInvertida(palabra);
		
	}

}
