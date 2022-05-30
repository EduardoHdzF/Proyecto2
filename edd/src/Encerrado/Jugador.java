package edd.src.Encerrado;

import edd.src.Estructuras.*;


/**
 * Clase Jugador
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Jugador{
	
	private String nombre;	
	private String ficha;
	
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
	public String getFicha(){
		return this.ficha;	
	}
	public void setFicha(String f){
		ficha = f;	
	}
}	
