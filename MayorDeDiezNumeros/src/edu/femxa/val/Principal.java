package edu.femxa.val;

import java.util.Scanner;

public class Principal {
	
	/**
	 * Pido un número al usuario.
	 * @return El número introducido por teclado.
	 */
	public static int pedirNumero()
	{
		int numLeido = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			numLeido = sc.nextInt();
	        
		return numLeido;
	}
	
	/**
	 * Comparo dos números introducidos por teclado.
	 * @param num1 El primer número introducido por el usuario.
	 * @param num2 El segundo número introducido por el usuario.
	 */
	public static int compararDosNumeros(int num1, int num2)
	{
		int numMayor = 0;
		
			if(num1 > num2)
				numMayor = num1;
			else
				numMayor = num2;
	    
	    return numMayor;	
		
	}
	
	/**
	 * Imprimo el número mayor.
	 * @param numMayor El mayor de los números introducidos. 
	 */
	public static void imprimirNumeroMayor(int numMayor)
	{
		System.out.println("El mayor de los 10 números es: " +numMayor);		    
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		int numMayor = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Introduzca el número " +(i+1));
			num = pedirNumero();
			numMayor = compararDosNumeros(num, numMayor);
		}
		
		imprimirNumeroMayor(numMayor);
		
	}

}
