package edu.femxa.val.argumentos;

public class CuentaArgumentos {

	public static void main(String[] args) {
		
		int num_argumentos = args.length;
		int mayor_longitud = 0;
		String arg_mayor_longitud = null;
		
		for (int i = 0; i < num_argumentos; i++) 
		{
			if(args[i].length() > mayor_longitud)
			{
				arg_mayor_longitud = args[i];
				mayor_longitud = args[i].length();
			}
		}
		
		System.out.println("El número de parámetros es " +num_argumentos+ " y el de mayor longitud es \"" + arg_mayor_longitud+ "\"");
	}
}
