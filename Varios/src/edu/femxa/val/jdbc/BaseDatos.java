package edu.femxa.val.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDatos {
	
	public static void mostrarLista (ArrayList<Empleado> lista_empleados)
	{
		for (Empleado empleado : lista_empleados) 
		{
			System.out.println(empleado.getId() +"\0" +empleado.getNombre() +"\t" +empleado.getSalario() +"\t" +empleado.getDpto() +"\t" +empleado.getNombre_dpto());
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = null; //Conexión
		ResultSet rset = null; //Conjunto de datos recuperados de la BD
		Statement stmt = null; //Instrucción
		ArrayList<Empleado> lista_empleados = null;
		Integer id = 0;
		String nombre = null;
		Integer salario = 0;
		Integer depto = 0;
		String nombre_depto = null;
		
		lista_empleados = new ArrayList<Empleado>();
		
		//Empleado empleado = new Empleado(3, "Juanjo", 27000, 5);
		//lista_empleados.add(empleado);		
		//mostrarLista(lista_empleados);
		
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Una de las clases que están en el jar, a la que va a pedir conexión la clase DriverManager
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@169.254.233.110:1521:xe", "HR", "password"); //es la cadena de conexión
  	        stmt = conn.createStatement(); //Creo una instrucción a partir de la conexión
			//rset = stmt.executeQuery("SELECT * from EMPLOYEES ORDER BY SALARY DESC"); //rset es como una lista
  	        rset = stmt.executeQuery(Consultas.CONSULTA_EMPLEADOS_SALARIO_DESCENDENTE);
  	        while (rset.next()) 
			{	
//			         System.out.println (rset.getString(1));  //Obtengo el campo 1, que en la tabla EMPLOYEES es el id
//			   		 System.out.println(rset.getString(2));  //Obtengo el campo 2, que es el nombre
		   		 	 id = rset.getInt(1);
			   		 nombre = rset.getString("FIRST_NAME");
			   		 salario = rset.getInt("SALARY");
			   		 depto = rset.getInt("DEPARTMENT_ID");
			   		 nombre_depto= rset.getString(5);
			   		 
			   		 lista_empleados.add(new Empleado(id, nombre, salario, depto, nombre_depto));
			}
			mostrarLista(lista_empleados);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}   

	}

}
