package edu.femxa.val;

public class VarArgsMain {

	//Especificar un número variable de argumentos, con los tres puntos
	private int registrarTelefonos (String ... telefonos)
	{
		for (String string : telefonos) {
			System.out.println(string);
		}
		return telefonos.length;
	}
	
	public static void main(String[] args) {
		
		VarArgsMain va = new VarArgsMain();
		System.out.println("Contenido n1: ");
		int n1 = va.registrarTelefonos("2");
		System.out.println("Longitud n1 = "+n1);
		
		System.out.println("Contenido n2: ");
		int n2 = va.registrarTelefonos("2", "3");
		System.out.println("Longitud n2 = "+n2);
		
		System.out.println("Contenido n3: ");
		int n3 = va.registrarTelefonos("2", "3", "5");
		System.out.println("Longitud n3 = "+n3);
		
	}
}
