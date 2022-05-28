package edd.src.Encerrado;

import edd.src.Estructuras.*;

/**
 * Clase Tablero, nos representa el tablero y las fichas.
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Tablero{

	private String dibujo;
	private String ficha;						
	private boolean e1;
	private boolean e2;
	private boolean e3;
	private boolean e4;
				
	String f1 = "⣴⣿⣿⣿";
	String ff1 = "⠻⣿⣿⠟";
	
	String f2 = "⣴⣿⣿⣦";
	String ff2 = "⠻⣿⣿⢿";

	String f3 = "⣠⣾⣿⣷⡄";
	String ff3 = "⣹⢿⣿⡿⠃";
					
	String f4 = "⢱⣿⣿⣿⡄";
	String ff4 = "⠘⢿⣿⡿⠃";
	
	
	
	public Tablero(){
		
		dibujo = new String();
		ficha = new String();
		e1 = false;
		e2 = false;
		e3 = false;
		e4 = false;
	}
	
	/**
	 * Nos dibuja el tablero en forma de String
	 */
	public void dibujaTablero(int i){
	
		if(i == 1){
			dibujo = "";
			dibujo = "\033[1m \033[107m 1 \033[49m                                                     \033[107m 2 \033[0m\033[49m\n";
			dibujo = dibujo + "⣠⣾⣿⣿⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣴⣾⣿⣷⣦⠄\n";	
			dibujo = dibujo + "⣿⣿⣿⣿⣿⡗⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⣿⣿⣿⣿⣿⠇\n";
			dibujo = dibujo +"⠈⠻⢿⡿⠛⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⠛⠻⣿⠟⠋⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠉⠳⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⠞⠋⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠈⠙⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⠛⠁⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠉⠳⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⢦⣤⣶⣤⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠿⣿⣿⣿⠿⢧⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠙⠷⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠷⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠳⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⢀⣴⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⠄⠄⠄⣠⡶⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠳⣤⡀⠄⠄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⠄⠄⢸⡇⠄⠄⢀⣴⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣄⠄⠄⠄⣿⠄⠄⠄\n";
			dibujo = dibujo +"⢀⣴⣾⣷⣤⡶⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠓⣠⣴⣿⣶⣄⠄\n";
			dibujo = dibujo +"⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⡆\n";
			dibujo = dibujo +"⠙⠿⣿⡿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠹⢿⣿⡿⠟⠄%n";
			dibujo = dibujo +"\033[1m \033[107m 3 \033[49m                                                      \033[107m 4 \033[0m\033[49m";
		}else {
			
			
			dibujo = "";
			dibujo = "\033[1m\033[107m 2 \033[49m                                       \033[107m 3 \033[0m\033[49m\n";
			dibujo = dibujo + f2 + "⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀"+ f3 + "\n";
			dibujo = dibujo + ff2 + "⡉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉" + ff3 + "\n";
			dibujo = dibujo + "⠄⢰⡇⠄⠙⠢⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴⠚⠁⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠈⠳⢤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠔⠋⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠚⠁⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⣄⡀⠄⠄⠄⠄⠄⠄⣀⡴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢦⣀⣠⣀⣠⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠠⣿⣿⣿⣷⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠖⠛⠿⠟⠛⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴⠚⠁⠄⠄⠄⠄⠄⠄⠉⠲⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠖⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠚⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠲⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⣠⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⢤⡀⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⢀⡤⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⣀⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⢤⡀⠄⣿⠄⠄\n";
			dibujo = dibujo + f1 + "⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄" + f4 + "\n";
			dibujo = dibujo + ff1 + "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄" + ff4 + "\n";
			dibujo = dibujo + "\033[1m\033[107m 1 \033[49m                                       \033[107m 4 \033[0m\033[49m\n";
		}
		System.out.println(dibujo);
	}
	/**
	 * Nos dibuja las fichas en forma de String
	 */
	public void dibujaFicha(int o){
	
		if(o == 0){
			System.out.println("  \033[91m⢠⣶⣿⣿⣶⡄    \033[96m⢠⣶⣿⣿⣶⡄    \033[91m⢠⣶⣿⣿⣶⡄    \033[96m⢠⣶⣿⣿⣶⡄");
			System.out.println("  \033[91m⣿⣿⣿⣿⣿⣿    \033[96m⣿⣿⣿⣿⣿⣿    \033[91m⣿⣿⣿⣿⣿⣿    \033[96m⣿⣿⣿⣿⣿⣿");;
			System.out.println("  \033[91m⠘⠿⣿⣿⠿⠃    \033[96m⠘⠿⣿⣿⠿⠃    \033[91m⠘⠿⣿⣿⠿⠃    \033[96m⠘⠿⣿⣿⠿⠃\033[39m");
			System.out.println("  Ficha 1   Ficha 2   Ficha 3   Ficha 4");
		}else if( o == 1){
		
			System.out.println("            \033[91m⢠⣶⣿⣿⣶⡄    \033[91m⢠⣶⣿⣿⣶⡄   ");
			System.out.println("\033[93mJugador 1:  \033[91m⣿⣿⣿⣿⣿⣿    \033[91m⣿⣿⣿⣿⣿⣿   ");
			System.out.println("            \033[91m⠘⠿⣿⣿⠿⠃    \033[91m⠘⠿⣿⣿⠿⠃  \n\033[39m");		
			
			System.out.println("            \033[96m⢠⣶⣿⣿⣶⡄    \033[96m⢠⣶⣿⣿⣶⡄");
			System.out.println("\033[93mJugador 2:  \033[96m⣿⣿⣿⣿⣿⣿    \033[96m⣿⣿⣿⣿⣿⣿");
			System.out.println("            \033[96m⠘⠿⣿⣿⠿⠃    \033[96m⠘⠿⣿⣿⠿⠃\033[39m");
		
		}
		
			
	}
	
	/**
	 * Nos dibuja la posición inicial del tablero por defecto.
	 */
	public void pInicial(){
		
		f2 = "\033[96m" + f2 + "\033[39m";
		ff2 = "\033[96m" + ff2 + "\033[39m";
		e2 = true;
		
		f4 = "\033[96m" + f4 + "\033[39m";
		ff4 = "\033[96m" + ff4 + "\033[39m";
		e4 = true;
		
		f1 = "\033[91m" + f1 + "\033[39m";
		ff1 = "\033[91m" + ff1 + "\033[39m";
		e1 = true;
		
		f3 = "\033[91m" + f3 + "\033[39m";
		ff3 = "\033[91m" + ff3 + "\033[39m";
		e3 = true;
		
		dibujaTablero(2);
		
	}
	
	/**
	 * Nos posiciona la ficha en la posición deseada
	 */
	public void mueveFicha(String f, int p){
	
		if(f.contains("1")){
			
		}	
	
	}
}
