package edu.femxa.val.jdbc.ejercicioCasa;

import java.sql.Date;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private Date fecha_inicio;
	private int id_job;
	
	public Empleado(int id, String nombre, String apellido, Date fecha_inicio, int id_job) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_inicio = fecha_inicio;
		this.id_job = id_job;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public int getId_job() {
		return id_job;
	}
	public void setId_job(int id_job) {
		this.id_job = id_job;
	}
	
}