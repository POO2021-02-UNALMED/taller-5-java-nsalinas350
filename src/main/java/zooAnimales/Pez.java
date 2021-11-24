package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	static private ArrayList<Pez> listado = new ArrayList<Pez>();
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

	public String movimiento() {
		return "nadar";
	}
	
	static public ArrayList<Pez> getListado(){
		return Pez.listado;
	}
}
