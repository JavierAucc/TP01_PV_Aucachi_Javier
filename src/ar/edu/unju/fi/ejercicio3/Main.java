package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;// para usar scanner hay que importarla

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //creamos el objeto scanner  q lee la entrada
		//del sistema(system.in) siempre cerrar el objeto scanner como buena practica scanner.close()
		System.out.println("Ingrese un Numero");
		int num = scanner.nextInt(); // cuando se trato de numero se utiliza el metodo nextint
		int resultado;
		if(num%2==0) { //si es par mostrar el triple
			resultado = num*3;
			System.out.println("El numero ingresado es Par:");
			System.out.println("El triple es: "+resultado);
		}
		else { //si es impar se muestra su doble
			resultado = num*2;
			System.out.println("El numero ingresado es Impar:");
			System.out.println("El Doble es: "+resultado);
	}
	}
}
