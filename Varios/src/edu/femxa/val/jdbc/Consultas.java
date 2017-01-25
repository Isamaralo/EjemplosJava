package edu.femxa.val.jdbc;

public class Consultas {

	public static final String CONSULTA_EMPLEADOS_SALARIO_DESCENDENTE = "SELECT E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY, E.DEPARTMENT_ID, D.DEPARTMENT_NAME FROM DEPARTMENTS D, EMPLOYEES E WHERE D.DEPARTMENT_ID=E.DEPARTMENT_ID ORDER BY E.SALARY DESC";
	public static final String CONSULTA_EMPLEADOS_ADMINISTRACION = "SELECT E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY, E.DEPARTMENT_ID, D.DEPARTMENT_NAME FROM DEPARTMENTS D, EMPLOYEES E WHERE D.DEPARTMENT_ID=E.DEPARTMENT_ID AND D.DEPARTMENT_NAME = 'Administration'";
	public static final String CONSULTA_EMPLEADOS_SALARIO_ASC = "SELECT * from EMPLOYEES ORDER BY SALARY DESC";
	public static final String 
	CONSULTA_EMPLEADOS_SALARIO_ADMON_E_IT 
	= "SELECT first_name, salary FROM "
			+ "EMPLOYEES where department_id IN "
			+ "(SELECT department_id FROM "
			+ "DEPARTMENTS WHERE department_name = "
			+ "'Administration' or "
			+ "department_name = 'IT')";
	
	public static final String 
	ACTUALIZAR_EMPLEADOS_SALARIO_ADMON_E_IT 
	= "UPDATE EMPLOYEES SET salary = (salary * 1.2) "
			+ "where department_id IN "
			+ "(SELECT department_id FROM "
			+ "DEPARTMENTS WHERE department_name = "
			+ "'Administration' or "
			+ "department_name = 'IT')";
	public static final String CONSULTA_HISTORICO_AUMENTOS_SALARIO = "SELECT EMPLOYEEgf_ID, SALARIO_ANTERIOR, SALARIO_POSTERIOR, FECHA FROM INCREMENTOS_SALARIO WHERE FECHA > '25/01/17'";
}
