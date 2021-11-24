package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zoologico(String nombre, Zoologico zoo){
		this.nombre = nombre;
		this.zoo = zoo;
		//zoo.agregarZonas();
	}
	
	public String getNombre(){
		reuturn this.nombre;
	}
	
	public String getZoo(){
		reuturn this.zoo;

}
