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
	 * Compara dos números y devuelve una cadena con el resultado.
	 * @param num_introducido Uno de los números a comparar.
	 * @param num_aleatorio Otro de los números a comparar.
	 * @return Mayor, menor o igual.
	 */
	public static String compararNumeros(int num_introducido, int num_aleatorio)
	{
		String resultado = null;
		
		if (num_introducido < num_aleatorio)
			resultado = "menor"; 
			else if (num_introducido > num_aleatorio)
					resultado = "mayor";
				else if (num_introducido == num_aleatorio)
					resultado = "igual";
		
		return resultado;
	}
	
	/**
	 * Muestra un mensaje con el resultado y el número de intentos que le quedan al usuario.
	 * @param resultado Mensaje a imprimir.
	 * @param intentos Número de intentos que le quedan al usuario.
	 */
	public static void mostrarResultados(String resultado, int intentos)
	{
		switch (resultado){
		case "mayor": 
			System.out.println("El número introducido es mayor. Te quedan " + (5-intentos) + " oportunidades");
			break;
		case "menor":
			System.out.println("El número introducido es menor. Te quedan " + (5-intentos) + " oportunidades");
			break;
		case "igual":
			System.out.println("Acertaste!!");
			break;
		default:
			break;
		
		}
	}
	
	public static void main(String[] args) {
		
		int num_aleatorio = generarAleatorio(); 
		int intentos = 0;
		int num_introducido = 0;
		String resultado = null;
		
		System.out.println("Se ha generado un número aleatorio entre 1 y 100. Adivina el número (tienes 5 oportunidades): ");
		
		do
		{
			num_introducido = pedirNumero();
			intentos++;
			resultado = compararNumeros(num_introducido, num_aleatorio);
			mostrarResultados(resultado, intentos);
		}
		while ((intentos < 5) && (num_introducido != num_aleatorio));
		
		if(num_introducido != num_aleatorio)
			System.out.println("Has perdido. El número era " + num_aleatorio);
	}

}
