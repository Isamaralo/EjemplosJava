package edu.femxa.val;

public class Persona {
	
	//secci�n atributos
	private String nombre;
	private int edad;
	//fin secci�n atributos
	
	//secci�n m�todos
	public Persona()
	{
		
	}
	public Persona(String nombre_r, int edad_r)
	{
		this.nombre = nombre_r;
		this.edad = edad_r;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarPersona()
	{
		System.out.println("Nombre = " +this.nombre);
		System.out.println("Edad = " +this.edad);
	}
	//fin secci�n m�todos
}
