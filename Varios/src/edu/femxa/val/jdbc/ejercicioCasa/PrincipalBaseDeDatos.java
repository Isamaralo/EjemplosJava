package edu.femxa.val.jdbc.ejercicioCasa;

public class PrincipalBaseDeDatos {
	
	public static void main(String[] args) {
		
		int opcion = 0;
		Integer id = 0;
		String nombre = null;
		String apellido = null;
		String email = null;
		String fecha_inicio = null;
		String id_job = null;
		
		do
		{
			EntradaSalida.mostrarMenu();
			try {
				opcion = EntradaSalida.pedirEntero();
				switch (opcion){
					case 1:
						
						System.out.println("Introduzca los datos del nuevo empleado: ");
						System.out.println("Introduzca el id del empleado: ");
						id = EntradaSalida.pedirEntero();
						
						System.out.println("Introduzca el nombre del empleado: ");
						nombre = EntradaSalida.pedirCadena();
						
						System.out.println("Introduzca el apellido del empleado: ");
						apellido = EntradaSalida.pedirCadena();
						
						System.out.println("Introduzca el email del empleado: ");
						email = EntradaSalida.pedirCadena();
						
						System.out.println("Introduzca la fecha en la que comienza a trabajar (dd/mm/yy): ");
						fecha_inicio = EntradaSalida.pedirCadena();
						
						System.out.println("Introduzca el id del trabajo que desempeña: ");
						id_job = EntradaSalida.pedirCadena();
						
						if(OperacionesBD.altaEmpleado(id, nombre, apellido, email, fecha_inicio, id_job))
							System.out.println("Empleado dado de alta correctamente.\n");
						else
							System.out.println("Error al dar de alta empleado.\n");
						
						break;
					
					case 2:
						
						System.out.println("Introduzca el id del empleado que quiere eliminar: ");
						id = EntradaSalida.pedirEntero();
						
						if(OperacionesBD.bajaEmpleado(id))
							System.out.println("Empleado eliminado correctamente.\n");
						else
							System.out.println("Error al dar de baja empleado.\n");
						
						break;
					
					default:
						break;
				}
			} catch (Exception e) {
				System.out.println("Ha introducido un caracter incorrecto.\n");
			}			
		}
		while(opcion!=3);

	}

}
