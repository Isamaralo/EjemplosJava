package edu.femxa.val;

import java.util.Scanner;

/**
 * Construir un programa que simule el juego de la adivinanza de n�meros. El programa debe
 * generar un n�mero aleatorio entre 1 y 100 y el usuario tiene 5 oportunidades. Despu�s de
 * cada intento el programa debe indicar si el n�mero introducido es mayor, menor o igual.
 * @author Administrador
 *
 */
public class JuegoAdivinarNumeros {
	
	public static int generarAleatorio()
	{
		int num_aleatorio = (int) (100 * Math.random()+1);
		return num_aleatorio;
	}
	
	public static int pedirNumero()
	{
		int numLeido = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			numLeido = sc.nextInt();
	        
		return numLeido;
	}
	
	public static void compararNumeros(int num_introducido, int num_aleatorio, int intentos)
	{
		String resultado = null;
		if (num_introducido < num_aleatorio)
		{
			System.out.println("El n�mero aleatorio es mayor. Te quedan " + (5-intentos) + " oportunidades");
		}
		else if (num_introducido > num_aleatorio)
		{
			System.out.println("El n�mero aleatorio es menor. Te quedan " + (5-intentos) + " oportunidades");
		}
		else if (num_introducido == num_aleatorio)
		{
			System.out.println("Acertaste!!");
		}
	}
	
	public static void main(String[] args) {
		
		int num_aleatorio = generarAleatorio(); 
		int intentos = 0;
		int num_introducido = 0;
		System.out.println("Se ha generado un n�mero aleatorio entre 1 y 100. Adivina el n�mero (tienes 5 oportunidades): ");
		
		do
		{
			num_introducido = pedirNumero();
			intentos++;
			compararNumeros(num_introducido, num_aleatorio, intentos);
		}
		while ((intentos < 5) && (num_introducido != num_aleatorio));
		
		if(num_introducido != num_aleatorio)
			System.out.println("Has perdido. El n�mero era " + num_aleatorio);
	}

}
