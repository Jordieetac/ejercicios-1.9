package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Lectora {
	private String linea;
	private File file;
	private FileReader lector;
	private BufferedReader bufferLector;
	
	public Lectora(String rutaArchivo) throws FileNotFoundException{
		file = new File(rutaArchivo);
		try{
			lector = new FileReader(file);
		}
		catch (FileSystemNotFoundException e){
			System.out.println(e.getMessage());
		}
	
		bufferLector = new BufferedReader(lector);
		}
	public String LectordeLinea () throws IOException{
		while (bufferLector.ready()){
			if(!(linea = bufferLector.readLine()).equals("\000"));
			return linea;
			}
		bufferLector.close();
		return "El archivo no tiene mas nada que leer.";
	}
	public String LectordeLinea1() {
		while (bufferLector.ready()){
			if(!(linea = bufferLector.readLine()).equals("\000"));
			return linea;
			}
		bufferLector.close();
		return "El archivo no tiene mas nada que leer.";
		// TODO Auto-generated method stub
		return null;
	}

}
