package zooAnimales;

public class Pez extends Animal {
	private static Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {}
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public String getColorEscamas(){
		return this.colorEscamas;
	}
	public void getColorEscamas(String c){
		colorEscamas = c;
	}

	public int getCantidadAletas(){
		return this.cantidadAletas;
	}
	public void getCantidadAletas(int c){
		cantidadAletas = c;
	}

}
