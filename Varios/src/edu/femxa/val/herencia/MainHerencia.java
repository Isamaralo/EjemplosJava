package edu.femxa.val.herencia;

public class MainHerencia {
	
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		alumno.setNombre("Nira");
		alumno.setEdad(26);
		
		alumno.mostrarPersona();
		System.out.println("HASHCODE: " +alumno.hashCode());
		System.out.println("TOSTRING: " +alumno.toString());
		
		if (alumno instanceof Persona)
			System.out.println("alumno es objeto de la clase Persona");
			
		if (alumno instanceof Alumno)
			System.out.println("alumno es objeto de la clase Alumno");
		
		if (alumno instanceof Object)
			System.out.println("alumno es objeto de la clase Object");
	}
	

}
