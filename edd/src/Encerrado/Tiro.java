package edd.src.Encerrado;

import edd.src.Estructuras.*;
//import java.util.Random;

/**
 * Clase Tiro, nos ayudará en el arbol para registrar los tiros posibles y obtener alguna puntuación.
 * @author Hernandez Floriano Eduardo - 
 * @author Estrada García Luis Gerardo -
 */
public class Tiro{
	
	private int puntuacion;
	protected String tablerillo;
	protected Tablero tab;	
	protected Jugador participante;
	protected boolean valido;//Nos ayuda para ver si se puede hacer el movimiento de alguna ficha o si ya no
	
	public Tiro(Tablero t, Jugador j){
		
		this.participante = j;
		this.tab = t.clone();
		puntuacion = 0;
		tablerillo = t.toString();		
		valido = true;			
	}
	
	public void setPuntuacion(int a){
	
		this.puntuacion = a;
	
	}
	
	public int getPuntuacion(){
	
		return this.puntuacion;
	
	}
	
	public String toString(){
	
		String regresa = "+++++++++++++++++++++++++++++++++++++++++++++";
		regresa = "El participante es: " + participante + "\n";
		regresa = regresa + tab + "\n";
		regresa = regresa + "Esquinas del 1 al 5\n"; 
		String[] nodos = tab.getColores();
		for(int i = 0; i < nodos.length; i++){
			regresa = regresa + (i+1) + " " + nodos[i] + "\n";		
		}
		regresa = regresa + " Puntuacion " + this.puntuacion;
		regresa = regresa + "\n+++++++++++++++++++++++++++++++++++++++++++++";
		return regresa;
	}
	
	public void opciones(int i){
		
		int v = tab.posVacia();
		
		if(i == 1){
		
			tab.mueve(participante, v, 1);
		
		}else if(i == 2){
			
			tab.mueve(participante, v, 2);
		
		}else{
			throw new IllegalArgumentException();		
		}
	
	}	

}
