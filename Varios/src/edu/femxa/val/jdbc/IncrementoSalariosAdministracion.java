package edu.femxa.val.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class IncrementoSalariosAdministracion {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		String aumentar_Salario = null;
		int i_res = 0;
		
		int id_empleado = 0;
		int salario_anterior = 0;
		int salario_posterior = 0;
		String fecha = null;
		
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
	  	        stmt = conn.createStatement(); 
	  	        aumentar_Salario = "UPDATE EMPLOYEES SET SALARY = SALARY + (SALARY*0.2) WHERE DEPARTMENT_ID = 10";
	  	        i_res = stmt.executeUpdate(aumentar_Salario);
				if(i_res > 0)
					System.out.println(i_res +" fila/s actualizada/s.");
				else
					System.out.println("No se ha actualizado el salario de ningún empleado.");
				
				rset = stmt.executeQuery(Consultas.CONSULTA_HISTORICO_AUMENTOS_SALARIO);
	  	        while (rset.next()) 
				{	
			   		 id_empleado = rset.getInt("EMPLOYEE_ID");
				   	 salario_anterior = rset.getInt("SALARIO_ANTERIOR");
				   	 salario_posterior = rset.getInt("SALARIO_POSTERIOR");
				   	 fecha = rset.getString("FECHA");
				}
	  	        System.out.println("Id del empleado: "+id_empleado+" Salario antes: "+salario_anterior+" Salario después: "+salario_posterior+" Fecha: "+fecha);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally 
			{
				if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	  	        if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
			} 
	}

}
