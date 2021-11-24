package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	static private ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {}
	public Ave(String nombre,int edad,String habitat,String genero,String colorplumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorplumas;
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
}
