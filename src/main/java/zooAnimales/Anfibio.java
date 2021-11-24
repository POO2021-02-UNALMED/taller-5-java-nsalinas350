package zooAnimales;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Ave() {}
	public Mamifero(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorPiel;
		this.venenoso = venenoso;
	}
	
	public String getColorPiel(){
		return this.colorPiel;
	}

	public boolean isvenenoso(){
		return this.venenoso;
	}
	
}
