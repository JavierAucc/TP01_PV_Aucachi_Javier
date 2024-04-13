package ar.edu.unju.fi.ejercicio9.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.Model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		int n = 3 ;
		while(n>0) {
			
			Producto producto = new Producto();
			
			System.out.println("\n Ingrese Nombre del Producto: ");
			String nombre = scanner.next();
			System.out.println("\n Ingrese Codigo del Producto: ");
			String codigo = scanner.next();
			System.out.println("\n Ingrese Precio del Producto: ");
			Float precio = scanner.nextFloat();
			System.out.println("\n Ingrese Descuento del Producto: ");
			float descuento = scanner.nextFloat();
			scanner.nextLine();
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
			producto.MostrarDatos();
			
			n--;
			
		}
		
		scanner.close();
	}

}
