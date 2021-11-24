package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	static private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		Reptil.listado.add(this);
	}
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	public int getLargoCola(){
		return this.largoCola;
	}
	public void setLargoCola(int l){
		largoCola = l;
	}

	public String movimiento() {
		return "reptar";
	}
	static public ArrayList<Reptil> getListado(){
		return Reptil.listado;
	}
}
