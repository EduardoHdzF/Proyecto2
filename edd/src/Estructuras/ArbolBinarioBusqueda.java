package edd.src.Estructuras;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <p>
 * Clase para árboles binarios ordenados. Los árboles son genéricos, pero
 * acotados a la interfaz {@link Comparable}.
 * </p>
 *
 * <p>
 * Un árbol instancia de esta clase siempre cumple que:
 * </p>
 * <ul>
 * <li>Cualquier elemento en el árbol es mayor o igual que todos sus
 * descendientes por la izquierda.</li>
 * <li>Cualquier elemento en el árbol es menor o igual que todos sus
 * descendientes por la derecha.</li>
 * </ul>
 */
public class ArbolBinarioBusqueda<T extends Comparable<T>> extends ArbolBinario<T> {
    private class Iterador implements Iterator<T>{
        private Pila<Vertice> pila;

        public Iterador(){
            pila = new Pila<Vertice>();
            Vertice p = raiz;
            while (p!= null) {
                pila.push(p);
                p = p.izquierdo;    
            }
        }
        // falta hasNext
        public T next(){
            if(pila.isEmpty()){
                throw new NoSuchElementException("vacio");
            }
            Vertice v = pila.pop();
            if(v.derecho != null){
                Vertice u = v.derecho;
                while (u!=null) {
                    pila.push(u);
                    u=u.izquierdo;
                }
            }

            return v.elemento;
        }

        public boolean hasNext(){
            return false;
        }



    }



    protected Vertice ultimoAgregado;
    /**
     * Constructor sin parámetros. Para no perder el constructor sin parámetros
     * de {@link ArbolBinario}.
     */
    public ArbolBinarioBusqueda() {
        super();
    }
    
    public ArbolBinarioBusqueda(Lista<T> lista, boolean isSorted ){
        //if (isSorted) {
        //    buildSorted();
        //}
        //else{
        //    buildUnsorted();
        //}
        return;

    }

    public ArbolBinarioBusqueda(Collection<T> coleccion) {
        super(coleccion);
    }
    /**
     * Método creado para eliminar en un BST
     * @param elemento que deseamos eliminar.
     */
    public boolean delete(T elemento) {
        //System.out.println("Entrada " + elemento);
		Vertice aux = aSearch(this.raiz, elemento);
		
		if(aux == null){
		    //System.out.println("bb");
		    return false;
		}
		
		if(!aux.hayDerecho() & !aux.hayIzquierdo()){	
		    	
		    Vertice a = null;
		    if(aux.padre != null){
		    	a = aux.padre;		
		    	if(a.hayDerecho()){
					if(a.derecho == aux){
			    		a.derecho = null;
					}
		    	}
		    	if(a.hayIzquierdo() && a.izquierdo == aux){
			
				a.izquierdo = null;	
		    	}
			}
		    aux = null;			
		    elementos--;
		    return true;
		    
		}else if(aux.hayDerecho() ^ aux.hayIzquierdo() ){
		    
		    //System.out.println("2");
		    //System.out.println("fantasía");
		    if(aux.hayDerecho()){
			 //System.out.println("2.1");
			Vertice a = aux.derecho;
			Vertice p = aux.padre;

			if(p.hayDerecho()){
			    //System.out.println("2.1.1");
			    if(p.derecho == aux){
				p.derecho = a;
				a.padre = p;
			    }
			}
			if(p.hayIzquierdo() && p.izquierdo == aux){
			    //System.out.println("2.1.2");
			    p.izquierdo = a;
			    a.padre = p;
			}
			//aux = a;
			//System.out.println("Prueba.txt " + aux.padre);
			elementos--;
			return true;
			
		    }else if(aux.hayIzquierdo()){
			
			//System.out.println("2.2");
			Vertice a = aux.izquierdo;
			Vertice p = aux.padre;
			
			if(p.hayDerecho()){
			     //System.out.println("2.2.1");
			    if(p.derecho == aux){
				p.derecho = a;
				a.padre = p;
			    }
			}
			
			if(p.hayIzquierdo() & p.izquierdo == aux){
			     //System.out.println("2.2.2");			    
				 p.izquierdo = a;
				 a.padre = p;
			}
			
			//aux = a;
			elementos--;
			//System.out.println("Prueba.txt " + aux.padre);
			return true;
		    }
		}else if(aux.hayDerecho() & aux.hayIzquierdo()){
		    //System.out.println("3");
		    
		    Vertice a = aux.izquierdo;
		    Vertice p = aux.padre;
		   
		    while(a.hayDerecho()){
				a = a.derecho;
		    }
		    
		    Vertice q = a.padre;
		    T n = aux.elemento;
		    
		    aux.elemento = a.elemento;
		    a.elemento = n;		     

		    
		    if(!a.hayDerecho() & !a.hayIzquierdo()){
			
			//System.out.println("3.1");
			Vertice a1 = a.padre;
			
			if(a1.hayDerecho()){
			    
			    if(a1.derecho.elemento == a.elemento){
					a1.derecho = null;
			    }
			    
			}
			if(a1.hayIzquierdo() && a1.izquierdo.elemento == a.elemento){
			    //System.out.println("3.2");
			    a1.izquierdo = null;	
			}
			
			a = null;			
			elementos--;
			//System.out.println(q.izquierdo);
			return true;

			
		    }else if(a.hayDerecho() ^ a.hayIzquierdo() ){
			//System.out.println("3.3");
			if(a.hayDerecho()){
			    Vertice a1 = a.derecho;
			    Vertice p1 = a.padre;
			    if(p1.hayDerecho()){
				if(p1.derecho == a){
				    p1.derecho = a1;//Ver este
				    a1.padre = p1;
				}
			    }
			    if(p1.hayIzquierdo() && p1.izquierdo == a){				
				p1.izquierdo = a1;
				a1.padre = p1;
			    }
			    //a = a1;	
			    elementos--;
			    return true;			
			}else if(a.hayIzquierdo()){
			    //System.out.println("3.4");
			    Vertice a1 = a.izquierdo;
			    Vertice p1 = a.padre;
			    if(p1.hayDerecho()){
				if(p1.derecho == a){
				    p1.derecho = a1;
				    a1.padre = p1;
				}
			    }
			    if(p1.hayIzquierdo() && p1.izquierdo == a){
				p1.izquierdo = a1;
				a1.padre = p1;
			    }
			    //a = a1;
			    elementos--;
			    return true;
			}
		    }

		    
		    
		   
		    
		    //System.out.println(a + " ella " + aux + " papa " + p.derecho);
		    // return delete(elemento);		
		}
		
		//System.out.println("invierno ");
		return false;
    } 

	/**  
     * Método creado para eliminar el un BST
     * @param elemento a agregar al árbol
     */
    public void add(T elemento) {
        
        if(elemento==null){
          throw new IllegalArgumentException("Elemento nulo");
        }
        Vertice v = nuevoVertice(elemento);
        
        ultimoAgregado = v;
        
        elementos++;
		
		if(this.raiz == null){
		    this.raiz = v;
			return;
		}else 
			addAux(this.raiz, v);
	     
        return;
    }
    
    /**
     * Auxiliar para agregar al BST
     */
    private void addAux(Vertice raiz, Vertice v){
    	if(v.elemento.compareTo(raiz.elemento) < 0){
    		if(raiz.izquierdo == null){
    			v.padre = raiz;
    			raiz.izquierdo = v;	
    		}else
    			addAux(raiz.izquierdo, v);
    				
    	}else if(v.get().compareTo(raiz.get()) > 0){
    		
    		if(raiz.derecho == null){
    			//System.out.println(v + " add");
    			v.padre = raiz;
    			raiz.derecho = v;
    			
    		}else 
    			addAux(raiz.derecho, v);
    	}	
    	
    }
    
    /**
     * Método creado para buscar en BST
     * @param elem que se desea buscar
     */
    public void search(T elem){
    	Vertice raiz = this.raiz;    	
    	Vertice resultado = aSearch(raiz, elem);	
    	
    	if(resultado == null)    	
 			System.out.println("No se econtró lo que buscaba "+ resultado );
 			
		else if(resultado.elemento == elem)
			System.out.println("Se encontró el elemento");
    }	
    
    /**
     * Método auxiliar para buscar en un BST
     * @param nodo a partir de donde se hará la búsqueda.
     * @param elem, el elemento que se busca.
     * @return Vertice con el elemento buscado o 
     * null si no se encontró.
     */
    protected Vertice aSearch(Vertice nodo, T elem){
    	//System.out.println(nodo + " aaa " + elem);
    	if(nodo == null || elem == null)    	
    		return null;
    		
    	if(nodo.elemento.equals(elem)){    	 	
    		//System.out.println("amor");	
    		return nodo;
    		 		
    	}else if(elem.compareTo(nodo.elemento) < 0){//(nodo.elemento.compareTo(elem) > 0){	
    		//System.out.println("o9p "+ nodo.elemento.compareTo(elem) + " " + nodo.elemento);
    		return aSearch(nodo.izquierdo, elem);
    	}else if(elem.compareTo(nodo.elemento) > 0){//(nodo.elemento.compareTo(elem) < 0){
    		//System.out.println("pwp " + nodo.elemento.compareTo(elem) + " " + nodo.elemento);
    		return aSearch(nodo.derecho, elem);    		
    	}
    	return null;	
    }
    /**
     * Regresa el vértice que contiene el último elemento agregado al
     * árbol. Este método sólo se puede garantizar que funcione
     * <em>inmediatamente</em> después de haber invocado al método {@link
     * agrega}. Si cualquier operación distinta a agregar sobre el árbol se
     * ejecuta después de haber agrefgado un elemento, el comportamiento de este
     * método es indefinido.
     * 
     * @return el vértice que contiene el último elemento agregado al árbol, si
     *         el método es invocado inmediatamente después de agregar un
     *         elemento al árbol.
     */
    public VerticeArbolBinario<T> getUltimoVerticeAgregado() {
        return ultimoAgregado;
    }

    /**
     * Regresa un iterador para iterar el árbol. El árbol se itera en orden.
     * 
     * @return un iterador para iterar el árbol.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterador();
    }

}
