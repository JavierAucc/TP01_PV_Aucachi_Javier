package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
	private int diametro;
	private float precio;
	private double area;
	private boolean ingredienteEspecial;
	
	final int ADICIONAL20 = 500;
	final int ADICIONAL30 = 750;
	final int ADICIONAL40 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public boolean isIngredienteEspecial() {
		return ingredienteEspecial;
	}
	public void setIngredienteEspecial(boolean ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}
	
	public float calcularPrecio() {
		float precio = 0;
		switch(this.diametro) {
			case 20 :
				precio = 4500;
					if(this.ingredienteEspecial) {
						precio += ADICIONAL20;
					}
			break;
			case 30 :
				 precio = 4800;
					if(this.ingredienteEspecial) {
						precio += ADICIONAL30;
					}
			break;
			case 40 :
				 precio = 5500;
					if(this.ingredienteEspecial) {
						precio += ADICIONAL30;
					}
			break;
				
		}
		return precio;
	}
	
	public double calcularArea() {
		float radio = this.diametro / 2 ;
		this.area = Math.PI*(Math.pow(radio,2));
		return this.area;
	}
	
	public void mostrarDatos() {
		System.out.println("\n Diametro : "+this.diametro);
		System.out.println("\n Ingredientes Especiales : "+this.ingredienteEspecial);
		System.out.println("\n Precio Pizza : $ "+calcularPrecio());
		calcularArea();
		System.out.println("\n Area de la Pizza : "+this.area);
	}
	
}
