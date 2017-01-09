package edu.femxa.val.practicaNavidad;

public class ArrayPersonas {
	
	/**
	 * Recorre una lista de personas, inserta el objeto
	 * persona en la primera posicion libre de la lista
	 * que encuentre e incrementa el contador de personas.
	 * @param array_personas Lista en la que se inserta la nueva persona
	 * @param persona Contiene los datos de la persona a insertar
	 */
	public static void insertarPersona (Persona[] array_personas, Persona persona)
	{
		int i = 0;
		while((i < array_personas.length) && (array_personas[i] != null))
		{
				i++;
		}
		if(array_personas[i] == null)
			array_personas[i] = persona;
		System.out.println("Persona introducida\n");
	}
	
	/**
	 * Recorre una lista de personas hasta la posición en 
	 * que se encuentra la última persona que hay en el 
	 * array y va imprimiendo los datos de cada persona.
	 * @param array_personas Lista que tiene que recorrer
	 * @param contador Número de personas que hay en la lista
	 */
	public static void listarPersonas (Persona[] array_personas, int contador)
	{
		for (int i = 0; i < contador; i++) {
			String res = array_personas[i].toString();
			System.out.println((i+1) + ". " +res);
		}
		System.out.println();
	}
	
	/**
	 * Recorre una lista de personas y elimina los datos
	 * de la primera persona cuyo nombre coincida el nombre 
	 * que se le pasa.
	 * @param array_personas Lista de personas
	 * @param nombre Nombre de la persona que hay que borrar
	 * @param contador Número de personas que hay en la lista
	 * @return true si se han eliminado los datos de alguien.
	 */
	public static boolean borrarPersona (Persona[] array_personas, String nombre, int contador)
	{
		boolean borrado = false;
		
		int i = 0;
		while (i<contador && !borrado)
		{
			if(array_personas[i].getNombre().equals(nombre))
			{
				array_personas[i] = null;
				borrado = true;
				System.out.println(nombre +" ha sido borrado.\n");
			}
		}
		if(!borrado)
			System.out.println("No hay ninguna persona en la lista de nombre " +nombre+ ".\n");
		return borrado;
	}
	
	/**
	 * Recorre una lista de personas e imprime los datos
	 * de aquella/s con la/s que coincida el nombre que se
	 * le pasa. Si no hay ninguna, muestra un mensaje 
	 * por pantalla informando.
	 * @param array_personas Lista de personas
	 * @param nombre Nombre de la persona a listar
	 * @param contador Número de personas que hay en la lista
	 */
	public static void buscarPersonaPorNombre (Persona[] array_personas, String nombre, int contador)
	{
		boolean encontrado = false;
		for (int i = 0; i < contador; i++) {
			if(array_personas[i].getNombre().equals(nombre))
			{
				encontrado = true;
				String res = array_personas[i].toString();
				System.out.println((i+1) + ". " +res);
			}
		}
		if(!encontrado)
			System.out.println("No hay niguna persona de nombre " +nombre+ ".\n");
		System.out.println();
	}
	
	/**
	 * Método burbuja para ordenar las personas de la
	 * lista de menor a mayor edad.
	 * @param array_personas Lista de personas
	 * @param contador Número de personas que hay en la lista
	 */
	public static void ordenarPersonasPorEdad (Persona[] array_personas, int contador)
	{
		Persona persona_aux = null;
		
        for (int i = 0; i < contador; i++)
        {
            for (int j = 0; j < contador-i-1; j++) {
                
                if(array_personas[j].getEdad() > array_personas[j+1].getEdad())
                {
                    persona_aux = array_personas[j+1];
                    array_personas[j+1] = array_personas[j];
                    array_personas[j] = persona_aux;
                }
            }
        }
        System.out.println("La lista de personas se ha ordenado por edad de menor a mayor.\n");
	}

	/**
	 * Inserta personas en la lista ordenándolas de menor a mayor
	 * edad.
	 * @param array_personas Lista de personas
	 * @param persona Datos de la persona a insertar
	 */
	public static void insertarPersonasOrdenadas (Persona[] array_personas, Persona persona)
	{
		int pos = 0;
		for (int i = 0; i < array_personas.length; i++) {
	          pos = obtenerPosicion(array_personas, persona.getEdad(), i);
	          desplazarDesdeHasta(array_personas, i, pos);
	          array_personas[pos] = persona;
		}
	}
	
	public static int obtenerPosicion (Persona[] array_personas, int n, int limite)
	{
		int pos = 0;
			
			while ((pos < limite) && (array_personas[pos].getEdad() < n))
			{				
				pos++;
			}
		
		return pos;
	}
	
	public static void desplazarDesdeHasta (Persona[] array_personas, int desde, int hasta)
	{
		int pos_final = hasta+1;
		
		for (int i = pos_final; i > desde ; i--) {
			if(i < array_personas.length)
				array_personas[i] = array_personas[i-1];
		}
	}
}