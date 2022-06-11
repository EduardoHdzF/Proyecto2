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
	private Jugador jug;
	
	
	public Maquina(){
			
		jug = new Jugador();
		mini = new ArbolBinarioCompleto<Integer>();	
		tablero = new Tablero();
		jug.setFicha("\033[96m");
		jug.setColor("Color 2");
	}
	
	public Maquina(Tablero t){
		
		jug = new Jugador();
		mini = new ArbolBinarioCompleto<Integer>();	
		tablero = t;
		colores = t.getColores();
		jug.setFicha("\033[96m");
		jug.setColor("Color 2");
	
	}	
	
	public void tira(){
	
	}
	
	public void minimax(){
	
		
	
	}
}
