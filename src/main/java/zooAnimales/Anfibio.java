package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	static private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public String getColorPiel(){
		return this.colorPiel;
	}
	public void setColorPiel(String c){
		colorPiel = c;
	}

	public boolean isVenenoso(){
		return this.venenoso;
	}
	public void setVenenoso(boolean v){
		venenoso = v;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	static public ArrayList<Anfibio> getListado(){
		return Anfibio.listado;
	}
	
	static public int cantidadAnfibios() {
		return Anfibio.getListado().size();
	}
	
	static public Anfibio crearRana(String nombre,int edad,String genero) {
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	}
	
	static public Anfibio crearSalamandra(String nombre,int edad,String genero) {
		salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
	}
}