package edu.femxa.val.cadenas;

public class Cesar {
	
	/**
	 * M�todo que muestra por pantalla el n�mero al que equivale cada uno de los caracteres de
	 * la palabra que se le pasa como argumento.
	 * @param cadena Palabra que hay que recorrer para obtener los caracteres que contiene.
	 */
	public void mostrarCodChars (String cadena)
	{
		int longitud = cadena.length();
		int numero_carac = 0;
		char caracter = 0;
		
		for (int i = 0; i < longitud; i++) 
		{
			caracter = cadena.charAt(i);
			numero_carac = (int) caracter;
			System.out.println(caracter+" = "+numero_carac);
		}
	}
	
	/**
	 * M�todo que implementa el sistema de cifrado C�sar, que consiste en reemplazar una letra por
	 * otra que se encuentra en posici�n un n�mero determinado de espacios m�s adelante en el alfabeto.
	 * @param cadena Variable que representa la palabra que se quiere cifrar.
	 * @param clave N�mero con el que se cifra.
	 * @return Devuelve la cadena cifrada.
	 */
	public static String cifradoCesar (String cadena, int clave)
	{
		String cad_cifrada = new String();
			int longi = cadena.length();
			char caracter = 0;
			char caracter_cifrado = 0;
			
			for (int i = 0; i < longi; i++) {
				
				caracter = cadena.charAt(i);
				caracter_cifrado = traduceCharCesar(caracter, clave);
				cad_cifrada += caracter_cifrado;			
			}
		
		return cad_cifrada;		
	}
	
	/**
	 * M�todo que transforma un car�cter en otro que est� situado un n�mero de veces m�s adelante en el
	 * alfabeto.
	 * @param c Car�cter a cifrar.
	 * @param k N�mero clave.
	 * @return Devuelve el car�cter cifrado.
	 */
	public static char traduceCharCesar (char c, int k)
	{
		char char_traducido = 0;
			int numero_carac = 0;	

			if(c != ' ')
			{
				numero_carac = (int) c;
				numero_carac += k;
				char_traducido = (char) numero_carac;
			}
			else
				char_traducido = c;
			
		return char_traducido;
	}
	
	public static void main(String[] args) {
		
		/*Cesar cesar = null;
		cesar = new Cesar();
		
		cesar.mostrarCodChars("LOLLIPOP");*/
		
		/*int j = 81;
		char c = (char) j;
		System.out.println(c);*/
		
		String cadena = "HOLA HOLA";
		String cad_cifrada = null;
		
		cad_cifrada = cifradoCesar(cadena, 3);
		System.out.println(cad_cifrada);
		
	}

}
