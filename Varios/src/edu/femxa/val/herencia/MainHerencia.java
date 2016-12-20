package edu.femxa.val.herencia;

public class MainHerencia {
	
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		
		alumno.setNombre("Nira");
		alumno.setEdad(26);
		alumno.setNota(5);
		
		alumno.mostrarPersona();
		System.out.println("HASHCODE: " +alumno.hashCode());
		System.out.println("TOSTRING: " +alumno.toString());
		
		alumno2.setNombre("Nira");
		alumno2.setNota(5);
		alumno2.setEdad(27);
		
		//alumno2 = alumno;
		
		if (alumno.equals(alumno2))
			System.out.println("Alumno y Alumno2 son iguales");
		
		else
			System.out.println("Alumno y Alumno2 NO son iguales");
		
		if (alumno instanceof Persona)
			System.out.println("alumno es objeto de la clase Persona");
			
		if (alumno instanceof Alumno)
			System.out.println("alumno es objeto de la clase Alumno");
		
		if (alumno instanceof Object)
			System.out.println("alumno es objeto de la clase Object");
	}
	

}
