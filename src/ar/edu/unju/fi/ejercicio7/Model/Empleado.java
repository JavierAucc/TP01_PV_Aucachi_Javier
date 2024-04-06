package ar.edu.unju.fi.ejercicio7.Model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	final double SALARIO_MINIMO = 210000.00;
	final double AUMENTOXMERITOS = 20000.00;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}
		else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void MostrarDatos() {
		System.out.println(" \n Nombre del empleado: "+this.nombre);
		System.out.println(" \n Legajo: "+this.legajo);
		System.out.println("\n Salario : $ "+this.salario);
	}
	public void AumentoSalario() {
		System.out.println("AUMENTO DE : "+AUMENTOXMERITOS);
		this.salario += AUMENTOXMERITOS;
	}
	
	
	
}
