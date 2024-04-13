package ar.edu.unju.fi.ejercicio10.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.Model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		Scanner scanner = new Scanner(System.in);
		
		while(n != 4) {
			System.out.println("\n Ingrese Diametro de Pizza : 20 - 30 - 40");
			int diametro = scanner.nextInt();
			System.out.println("Ingredientes Especiales? True/False");
			boolean ingredienteEspecial = scanner.nextBoolean();
			
			if(diametro == 20 || diametro == 30 || diametro == 40) {
				
				Pizza pizza = new Pizza();
				pizza.setDiametro(diametro);
				pizza.setIngredienteEspecial(ingredienteEspecial);
				pizza.calcularPrecio();
				System.out.println("\n *** Pizza N° "+n);
				pizza.mostrarDatos();
				n++;
			}
			else {
				System.out.println("\n Diametro de Pizza Incorrecto:");
				System.out.println("Diametro validos : 20, 30, 40 !");
			}
			
		}
		
		
	}

}
