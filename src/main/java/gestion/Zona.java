package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zona() {
	}
	public Zona(String nombre, Zoologico zoo){
		this.nombre = nombre;
		this.zoo = zoo;
		//zoo.agregarZonas();
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public void String setNombre(String n){
		this.nombre = n;
	}
	
	public Zoo getZoo(){
		return this.zoo;
	}
	public void String setZoo(Zoologico z){
		this.zoo = z;
	}

}