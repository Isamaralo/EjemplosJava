package edu.femxa.val.herencia;

public class Alumno extends Persona{
	
	private int nota;
	
	/*@Override
	public void mostrarPersona() {
		// TODO Auto-generated method stub
		//super.mostrarPersona();
		System.out.println("Ha llamado al mostrarPersona de Alumno.");
	}*/
	
	@Override
	public String toString() {
		String str_dev = null;
		
			str_dev = this.getNombre()+" "+this.getEdad()+" "+this.nota;
		
		return str_dev;
		// TODO Auto-generated method stub
		//return super.toString(); //Llamo al método del padre
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
