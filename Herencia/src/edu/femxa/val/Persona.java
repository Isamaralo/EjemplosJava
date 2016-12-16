package edu.femxa.val;

public class Persona {
	
	//sección atributos
	private String nombre;
	private int edad;
	//fin sección atributos
	
	//sección métodos
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
	//fin sección métodos
}
