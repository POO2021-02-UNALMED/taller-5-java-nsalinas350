package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	static private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		Mamifero.listado.add(this);
	}
	
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

	static public void crearCaballo(String nombre,int edad,String genero) {
		this(nombre,edad,"pradera",genero,true,4);
		caballos++;
	}
	
	static public void crearLeon(String nombre,int edad,String genero) {
		Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
	}
	
}
