package zooAnimales;

public class Reptil {
	private static Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {}
	public Reptil(String nombre,int edad,String habitat,String genero,int largoCola) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.largoCola = largoCola;
	}
	
	public String getLargoCola(){
		return this.largoCola;
	}

	
}
