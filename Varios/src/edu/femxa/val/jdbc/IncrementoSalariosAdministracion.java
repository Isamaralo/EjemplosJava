package edu.femxa.val.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class IncrementoSalariosAdministracion {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		String aumentar_Salario = null;
		int i_res = 0;
		
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
