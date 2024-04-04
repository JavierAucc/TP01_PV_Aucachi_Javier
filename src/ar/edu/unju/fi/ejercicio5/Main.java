package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		
		int num = scanner.nextInt();
		if(num<1 || num>9) {
			System.out.println("Numero fuera de Rango !");
		}
		else {
			int indice;
			for(indice=0;indice<=10;indice++) {
				System.out.println(num+" x "+indice+" = "+num*indice);
			}
		}
	}

}
