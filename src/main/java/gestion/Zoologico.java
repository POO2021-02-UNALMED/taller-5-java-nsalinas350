package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getUbicacion(){
		return this.ubicacion;
		
	}
	
	/*public agregarZonas(){
		
	}*/
}
