package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;

public class App {
	public static void main(String args[]){
		
		Tree[] arboles = new Tree[5];
		arboles[0] = new Tree(4);
		arboles[1] = new Tree("Roble");
		arboles[2] = new Tree ();
		arboles[3] = new Tree (5,"Pino");
		arboles[4] = new Tree (20,"Bonsai");
		int i = 0;
		while (i<arboles.length){
		arboles [i].escribir();
		i++;
		}
		}
	}