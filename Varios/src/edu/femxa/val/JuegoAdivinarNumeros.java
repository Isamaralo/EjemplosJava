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
	
	/**
	 * Genera un n�mero aleatorio.
	 * @return El n�mero aleatorio generado.
	 */
	public static int generarAleatorio()
	{
		int num_aleatorio = (int) (100 * Math.random()+1);
		return num_aleatorio;
	}
	
	/**
	 * Lee un n�mero entero que el usuario introduce por teclado.
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
	 * Compara el dos n�meros, el que se ha introducido con el aleatorio, y muestra 
	 * cual es mayor y el n�mero de intentos que le quedan al usuario.
	 * @param num_introducido N�mero que se lee desde teclado.
	 * @param num_aleatorio N�mero que se genera aleatoriamente y es el que hay que adivinar.
	 * @param intentos N�mero de veces que puedes intentar adivinar el n�mero.
	 */
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
