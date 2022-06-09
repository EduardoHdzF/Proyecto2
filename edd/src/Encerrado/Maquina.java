package edd.src.Encerrado;

import edd.src.Estructuras.*;


/**
 * Clase Maquina, es donde se moverá nuestro árbol
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Maquina{

	public ArbolBinarioCompleto<Integer> mini;
	public Tablero tablero;
	public String[] colores;
	
	public Maquina(){
		
		mini = new ArbolBinarioCompleto<Integer>();	
		tablero = new Tablero();
	}
	public Maquina(Tablero t){
	
		mini = new ArbolBinarioCompleto<Integer>();	
		tablero = t;
		colores = t.getColores();
	
	}	
	
	
}
