package edu.femxa.val;
import java.util.Scanner;

/**
 * Haced un programa que pida una nota
 * hasta que sea aprobado (mayor que cinco).
 * 
 * @author Vale
 *
 */
public class PedirNota {
	
	public static int pedirNota()
	{
		int nota_Leida = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			nota_Leida = sc.nextInt();
	        
		return nota_Leida;
	}
	
	/**
	 * Recibe una nota y me dice si est� suspenso.
	 * @param nota La calificaci�n del alumno.
	 * @return true si nota es menor que 5 o false si mayor.
	 */
	public static boolean suspenso(int nota)
	{
		boolean b_suspenso = false;
		
			if(nota < 5)
				b_suspenso = true;
			else b_suspenso = false;
		
		return b_suspenso;
	}
	
	public static boolean aprobado(int nota)
	{
		boolean b_aprobado = false;
		
			if(nota >= 5)
				b_aprobado = true;
		
		return b_aprobado;
	}
	
	public static void main(String[] args) {
		
		int nota_introducida = 0;
		
		do
		{
			System.out.println("Dame nota: ");
			nota_introducida = pedirNota();
			
		}
		/*while (suspenso(nota_introducida));*/
		while (!aprobado(nota_introducida));
		
		System.out.println("Aprobaste. Enhorabuena!!");
		
	}

}
