package edu.femxa.val;

import java.util.Scanner;

public class CalcularIMC {
	
	/**
	 * Pido un número de tipo Double por teclado al usuario.
	 * @return El número introducido por el usuario.
	 */
	public static double pedirNumeroDouble()
	{
		double numLeido = 0;
		
		    Scanner sc = new Scanner(System.in); //Declaro un objeto de la clase Scanner para leer de teclado (entrada estándar).
	        numLeido = sc.nextDouble(); //Leo de teclado y asigno el valor a num_leido.
	        
		return numLeido;
	}
	
	/**
	 * Pido un número de tipo Float por teclado al usuario.
	 * @return El número introducido por el usuario.
	 */
	public static float pedirNumeroFloat()
	{
		float numLeido = 0;
		Scanner sc = null;
		
		    sc = new Scanner(System.in); //Declaro un objeto de la clase Scanner para leer de teclado (entrada estándar).
	        numLeido = sc.nextFloat(); //Leo de teclado y asigno el valor a num_leido.
	        
		return numLeido;
	}
	
	/**
	 * Calculo el índice de masa corporal (IMC) a partir de los datos introducidos por teclado por el usuario.
	 * @param peso Dato introducido por teclado del peso.
	 * @param altura Dato introducido por teclado de la altura.
	 * @return
	 */
	public static float calcularIMC (float peso, float altura)
	{
		float imc = 0;
		
		    imc = peso / (altura*altura);
		    
		return imc;
	}
	
	/**
	 * Informo al usuario de su IMC nominal cualitativo.
	 * @param imc Valor numérico o cuantitativo del IMC.
	 */
	public static void mostrarResultadoIMC(float imc)
	{
		if (imc < 16)
			System.out.println("Desnutrido.");
	    
	        else if ((imc >= 16) && (imc < 18.5))
	    	    System.out.println("Bajo peso.");
	    
	            else if ((imc >= 18.5) && (imc < 25))
	    	        System.out.println("Normal.");
	    
	                else if ((imc >= 25) && (imc < 31))
	    	            System.out.println("Sobrepeso.");
	    
	                    else //if (imc >= 31)
	    	                System.out.println("Obeso.");
	}
	
	public static void main(String[] args) 
	{
		//1. Obtener peso.
		//2. Obtener altura.
		//3. Calcular IMC = peso / (altura*altura)
		//4. Mostrar.
		
		//sección de declaración
		float peso = 0;
		float altura = 0;
		float imc = 0;
		//fin de la sección de declaración
		
		System.out.println("Introduzca el peso (en Kg con coma, ej: 53,9): ");
		peso = pedirNumeroFloat();
		
		System.out.println("Introduzca la estatura (en m, ej: 1,67): ");
		altura = pedirNumeroFloat();
	   
		imc = calcularIMC(peso, altura);
	    
	    mostrarResultadoIMC(imc);
	}

}
