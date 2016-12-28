package edu.femxa.val.orden;

import java.util.Scanner;

public class InsertarOrdenado {
	
	public static int pedirNumeroUsuario ()
    {
        int numero_usuario = 0;
        Scanner scanner = null;
            
            scanner = new Scanner(System.in);
            numero_usuario = scanner.nextInt();
            
        return numero_usuario;
    }
	
	/**
	 * Dado un array de enteros y un número, obtener la posición
	 * en la que va el número para que el array quede ordenado
	 * de menor a mayor
	 * @param ae Array de 5 enteros
	 * @param n Número a insertar en el array
	 * @return Posición en la que hay que insertar el número
	 */
	public static int obtenerPosicion (int[] ae, int n, int limite)
	{
		int pos = 0;
			
			while ((pos < limite) && (ae[pos] < n))
			{				
				pos++;
			}
		
		return pos;
	}
	
	/**
	 * Desplaza todos los elementos del array de enteros que recibe
	 * a una posición superior. El último valor se pierde
	 * @param ae Array de enteros a modificar
	 */
	public static void desplazar (int[] ae)
	{
		//int aux = ae[ae.length-1];
		int pos_final = ae.length-1;
		
		for (int i = pos_final; i > 0 ; i--) {
			ae[i] = ae[i-1];
		}
		
		//ae[0] = aux;
	}
	
	public static void desplazarDesdeHasta (int ae[], int desde, int hasta)
	{
		int pos_final = hasta+1;
		
		for (int i = pos_final; i > desde ; i--) {
			if(i < ae.length)
				ae[i] = ae[i-1];
		}
	}
	
	/**
	 * Muestra cada elemento de array de enteros y su posición
	 * @param ae Array de enteros a mostrar
	 */
	public static void mostrarArray (int[] ae)
	{
		for (int i = 0; i < ae.length; i++) {
			//System.out.println("Num en pos " + (i+1) + " " + ae[i]);
			System.out.print(ae[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		int ae[] = new int [5];
//		
//		ae[0] = 1;
//		ae[1] = 2;
//		ae[2] = 5;
//		ae[3] = 6;
//		ae[4] = 7;
//		
//		int n_usuario = 3;
//		int pos = 0;
//		
//		pos = obtenerPos(ae, n_usuario);
//		System.out.println(pos);
//		
//		desplazar(ae);
//		for (int i = 0; i < ae.length; i++) {
//			System.out.println(ae[i]);
//		}
		
		int ae2[] = new int [10];
        int num_usuario = 0;
        int pos = 0;
        
		for (int i = 0; i < 10; i++) 
		{
	          System.out.println("Introduzca el número " +(i+1));
	          num_usuario = pedirNumeroUsuario();
	          
	          pos = obtenerPosicion(ae2, num_usuario, i);
	          desplazarDesdeHasta(ae2, pos, i);
	          ae2[pos] = num_usuario; //Coloco el número
	          mostrarArray(ae2);
		}
	}

}
