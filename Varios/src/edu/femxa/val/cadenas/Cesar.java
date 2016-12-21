package edu.femxa.val.cadenas;

public class Cesar {
	
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
	
	public static String cifradoCesar (String cadena, int clave)
	{
		String cad_cifrada = new String();
			int longi = cadena.length();
			int numero_carac = 0;
			char caracter = 0;
			
			for (int i = 0; i < longi; i++) {
				
				caracter = cadena.charAt(i);
				
				if(caracter != ' ')
				{
					numero_carac = (int) caracter;			
					numero_carac += clave;
					caracter = (char) numero_carac;
				}
				
				cad_cifrada += caracter;			
			}
		
		return cad_cifrada;		
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
