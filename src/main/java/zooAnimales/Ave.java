package zooAnimales;

public class Ave extends Animal {
	private static Ave[] listado;
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

}
