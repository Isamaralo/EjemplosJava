package edu.femxa.val.practicaNavidadV2;

import edu.femxa.val.practicaNavidadV2.Persona;

public class ArrayPersonas {
	
	public static final int TAMANIO_LISTA = 5;
	
	private Persona[] array_personas;
	public int num_personas;
	
	public ArrayPersonas ()
	{
		this.array_personas = new Persona[TAMANIO_LISTA];
		this.num_personas = 0;
	}
	
	/**
	 * Inserta una persona en la primera posici�n
	 * vac�a de la lista.
	 * @param persona Objeto de tipo Persona a insertar
	 * @return True si se ha insertado y false si la lista est� llena
	 */
	public boolean insertarPersona (Persona persona)
	{
		boolean insertado = false;
		
			if (this.num_personas < TAMANIO_LISTA)
			{
				this.array_personas[num_personas] = persona;
				insertado = true;
				this.num_personas++;
			}
			
		return insertado;
	}
	
	/**
	 * Muestra por pantalla las personas que hay en la lista,
	 * su nombre y edad.
	 */
	public void listarPersonas ()
	{
		if(this.num_personas == 0)
			System.out.println("La lista est� vac�a.\n");
		else
		{
			for (int i = 0; i < this.num_personas; i++) {
				System.out.println((i+1) +". " +this.array_personas[i].toString());
			}
			System.out.println();
		}
	}
	
	/**
	 * Busca en la lista personas cuyo nombre coincida
	 * con el que se le pasa y devuelve a la primera 
	 * persona que encuentra con ese nombre.
	 * @param nombre Nombre de la persona a buscar
	 * @return Persona con el nombre o null si no encuentra ninguna persona con ese nombre
	 */
	public Persona buscarPersonaPorNombre (String nombre)
	{
		Persona persona = null;
		persona = new Persona();
		boolean encontrada = false;
			
			int i = 0;
			while (i<this.num_personas && !encontrada)
			{
				if (this.array_personas[i].getNombre().equals(nombre))
				{
					persona = array_personas[i];
					encontrada = true;
				}
				i++;
			}
		
		return persona;
	}
	
	/**
	 * Método que busca en la lista una persona cuyo nombre
	 * coincida con el que se le pasa y devuelva la posición 
	 * de esa persona.
	 * @param nombre Nombre de la persona a buscar
	 * @return La posición en la que se encuentra la persona y -1 si no hay ninguna persona con ese nombre
	 */
	public int buscarPersonaPos (String nombre)
	{
		int pos = -1;
		boolean encontrada = false;
			
			int i = 0;
			while (i<this.num_personas && !encontrada)
			{
				if (this.array_personas[i].getNombre().equals(nombre))
				{
					pos = i;
					encontrada = true;
				}
				i++;
			}
		
		return pos;
	}
	
	/**
	 * Borra los datos de la primera persona cuyo nombre coincida
	 * con el que se le pasa.
	 * @param nombre Nombre de la persona a borrar
	 * @return True si ha borrado a alguien y false si no 
	 */
	public boolean borrarPersona (String nombre)
	{
		boolean borrado = false;
			
			int i = 0;
			while (i<this.num_personas && !borrado)
			{
				if (this.array_personas[i].getNombre().equals(nombre))
				{
					this.array_personas[i] = null;
					borrado = true;
					this.num_personas--;
				}
				i++;
			}
		
		return borrado;
	}
	
	/**
	 * Ordena la lista de personas de menor a mayor edad.
	 */
	public void ordenarPersonasPorEdad ()
	{
		Persona persona_aux = null;
		if(this.num_personas == 0)
			System.out.println("La lista est� vac�a.\n");
		else
		{
	        for (int i = 0; i < this.num_personas; i++)
	        {
	            for (int j = 0; j < this.num_personas-i-1; j++) {
	                
	                if(this.array_personas[j].getEdad() > this.array_personas[j+1].getEdad())
	                {
	                    persona_aux = array_personas[j+1];
	                    array_personas[j+1] = array_personas[j];
	                    array_personas[j] = persona_aux;
	                }
	            }
	        }
        	System.out.println("La lista de personas se ha ordenado por edad de menor a mayor.\n");
	
		}
	}
}