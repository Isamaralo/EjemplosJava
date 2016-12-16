package edu.femxa.val;

import java.util.Scanner;

public class NumerosPares {
	
	public static int pedirNumero()
	{
		int numLeido = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			numLeido = sc.nextInt();
	        
		return numLeido;
	}
	
	public static boolean esPar(int numero)
	{
		boolean bul = false;
		
			if(numero % 2 == 0)
				bul = true;
			else bul = false;
		
		return bul;
	}
	
	public static void main(String[] args) {
		
		int n_pares_quiere = 0;
		int n_pares_aparecidos = 0;
		int contador = 0;
		
		System.out.println("¿Cuántos pares quieres?");
		n_pares_quiere = pedirNumero();
		
		while (n_pares_aparecidos < n_pares_quiere)
		{
			if(esPar(contador))
			{
				System.out.println(contador);
				n_pares_aparecidos++;
			}
			contador++;
		}
		System.out.println("Han aparecido " + n_pares_aparecidos + " pares.");
	}

}
		
		/*for(int i = 0; n_pares_aparecidos < n_pares_quiere; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
				n_pares_aparecidos++;
			}
		}*/
		/*
		int j = 0;
		while (n_pares_quiere > 0)
		{
			if (j % 2 == 0)
			{
				System.out.println(j);
				n_pares_quiere--;
			}

			j++;
		}*/
		
		/*
		int j = 0;
		do
		{
			if (j % 2 == 0)
			{
				System.out.println(j);
				n_pares_quiere--;
			}
			
			j++;
			
		} while (n_pares_quiere > 0);*/
		
		
		
		
	
