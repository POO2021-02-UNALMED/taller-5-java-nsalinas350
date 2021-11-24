package zooAnimales;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public String getColorPiel(){
		return this.colorPiel;
	}
	public String setColorPiel(String c){
		colorPiel = c;
	}

	public boolean isVenenoso(){
		return this.venenoso;
	}
	public String setVenenoso(boolean v){
		venenoso = v;
	}
	
}
