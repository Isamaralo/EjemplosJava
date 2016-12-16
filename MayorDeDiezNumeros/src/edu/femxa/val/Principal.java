package edu.femxa.val;

import java.util.Scanner;

public class Principal {
	
	/**
	 * Pido un n�mero al usuario.
	 * @return El n�mero introducido por teclado.
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
	 * Comparo dos n�meros introducidos por teclado.
	 * @param num1 El primer n�mero introducido por el usuario.
	 * @param num2 El segundo n�mero introducido por el usuario.
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
	 * Imprimo el n�mero mayor.
	 * @param numMayor El mayor de los n�meros introducidos. 
	 */
	public static void imprimirNumeroMayor(int numMayor)
	{
		System.out.println("El mayor de los 10 n�meros es: " +numMayor);		    
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		int numMayor = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Introduzca el n�mero " +(i+1));
			num = pedirNumero();
			numMayor = compararDosNumeros(num, numMayor);
		}
		
		imprimirNumeroMayor(numMayor);
		
	}

}
