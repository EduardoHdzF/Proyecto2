package edd.src.Encerrado;

import src.Estructuras.*;


/**
 * Clase Jugador
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Jugador{
	
	private String nombre;	
	
	
	public Jugador(){
		nombre = "Jugador";
	}
	
	public void setNombre(String n){
		nombre = n;
	}
	public String getNombre(){
		return this.nombre;
	}
	
	public String toString(){		
		return this.nombre;		
	}
	
}	
