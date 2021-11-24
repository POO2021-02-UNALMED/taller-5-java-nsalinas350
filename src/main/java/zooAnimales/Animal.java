package zooAnimales;

import gestion.*;

public class Animal {
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	
	private int totalAnimales;
	private Zona zona;
	
	public Animal() {	
	}
	public Animal(String nombre,int edad,String habitat,String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public String getHabitat(){
		return this.habitat;
	}
	
	public String getGenero(){
		return this.genero;
	}

}
