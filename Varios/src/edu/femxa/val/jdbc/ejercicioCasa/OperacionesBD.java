package edu.femxa.val.jdbc.ejercicioCasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import edu.femxa.val.jdbc.BaseDatos;
import edu.femxa.val.jdbc.Consultas;
import edu.femxa.val.jdbc.Empleado;

public class OperacionesBD {
	
	/**
	 * Método que permite dar de alta un nuevo empleado en la base de datos.
	 * @param id Id del nuevo empleado
	 * @param nombre Nombre del nuevo empleado
	 * @param apellido Apellido del nuevo empleado
	 * @param email Email del nuevo empleado
	 * @param fecha_inicio Fecha en la que comienza a trabajar
	 * @param id_job Id del trabajo del nuevo empleado
	 * @return True si el alta es correcto y false si no lo es
	 */
	public static boolean altaEmpleado (Integer id, String nombre, String apellido, String email, String fecha_inicio, String id_job)
	{
		boolean alta_realizada = false;
		String alta_empleado = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID) VALUES ('"+id+"', '"+nombre+"', '"+apellido+"', '"+email+"', to_date('"+fecha_inicio+"'), '"+id_job+"')";
		Connection conn = null; 
		Statement stmt = null; 
		int i_res = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
  	        stmt = conn.createStatement(); 
  	        i_res = stmt.executeUpdate(alta_empleado);
  	        if(i_res > 0)
  	        {
  	        	System.out.println("\n"+i_res +" fila/s insertada/s.");
  	        	alta_realizada = true;  	        	
  	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}   

		return alta_realizada;
	}
	
	/**
	 * Método que permite dar de baja a un empleado de la base de datos.
	 * @param id Id del empleado que hay que eliminar
	 * @return True si se ha eliminado correctamente y false si no
	 */
	public static boolean bajaEmpleado (Integer id)
	{
		boolean eliminado = false;
		String baja_empleado = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID ="+id+"";
		Connection conn = null; 
		Statement stmt = null; 
		int i_res = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
  	        stmt = conn.createStatement(); 
  	        i_res = stmt.executeUpdate(baja_empleado);
  	        if(i_res > 0)
  	        {
  	        	System.out.println("\n"+i_res +" fila/s eliminada/s.");
  	        	eliminado = true;
  	        }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}   

		return eliminado;
	}
	
	/**
	 * Método que aumenta el salario de los empleados que trabajan 
	 * en el departamento de Administración.
	 * @return True si se ha actualizado alguna fila y false si no
	 */
	public static boolean aumentaSalarioAdministracion ()
	{
		ArrayList<Empleado> lista_empleados = null;
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		Statement stmt2 = null;
		Integer id = 0;
		String nombre = null;
		Integer salario = 0;
		int depto = 0;
		String nombre_depto = null;
		String aumentar_Salario = null;
		boolean i_res = false;
		
			lista_empleados = new ArrayList<Empleado>();
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
	  	        stmt = conn.createStatement(); 
	  	        rset = stmt.executeQuery(Consultas.CONSULTA_EMPLEADOS_ADMINISTRACION);
	  	        while (rset.next()) 
				{	
			   		 	 id = rset.getInt(1);
				   		 nombre = rset.getString("FIRST_NAME");
				   		 salario = rset.getInt("SALARY");
				   		 depto = rset.getInt("DEPARTMENT_ID");
				   		 nombre_depto= rset.getString(5);
				   		 
				   		 lista_empleados.add(new Empleado(id, nombre, salario, depto, nombre_depto));
				}
	  	        aumentar_Salario = "UPDATE EMPLOYEES SET SALARY = SALARY + (SALARY*0.2) WHERE DEPARTMENT_ID = "+depto;
	  	        if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	  	        stmt2 = conn.createStatement();
	  	        i_res = stmt2.execute(aumentar_Salario);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
			{
				if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (stmt2 != null)	{ try {	stmt2.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
			  	   
			}   
		
		return i_res;
	}

}
