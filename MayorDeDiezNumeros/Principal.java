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
	 * Comparo los tres n�meros introducidos por teclado e imprimo por pantalla el mayor.
	 * @param num1 El primer n�mero introducido por el usuario.
	 * @param num2 El segundo n�mero introducido por el usuario.
	 * @param num3 El tercer n�mero introducido por el usuario.
	 */
	public static void compararNumeros(int num1, int num2, int num3)
	{
		int numMayor = 0;
		
		if(num1 > num2)
			numMayor = num1;
		else
			numMayor = num2;
	    if (num3 > numMayor)
		    numMayor = num3;
	    
	    System.out.println("El mayor de los tres n�meros es: " +numMayor);		    	
		
	}
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Introduzca el primer n�mero: ");
		num1 = pedirNumero();
		
		System.out.println("Introduzca el segundo n�mero: ");
		num2 = pedirNumero();
		
		System.out.println("Introduzca el tercer n�mero: ");
		num3 = pedirNumero();
		
		compararNumeros(num1, num2, num3);
		
	}

}
