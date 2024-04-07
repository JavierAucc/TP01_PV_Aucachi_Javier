package ar.edu.unju.fi.ejercicio8.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.Model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un Numero");
		int num = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		calculadora.setN(num);
		
		System.out.println("SUMATORIA : "+calculadora.calcularSumatoria());
		System.out.println("PRODUCTORIA : "+calculadora.calcularProductoria());
		
		
	}

}
