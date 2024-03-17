package edd.src.Encerrado;

import edd.src.Estructuras.*;


/**
 * Clase Jugador
 * @author Estrada García Luis Gerardo 
 * @author Hernandez Floriano Eduardo 
 */
public class Jugador{
	
	private String nombre;	
	private String ficha;
	private String color;
	
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
		this.ficha = f;	
	}
	public String getColor(){
		return this.color;	
	}
	public void setColor(String c){
		this.color = c;	
	}
}	
