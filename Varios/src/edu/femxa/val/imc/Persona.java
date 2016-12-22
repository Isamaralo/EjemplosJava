package edu.femxa.val.imc;

public class Persona {
	
	private double peso;
	private double altura;
	private TipoIMC imc;
	
	
	public Persona(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public TipoIMC getImc() {
		return imc;
	}
	public void setImc(TipoIMC imc) {
		this.imc = imc;
	}
	
	
}
