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
	 * Recibe una nota y me dice si está suspenso.
	 * @param nota La calificación del alumno.
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
	
	private static boolean notaAprobada(int n)
	{
		/**
		 * Este método es equivalente a aprobado.
		 */
		return(n >= 5);
	}
	
	public static boolean aprobado(int nota)
	{
		boolean b_aprobado = false;
		
			if(nota >= 5)
				b_aprobado = true;
		
		return b_aprobado;
	}
	
	private static void imprimeNotaAlfabetica(int notaNumerica)
	{
		switch (notaNumerica) {
		case 10:
			System.out.println("MATRÍCULA DE HONOR");
			break;
		case 9:
			System.out.println("SOBRESALIENTE");
			break;
		case 8:
		case 7:
			System.out.println("NOTABLE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
			
		default:
			System.out.println("INSUFICIENTE");
		}
	}
	
	public static void main(String[] args) {
		
		int nota_introducida = 0;
		
		do
		{
			System.out.println("Dame nota: ");
			nota_introducida = pedirNota();
			imprimeNotaAlfabetica(nota_introducida);
			
		}
		/*while (suspenso(nota_introducida));*/
		while (!aprobado(nota_introducida));
		
		//System.out.println("Aprobaste. Enhorabuena!!");

		
	}

}
