package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Sistema {

	public static void main(String[] args) {
		Lectora lectora;
		try {
			lectora = new Lectora("Hola.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
		System.out.println(lectora.LectordeLinea());
	    
		}
		catch (IOException e){
			 System.out.println("no se ha asdasd " + e.getMessage());
			
		}
	}
}


