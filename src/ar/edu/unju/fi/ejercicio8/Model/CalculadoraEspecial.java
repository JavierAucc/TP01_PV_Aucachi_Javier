package ar.edu.unju.fi.ejercicio8.Model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public float calcularSumatoria() {
		int k = 1;
		int i;
		float sumatoria = 0;
		for(i=this.n;i>0;i--) {
			sumatoria += Math.pow((k*(k+1)/2),2);
			k++;
		}
		return sumatoria;
	}
	public float calcularProductoria() {
		int k = 1;
		int i;
		float productoria = 0;
		for(i=this.n;i>0;i--) {
			productoria += k*(k+4);
			k++;
			
		}
		return productoria;
	}
	
	
	
}
