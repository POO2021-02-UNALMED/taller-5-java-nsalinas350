package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	static private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		Mamifero.listado.add(this);
	}
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	public boolean isPelaje(){
		return this.pelaje;
	}
	public void setPelaje(boolean p){
		pelaje = p;
	}
	
	public int getPatas(){
		return this.patas;
	}
	public void setPatas(int p){
		patas = p;
	}
	
	static public ArrayList<Mamifero> getListado(){
		return Mamifero.listado;
	}
	
	static public int cantidadMamiferos() {
		return Mamifero.getListado().size();
	}

	static public Mamifero crearCaballo(String nombre,int edad,String genero) {
		caballos++;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	
	static public Mamifero crearLeon(String nombre,int edad,String genero) {
		leones++;
		return new Mamifero(nombre,edad,"selva",genero,true,4);
	}
	
}
