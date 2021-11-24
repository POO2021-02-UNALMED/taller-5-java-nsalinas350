package zooAnimales;

public class Reptil extends Animal{
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
	
	public int getLargoCola(){
		return this.largoCola;
	}
	public String setLargoCola(int l){
		largoCola = l;
	}

	
}
