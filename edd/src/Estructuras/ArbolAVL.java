package edd.src.Estructuras;

/**
* Clase para los árboles AVL: La diferencia de las alturas de ambos hijos de cada nodo
* es a lo más 1.
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
*/ 

public class ArbolAVL<T extends Comparable<T>> extends ArbolBinarioBusqueda<T> {
	
	
	 /**
     * Clase interna protegida para vértices de árboles AVL. La única
     * diferencia con los vértices de árbol binario, es que tienen un atributo
     * para la altura de cada vértice y balancearlos.
    */
	protected class VerticeAVL extends Vertice {
	    
	    private int altura;	     	    	    
    	
	    public VerticeAVL(T elemento){
			super(elemento);		           	
	    }	
	    //Set para la altura
	    public void setAltura(int a){
       		altura = a;
	    }
	    //Get para la altura	    
	    public int getAltura(){
       		return altura;
	    }
	    //Casting del padre del vértice
	    public VerticeAVL getPadre(){       		
       		return (VerticeAVL) this.padre;       			       	
	    }
	    //Casting del izquierdo del Vértice
	    public VerticeAVL getIzquierdo(){
			return (VerticeAVL) this.izquierdo;
	    }
	    //Casting del derecho del vértiće
	    public VerticeAVL getDerecho(){
       		return (VerticeAVL) this.derecho;      	
	    }       	
	    
	    /**
	     * Regresa una representación en cadena del vértice AVL.
	     * 
	     * @return una representación en cadena del vértice AVL de la forma <elemento>. <altura>.
	     */
	    public String toString() {
			if (this == null)
		    	return "";
			else
		    	return "\033[92m" + this.elemento.toString() + ". \033[95m" + altura + "\033[39m ";
	    }
	    
        
        /**
         * Compara el vértice con otro objeto. La comparación es
         * <em>recursiva</em>.
         * 
         * @param o el objeto con el cual se comparará el vértice.
         * @return <code>true</code> si el objeto es instancia de la clase
         *         {@link VerticeAVL}, su elemento es igual al elemento de
         *         éste vértice, los descendientes de ambos son recursivamente
         *         iguales, y las alturas son iguales; <code>false</code> en
         *         otro caso.
         */
        
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;
            @SuppressWarnings("unchecked")
            VerticeAVL vertice = (VerticeAVL) o;
            return this.getAltura() == vertice.getAltura() && super.equals(o);
            
        }
    }
    
    protected Vertice ultimoEliminado;
    
    /**
      * Constructor sin parámetros
      */ 
    public ArbolAVL() {
        super();
    }
    
    /**
     * Construye un árbol AVL a partir de una colección. El árbol
     * AVL tiene los mismos elementos que la colección recibida.
     * 
     * @param coleccion la colección a partir de la cual creamos el árbol
     *                  AVL.
     */
    public ArbolAVL(Collection<T> coleccion) {
        super(coleccion);
    }
    
    /**
     * Construye un nuevo vértice, usando una instancia de {@link
     * VerticeAVL}.
     * 
     * @param elemento el elemento dentro del vértice.
     * @return un nuevo vértice AVL con el elemento recibido dentro del mismo.
     */
    @Override
    protected Vertice nuevoVertice(T elemento) {
        return new VerticeAVL(elemento);
    }
	/**
	 * Convierte un vérticeArbolBinario en un vérticeAVL
	 * @param vertice que vamos a convertir
	 * @return un nuevo vértice AVL convertido.
	 */ 
    protected VerticeAVL convertirAVL(VerticeArbolBinario<T> vertice) {
        return (VerticeAVL) vertice;
    }
    
    /**
     * Borra un elemento del árbol AVL y lo reordena
     * @param elemento que deseamos eliminar en el árbol 
     * @return <code>true</code> si se pudo eliminar correctamente el elemento.
     * 		   <code>false</code> en otro caso.
     */
    public boolean delete(T elemento) {
    
    	if(elemento==null){
          throw new IllegalArgumentException("elemento nulo");
        }
        
        Vertice v = aSearch(this.raiz, elemento);
        ultimoEliminado = nuevoVertice(elemento);             
        
        VerticeAVL u = convertirAVL(v.padre);
        
        Boolean s = false;
 	    
 	    if(v.elemento.equals(this.raiz.elemento)){
        	s = true;        	
        }
                
        Boolean estado = super.delete(elemento);
        
        if(s == true){
        	VerticeAVL raiz = convertirAVL(this.raiz);        	
        	actualizaAltura(raiz.getIzquierdo());
        	
        }else actualizaAltura(u);
        
        
        return estado;
    }
    
    /**
     * Agrega un elemento al árbol AVL y rebalancea
     * si así se requiere.
     * @param elemento que se va a agregar al árbol.    
     */ 
    public void add(T elemento) {
    
        if(elemento==null){
          throw new IllegalArgumentException("elemento nulo");
        }
              
		super.add(elemento);
		Vertice u = aSearch(this.raiz, elemento);
		ultimoAgregado = nuevoVertice(elemento);
		
		VerticeAVL v = convertirAVL(u);	
			
		actualizaAltura(v);	
		return;
    }
    
    /**
     * Actualiza la altura del vértice dado, además de rebalancear
     * considerando las alturas de sus hijos.
     * @param v el vértice del que se actualizará alturas
     * y del que se rebalanceará.     
     */
    private void actualizaAltura(VerticeAVL v){       
		
    	VerticeAVL der = v.getDerecho();
    	VerticeAVL izq = v.getIzquierdo();
		VerticeAVL r = convertirAVL(this.raiz);		
	
		//Caso 1 
    	if(!v.hayIzquierdo() && v.hayDerecho()){ 
    	
	    if(v.getDerecho().getAltura() > 0){
		
    			
    			if(v.getDerecho().hayDerecho()){
			    
    				VerticeAVL de = v.getDerecho().getDerecho();
    					
    					if(de.getAltura() == v.getDerecho().getAltura()-1){
    								
					    rotaIzquierda(v);
					    		
					    actualizaAltura(der);					    
    								
    					}
    			
    			}
    		}	
    	}
    	
    	//Caso 1
    	if(v.hayIzquierdo() && v.hayDerecho()){
    	
    		if(v.getDerecho().getAltura() == v.getIzquierdo().getAltura() + 2){
    			
    			if(v.getDerecho().getDerecho() != null){
    				
    				VerticeAVL de = v.getDerecho().getDerecho();  			    			
    					
    					if(de.getAltura() == v.getDerecho().getAltura()-1){
    							
    						rotaIzquierda(v);	
    						
    						actualizaAltura(der);
    								
    					}
    			
    			}
    			
    		}
    		
    	}
    	
    	//Caso 2
    	if(!v.hayIzquierdo() && v.hayDerecho()){ 
    	
    		if(v.getDerecho().getAltura() > 0){
    		
    			if(v.getDerecho().hayIzquierdo()){
    				
    				VerticeAVL iz = v.getDerecho().getIzquierdo();
    				
    				if(iz.getAltura() == der.getAltura() - 1){
				    				    
				    rotaDerecha(v.getDerecho());
				    rotaIzquierda(v);
				    actualizaAltura(iz);
				    
    				}
    					
    				
    			}
    		
    		}		
    		
    	}
    	//Caso 2
    	if(v.hayIzquierdo() && v.hayDerecho()){
    	
	    if(v.getDerecho().getAltura() == v.getIzquierdo().getAltura() + 2){

		if(v.getDerecho().hayIzquierdo()){
		    
		    VerticeAVL iz = v.getDerecho().getIzquierdo(); 
		    
		    if(iz.getAltura() == v.getDerecho().getAltura() - 1){
						
			rotaDerecha(v.getDerecho());
			rotaIzquierda(v);
			actualizaAltura(iz);
			
		    }
		}
	    }	    
    }

	//Caso 3
	if(v.hayIzquierdo() && !v.hayDerecho()){
	
	   	VerticeAVL izq1 = v.getIzquierdo();
	   	izq = v.getIzquierdo();
	    if(v.getIzquierdo().getAltura() > 0){

		if(v.getIzquierdo().hayIzquierdo()){

		    VerticeAVL iz = v.getIzquierdo().getIzquierdo(); 

		    if(iz.getAltura() == izq.getAltura() - 1){
		    
			rotaDerecha(v);
			
			actualizaAltura(izq1);
			
		    }
		    
		}
		
	    }
	    
	}

	//Caso 3
	if(v.hayIzquierdo() && v.hayDerecho()){ 
	
	     VerticeAVL izq1 = v.getIzquierdo();
	    if(v.getIzquierdo().getAltura() == v.getDerecho().getAltura() + 2){
		
		if(v.getIzquierdo().hayIzquierdo()){
		    
		    VerticeAVL iz = v.getIzquierdo().getIzquierdo();		    

		    if(iz.getAltura() == v.getIzquierdo().getAltura() -1){
			
			rotaDerecha(v);
			actualizaAltura(izq1);
			
		    }
		    
		}
	    }
	    
	}
	//Caso 4
	if(v.hayIzquierdo() && !v.hayDerecho()){ 
	
	    if(v.getIzquierdo().getAltura() > 0){

			if(v.getIzquierdo().hayDerecho()){
	
			    VerticeAVL de = v.getIzquierdo().getDerecho(); 
	
			    if(de.getAltura() == v.getIzquierdo().getAltura() -1){

					rotaIzquierda(v.getIzquierdo());
					rotaDerecha(v);
					actualizaAltura(de);
				
			    }
			}
		
	     }
	}
	
	//Caso 4
	if(v.hayIzquierdo() && v.hayDerecho()){
	
	    if(v.getIzquierdo().getAltura() == v.getDerecho().getAltura() + 2){

		if(v.getIzquierdo().hayDerecho()){

		    VerticeAVL de = v.getIzquierdo().getDerecho();
		    
		    if(de.getAltura() == v.getIzquierdo().getAltura() -1){

			
			rotaIzquierda(v.getIzquierdo());
			
			rotaDerecha(v);
		
			actualizaAltura(de);
			
			}
		    
		}
		
	    }

	}
    
		ayuda(v);
	
    	if(v.padre == null){
    		return;
    	}else{
	    
	    VerticeAVL pai = convertirAVL(v.padre);    		
	    actualizaAltura(pai);
	    
    	}
    	
    	
    }
     /**
      * Método auxiliar que nos calcula las alturas del vértice dado
      * de acuerdo a las alturas de sus hijos.
      * @param v, el vértice al que se le actualizará la altura.
      */
     private void ayuda(VerticeAVL v){
     	    
    	VerticeAVL der = v.getDerecho();
    	VerticeAVL izq = v.getIzquierdo();
    	
    	if(der == null && izq != null){
	    
	    	v.setAltura(izq.getAltura() + 1);	   	    	
	        
		}
		if(izq == null && der != null){
	    
	    	v.setAltura(der.getAltura() + 1);			
	    	
		}
		if(izq != null && der != null){
	    
	    	int m = max(izq.getAltura(), der.getAltura());
	    	v.setAltura(m + 1);
	    	
		}
		if(izq == null && der == null){
	    
	    	v.setAltura(0);	   
	    
		}         
     }   
     
    /**	
      * Auxiliar que nos devuelve el máximo de dos números.
      * @param a el primer elemento.
      * @param b el segundo elemento.
      * @return el máximo entre estos dos números.
     */
    private int max(int a, int b){
    	if(a > b){
    		return a;
    	}else if(b > a){
    		return b;
    	}else if(a == b){
    		return a;
    	}
    	return -1;
    }
    
    /**
     * Método para rotar hacia la izquierda, su hijo derecho se vuelve su padre y el 
     * subárbol derecho del que antes era su hijo, se vuelve su subárbol      
     * izquierdo.
     * @param v, el vértice a partir de donde se hará la rotación.
     */
    private void rotaIzquierda(VerticeAVL v){	
	
	if(v == null){
	    throw new IllegalArgumentException("Qué pasó mi tío(Elemento nulo)");
	}
   	
   	VerticeAVL papa = v.getPadre();
   	
	VerticeAVL der = v.getDerecho();
	VerticeAVL ax = der.getIzquierdo();
	
	
	if(papa != null){
		
		if(papa.hayDerecho() && papa.derecho.equals(v)){
	
		    papa.derecho = der;
		    der.padre = papa;
		}
		if(papa.hayIzquierdo() && papa.izquierdo.equals(v)){
	
		    papa.izquierdo = der;
		    der.padre = papa;
		}
		
	}else{
	
		if(v.equals(raiz)) this.raiz = der;
		der.padre = null;		
		
	}	   
	 
	 v.padre = der;	 
	 der.izquierdo = v;
	 
	v.derecho = ax;
	
	if(ax != null) ax.padre = v;
	ayuda(v);
	 
	 }   
    
    /*
     * Método que nos permite rotar hacia la derecha un subárbol.
     * Su hijo izquierdo se vuelve su padre y su subárol derecho del que antes
     * era su hijo , se vuelve su subárbol izquierdo.
     * @param v, el vértice de donde se hará la rotación.
     */
    private void rotaDerecha(VerticeAVL v){
       
        if(v == null){
	    	throw new IllegalArgumentException("que pasó mi tío(Elemento nulo)");
    	}
	
    	VerticeAVL papa = convertirAVL(v.padre);
   	
	VerticeAVL izq = convertirAVL(v.izquierdo);
	VerticeAVL ax = convertirAVL(izq.derecho);
	
	
	if(papa != null){
	
	    if(papa.hayDerecho() && papa.derecho == v){
	    
			papa.derecho = izq;
			izq.padre = papa;
			
	    }
	    
	    if(papa.hayIzquierdo() && papa.izquierdo == v){
			
			papa.izquierdo = izq;
			izq.padre = papa;
			
		}
	    
	}else{
	
		if(v.equals(raiz)) this.raiz = izq;
	    izq.padre = null;
	    
	}
	
	izq.derecho = v;
	v.padre = izq;
	
	
	v.izquierdo = ax;
	if(ax != null) ax.padre = v;
	ayuda(v);
	
	}
             
    /**
     * Método que imprime el toString de este árbol
     */
    public String toString(){    	
    	return super.toString();
    }
}
