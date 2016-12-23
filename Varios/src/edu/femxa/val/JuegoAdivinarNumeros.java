package edu.femxa.val;

import java.util.Scanner;

/**
 * Construir un programa que simule el juego de la adivinanza de números. El programa debe
 * generar un número aleatorio entre 1 y 100 y el usuario tiene 5 oportunidades. Después de
 * cada intento el programa debe indicar si el número introducido es mayor, menor o igual.
 * @author Administrador
 *
 */
public class JuegoAdivinarNumeros {
	
	/**
	 * Genera un número aleatorio.
	 * @return El número aleatorio generado.
	 */
	public static int generarAleatorio()
	{
		int num_aleatorio = (int) (100 * Math.random()+1);
		return num_aleatorio;
	}
	
	/**
	 * Lee un número entero que el usuario introduce por teclado.
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
	 * Compara el dos números, el que se ha introducido con el aleatorio, y muestra 
	 * cual es mayor y el número de intentos que le quedan al usuario.
	 * @param num_introducido Número que se lee desde teclado.
	 * @param num_aleatorio Número que se genera aleatoriamente y es el que hay que adivinar.
	 * @param intentos Número de veces que puedes intentar adivinar el número.
	 */
	public static void compararNumeros(int num_introducido, int num_aleatorio, int intentos)
	{
		String resultado = null;
		if (num_introducido < num_aleatorio)
		{
			System.out.println("El número aleatorio es mayor. Te quedan " + (5-intentos) + " oportunidades");
		}
		else if (num_introducido > num_aleatorio)
		{
			System.out.println("El número aleatorio es menor. Te quedan " + (5-intentos) + " oportunidades");
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
		System.out.println("Se ha generado un número aleatorio entre 1 y 100. Adivina el número (tienes 5 oportunidades): ");
		
		do
		{
			num_introducido = pedirNumero();
			intentos++;
			compararNumeros(num_introducido, num_aleatorio, intentos);
		}
		while ((intentos < 5) && (num_introducido != num_aleatorio));
		
		if(num_introducido != num_aleatorio)
			System.out.println("Has perdido. El número era " + num_aleatorio);
	}

}
