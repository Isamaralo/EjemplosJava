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
	
	@Override
	public boolean equals(Object obj) {
		boolean b_dev = false;
		Alumno alumno_object = null;

			alumno_object = (Alumno) obj;
			if((this.getNombre().equals(alumno_object.getNombre())) 
					&& (this.getEdad() == alumno_object.getEdad()) 
					&& (this.nota == alumno_object.nota))
						b_dev = true;
		
		return b_dev;
		// TODO Auto-generated method stub
		//return super.equals(obj);
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
