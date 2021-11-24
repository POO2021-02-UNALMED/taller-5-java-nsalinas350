package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	static private ArrayList<Pez> listado = new ArrayList<Pez>();
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		Pez.listado.add(this);
	}
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	
	public String getColorEscamas(){
		return this.colorEscamas;
	}
	public void getColorEscamas(String c){
		colorEscamas = c;
	}

	public int getCantidadAletas(){
		return this.cantidadAletas;
	}
	public void getCantidadAletas(int c){
		cantidadAletas = c;
	}

	public String movimiento() {
		return "nadar";
	}
	
	static public ArrayList<Pez> getListado(){
		return Pez.listado;
	}
	
	static public int cantidadPeces() {
		return Pez.getListado().size();
	}
	
	/*static public void crearSalmon(String nombre,int edad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = "oceano";
		this.genero = genero;
		this.colorEscamas = "rojo";
		this.cantidadAletas = 6;
		Pez.listado.add(this);
		salmones++;
	}
	
	static public void crearBacalao(String nombre,int edad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = "oceano";
		this.genero = genero;
		this.colorEscamas = "gris";
		this.cantidadAletas = 6;
		Pez.listado.add(this);
		bacalaos++;
	}*/
}
