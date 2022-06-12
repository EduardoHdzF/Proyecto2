package edd.src.Encerrado;

import edd.src.Estructuras.*;
//import java.util.Random;

/**
 * Clase Tiro, nos ayudará en el arbol para registrar los tiros posibles y obtener alguna puntuación.
 * @author Hernandez Floriano Eduardo - 319121498
 * @author Estrada García Luis Gerardo - 319013832
 */
public class Tiro{
	
	private int puntuacion;
	private String tablerillo;
	private Tablero tab;//Aguas, aquí no existe el clone
	private String[] nodos;
	private Jugador participante;
	
	public Tiro(Tablero t, Jugador j){
		
		this.participante = j;
		this.tab = t;
		puntuacion = 0;
		nodos = t.getColores().clone();
		tablerillo = t.toString();		
				
	}
	
	public String toString(){
	
		String regresa = new String();
		regresa = "El participante es: " + participante + "\n";
		regresa = regresa + tablerillo + "\n";
		regresa = regresa + "Esquinas del 1 al 5\n"; 
		for(int i = 0; i < nodos.length; i++){
			regresa = regresa + (i+1) + " " + nodos[i] + "\n";		
		}
		return regresa;
	}
	
	public void opciones(int i){
		
		int v = tab.posVacia();
		//int a = aparicionFicha(1, ){
		if(i == 1){
		
			tab.mueve(participante, v, 1);
		}
		if(i == 2){
			
			tab.mueve(participante, v, 2);
		
		}else{
						
		}
	
	}	

}
