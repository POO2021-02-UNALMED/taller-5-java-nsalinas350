package zooAnimales;

import gestion.*;

public class Animal {
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	
	static private int totalAnimales = 0;
	private Zona zona;
	
	public Animal() {	
	}
	public Animal(String nombre,int edad,String habitat,String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales++;
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
	
	public Zona getZona(){
		return this.zona;
	}
	public void setZona(Zona zona){
		this.zona = zona;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String toString() {
		if(zona == null){
		return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+
				", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero()+
				", la zona en la que me ubico es "+zona.getNombre()+", en el "
				+zona.getZoo().getNombre();
		}else {
		return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+
				", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
		}
	}
	
	public String totalPorTipo(){
		return "Mamiferos: "+ Mamifero.getListado().size()+"\n"+
				"Aves: "+ Ave.getListado().size()+"\n"+
				"Reptiles: "+ Reptil.getListado().size()+"\n"+
				"Peces: "+ Pez.getListado().size()+"\n"+
				"Anfibios: "+ Anfibio.getListado().size()+"\n";
	}
	
}
