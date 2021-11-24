package zooAnimales;

public class Animal {
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	
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
	
	public String getEdad(){
		return this.edad;
	}
	
	public String getHabitat(){
		return this.habitat;
	}
	
	public String getGenero(){
		return this.genero;
	}

}
