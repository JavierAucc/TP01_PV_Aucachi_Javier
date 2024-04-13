package ar.edu.unju.fi.ejercicio9.Model;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private float descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public float calcularDescuento() {
		float desc = this.descuento;
		float total = this.precio;
		if(this.descuento >0 && this.descuento <= 50) {
			float aux = (this.precio*desc)/100;
			total -= aux;
		}
		return total;
	}
	
	public void MostrarDatos() {
		System.out.println("\n Producto: "+this.nombre);
		System.out.println("\n Codigo: "+this.codigo);
		System.out.println("\n Precio: $"+this.precio);
		if(this.descuento<1 || this.descuento>50) {
		System.out.println("\n Descuento: Sin Descuento");
		}
		else {
			System.out.println("\n Descuento: %"+this.descuento);
			System.out.println("\n Precio con Descuento: "+calcularDescuento());
			
		}
		
	}
	
}
