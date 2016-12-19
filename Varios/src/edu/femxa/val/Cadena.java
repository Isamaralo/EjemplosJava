package edu.femxa.val;

public class Cadena {
	public static void main(String[] argumentos) {
		
				
//		System.out.println("Palabra 1 = " +argumentos[0]);
//		System.out.println("Palabra 2 = " +argumentos[1]);
//		System.out.println("Palabra 3 = " +argumentos[2]);
//		
//		int n_palabras = argumentos.length;
//		System.out.println(n_palabras);
		
		//Recorrer un array de palabras
		int posicion_inicial = 0;
		int posicion_final = argumentos.length;
		String palabra_actual = null;
		
		for (int i = posicion_inicial; i < posicion_final; i++) {
			palabra_actual = argumentos[i];
			System.out.println("La palabra " +i +" es " +palabra_actual);
		}
		
	}

}
