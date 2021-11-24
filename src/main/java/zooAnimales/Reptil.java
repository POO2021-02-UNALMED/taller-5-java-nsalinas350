package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	static private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		Reptil.listado.add(this);
	}
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	public String getColorEscamas(){
		return this.colorEscamas;
	}
	public void setColorEscamas(String c){
		this.colorEscamas = c;
	}
	
	public int getLargoCola(){
		return this.largoCola;
	}
	public void setLargoCola(int l){
		this.largoCola = l;
	}

	public String movimiento() {
		return "reptar";
	}
	static public ArrayList<Reptil> getListado(){
		return Reptil.listado;
	}
	
	static public int cantidadREptiles() {
		return Reptil.getListado().size();
	}
	
	/*static public void crearIguana(String nombre,int edad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = "humedal";
		this.genero = genero;
		this.colorEscamas = "verde";
		this.largoCola = 3;
		Reptil.listado.add(this);
		iguanas++;
	}
	
	static public void crearSerpiente(String nombre,int edad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = "jungla";
		this.genero = genero;
		this.colorEscamas = "blanco";
		this.largoCola = 1;
		Reptil.listado.add(this);
		serpientes++;*/
	}
}
