package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;

public class Tree {
	int longitud= 0;
	String tipo = ""; 
	Tree(){}
	Tree(int abc){
		longitud = abc;
		
	}
	Tree (String def){
		tipo = def;
	}
public Tree(int abc, String def){
	longitud = abc;
	tipo = def;
	}

public void escribir (){

if (this.longitud !=0 && this.tipo != ""){
	System.out.println("Un " +tipo+ " de " + longitud + " metros");
}
if (this.longitud ==  0 && this.tipo!= ""){
	System.out.println("Un " +tipo);
}
if (this.longitud == 0 && this.tipo == ""){
	System.out.println("Un arbol");
}
if (this.longitud != 0 && this.tipo == ""){
	System.out.println("Un arbol de " + longitud + " metros");
	
	
}
	
}
}
