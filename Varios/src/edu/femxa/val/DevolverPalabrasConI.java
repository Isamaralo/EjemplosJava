package edu.femxa.val;

public class DevolverPalabrasConI {

	/**
	 * Hacer un programa que imprima los parámetros que reciba que contengan
	 * la letra "i" minúscula o mayúscula.
	 */
	/*
	 //Así se repetirían las palabras que tienen más de una i.
	 public static void main(String[] args) {
		
		for(int i = 0; i<args.length; i++)
		{
			for(int j = 0; j<args[i].length(); j++)
				if((args[i].charAt(j) == 'i') || (args[i].charAt(j) == 'I'))
					System.out.println(args[i]);
		}
	}
	*/
	
	public static boolean encontrarLetra (String palabra)
	{
		boolean b_dev = false;
		int i = 0;
			
			while(i<palabra.length() && !b_dev)
			{
				if(palabra.charAt(i)=='i' || palabra.charAt(i)=='I')
					b_dev = true;
				i++;
			}
			
		return b_dev;		
	}
	
	public static void main(String[] args) {
		
		boolean letraEncontrada = false;
		
		for(int i = 0; i<args.length; i++)
		{
			letraEncontrada = encontrarLetra(args[i]);
			if(letraEncontrada)
				System.out.println(args[i]);
		}
	}
}