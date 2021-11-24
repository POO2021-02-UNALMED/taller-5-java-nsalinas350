package gestion;

import java.util.ArrayList;

public class Zoologico {
		
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
	}
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String n){
		this.nombre = n;
	}
	
	public String getUbicacion(){
		return this.ubicacion;
	}
	public void setUbicacion(String u){
		this.ubicacion = u;
	}
	
	public ArrayList<Zona> getZonas(){
		return this.zonas;
	}
	public void agregarZonas(Zona zona){
	this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales(){
		int cantidad = 0;
		for(int i = 0; i< zonas.size();i++) {
			cantidad = cantidad + zonas.get(i).cantidadAnimales();
		}
		return cantidad;
	}
	
}