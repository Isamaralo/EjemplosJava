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
	 * Comparo los tres números introducidos por teclado e imprimo por pantalla el mayor.
	 * @param num1 El primer número introducido por el usuario.
	 * @param num2 El segundo número introducido por el usuario.
	 * @param num3 El tercer número introducido por el usuario.
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
	    
	    System.out.println("El mayor de los tres números es: " +numMayor);		    	
		
	}
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Introduzca el primer número: ");
		num1 = pedirNumero();
		
		System.out.println("Introduzca el segundo número: ");
		num2 = pedirNumero();
		
		System.out.println("Introduzca el tercer número: ");
		num3 = pedirNumero();
		
		compararNumeros(num1, num2, num3);
		
	}

}
