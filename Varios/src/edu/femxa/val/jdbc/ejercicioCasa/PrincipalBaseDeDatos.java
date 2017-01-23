package edu.femxa.val.jdbc.ejercicioCasa;

import java.util.ArrayList;

import edu.femxa.val.jdbc.Empleado;

public class PrincipalBaseDeDatos {
	
	public static void mostrarLista (ArrayList<Empleado> lista_empleados)
	{
		for (Empleado empleado : lista_empleados) 
		{
			System.out.println(empleado.getId() +"\0" +empleado.getNombre() +"\t" +empleado.getSalario() +"\t" +empleado.getDpto() +"\t" +empleado.getNombre_dpto());
		}
	}
	
	public static void main(String[] args) {
		
		int opcion = 0;
		Integer id = 0;
		String nombre = null;
		String apellido = null;
		String email = null;
		String fecha_inicio = null;
		String id_job = null;
		ArrayList<Empleado> lista_empleados = null;

		lista_empleados = new ArrayList<Empleado>();
		
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
					
					case 3:
						
						if(OperacionesBD.aumentaSalarioAdministracion())
							System.out.println("Salario de los empleados de administración actualizado correctamente.\n");
						else
							System.out.println("Error al aumentar el salario a los empleados de administración.\n");
							
						break;
						
					default:
						break;
				}
			} catch (Exception e) {
				System.out.println("Ha introducido un caracter incorrecto.\n");
			}			
		}
		while(opcion!=4);

	}

}
