package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	static private ArrayList<Ave> listado = new ArrayList<Ave>();
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		Ave.listado.add(this);
	}
	public Ave(String nombre,int edad,String habitat,String genero,String colorplumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorplumas;
		Ave.listado.add(this);
	}
	
	public String getColorPlumas(){
		return this.colorPlumas;
	}
	public void getColorPlumas(String c){
		colorPlumas = c;
	}
	
	public String movimiento() {
		return "volar";
	}

	static public ArrayList<Ave> getListado(){
		return Ave.listado;
	}
	
	static public int cantidadAves() {
		return Ave.getListado().size();
	}
	
	public void crearHalcon(String nombre,int edad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = "montanas”";
		this.genero = genero;
		this.colorPlumas = "cafe glorioso";
		Ave.listado.add(this);
		halcones++;
	}
	
	public void crearAguila(String nombre,int edad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = "montanas”";
		this.genero = genero;
		this.colorPlumas = "blanco y amarillo";
		Ave.listado.add(this);
		aguilas++;
	}
}
