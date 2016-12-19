package edu.femxa.val;

public class PruebaString {
	
	public static void main(String[] args) {
		
		String palabra = null;
		
		palabra = "HOLA";
		
		System.out.println(palabra);
		
		char letra = palabra.charAt(2);
		if (letra == 'A')
			System.out.println("La letra es A");
		else
			System.out.println("La letra NO es A");
		
		int longitud = palabra.length();
		
		System.out.println("La letra es " +letra); 
		System.out.println("La longitud es " +longitud);
		
		
		
	}

}
