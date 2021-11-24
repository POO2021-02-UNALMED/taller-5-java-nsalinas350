package zooAnimales;

public class Mamifero extends Animal {
	private static Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public String isPelaje(){
		return this.pelaje;
	}
	public void setPelaje(boolean p){
		pelaje = p;
	}
	
	public String getPatas(){
		return this.patas;
	}
	public void setPatas(int p){
		patas = p;
	}
	

}
