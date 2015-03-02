package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;


public abstract class AbtractShape implements Shape{
	private String tipo;
	public AbtractShape(String tipo){
		this.tipo = tipo;
		
	}
	@Override
	public String toString () {
		return ("I'm a " + tipo);

    }
}
