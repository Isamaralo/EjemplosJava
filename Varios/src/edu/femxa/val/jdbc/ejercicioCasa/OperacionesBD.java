package edu.femxa.val.jdbc.ejercicioCasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OperacionesBD {
	
	/**
	 * M�todo que permite dar de alta un nuevo empleado en la base de datos.
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
  	        	System.out.println(i_res +" fila/s insertadas.");
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
	 * M�todo que permite dar de baja a un empleado de la base de datos.
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
  	        	System.out.println(i_res +" fila/s eliminadas.");
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

}
