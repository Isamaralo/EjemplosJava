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
	 * Compara dos n�meros y devuelve una cadena con el resultado.
	 * @param num_introducido Uno de los n�meros a comparar.
	 * @param num_aleatorio Otro de los n�meros a comparar.
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
	 * Muestra un mensaje con el resultado y el n�mero de intentos que le quedan al usuario.
	 * @param resultado Mensaje a imprimir.
	 * @param intentos N�mero de intentos que le quedan al usuario.
	 */
	public static void mostrarResultados(String resultado, int intentos)
	{
		switch (resultado){
		case "mayor": 
			System.out.println("El n�mero introducido es mayor. Te quedan " + (5-intentos) + " oportunidades");
			break;
		case "menor":
			System.out.println("El n�mero introducido es menor. Te quedan " + (5-intentos) + " oportunidades");
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
		
		System.out.println("Se ha generado un n�mero aleatorio entre 1 y 100. Adivina el n�mero (tienes 5 oportunidades): ");
		
		do
		{
			num_introducido = pedirNumero();
			intentos++;
			resultado = compararNumeros(num_introducido, num_aleatorio);
			mostrarResultados(resultado, intentos);
		}
		while ((intentos < 5) && (num_introducido != num_aleatorio));
		
		if(num_introducido != num_aleatorio)
			System.out.println("Has perdido. El n�mero era " + num_aleatorio);
	}

}
