package gestion;

public class Zoologico {
		
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
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
	
	/*public agregarZonas(){
		
	}*/
	
	//public int cantidadTotalAnimales(){}
	

		

}
