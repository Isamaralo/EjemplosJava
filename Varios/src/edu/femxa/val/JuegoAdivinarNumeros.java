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
	
	public static int pedirNumero()
	{
		int numLeido = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			numLeido = sc.nextInt();
	        
		return numLeido;
	}
	
	public static void main(String[] args) {
		
		int x = (int) (100 * Math.random()+1);
		int intentos = 0;
		int numero_introducido = 0;
		System.out.println("Se ha generado un número aleatorio entre 1 y 100. Adivina el número: ");
		
		do
		{
			numero_introducido = pedirNumero();
			intentos++;
			if (numero_introducido < x)
			{
				System.out.println("El número aleatorio es mayor. Te quedan " + (5-intentos) + " oportunidades");
			}
			else if (numero_introducido > x)
			{
				System.out.println("El número aleatorio es menor. Te quedan " + (5-intentos) + " oportunidades");
			}
			else if (numero_introducido == x)
			{
				System.out.println("Acertaste!!");
			}
		}
		while ((intentos < 5) && (numero_introducido != x));
		
		if(numero_introducido != x)
			System.out.println("Has perdido. El número era " + x);
	}

}
