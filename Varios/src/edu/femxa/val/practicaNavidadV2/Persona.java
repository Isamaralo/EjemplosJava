package edu.femxa.val.practicaNavidadV2;

import org.omg.Messaging.SyncScopeHelper;

public class Persona {

	private int edad;
	private String nombre;
	
	public Persona ()
	{
		//constructor por defecto
	}
	/**
	 * Constructor usando parámetros
	 * @param nombre 
	 * @param edad
	 */
	public Persona (String nombre, int edad)
	{
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res = null;
		
			res = "Nombre: " +this.getNombre() + "   Edad: " +this.getEdad();
		
		return res;
	}
	
	
}