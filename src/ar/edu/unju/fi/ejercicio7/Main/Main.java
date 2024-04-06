package ar.edu.unju.fi.ejercicio7.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.Model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n Ingrese Nombre: ");
		String nombre = scanner.next();
		System.out.println("\n Ingrese Legajo: ");
		int legajo = scanner.nextInt();
		System.out.println("\n Ingrese Salario: ");
		double salario = scanner.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		empleado.MostrarDatos();
		empleado.AumentoSalario();
		empleado.MostrarDatos();
		
	}

}
