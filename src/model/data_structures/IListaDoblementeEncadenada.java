/**
 * 
 */
package model.data_structures;

import java.util.ArrayList;

/**
 * @author marti
 *
 */
public interface IListaDoblementeEncadenada<K> extends Iterable {


	/**
	 * metodo que retorna un int con el tamaño de la lista
	 * si la lista esta vacia retorna 0.
	 * @return int con el tamaño de la lista
	 */
	public int darTamano();

	/**
	 * retorna el nodo de la posicion de la lista indicada
	 * @param pPosicion. posicion de la lista en la que se encuentra el nodo
	 * @return el nodo de la posicion indicada
	 */
	public  Nodo<K> darNodoEnPos(int pPosicion) throws noExisteObjetoException;
	
	/**
	 * retorna la posicion del nodo que se esta buscando.
	 * @param pNodo. Nodo el cual se le desea buscar la psocion
	 * @return
	 */

	public int darPosicionNodo (Nodo<K> pNodo) throws noExisteObjetoException;
	
	/**
	 * Elimina el ultimo nodo de la lista, reduce el tamaño de la lista y asigna el atributo
	 * ultimo al nodo anterior 
	 * 
	 */

	public void EliminarUltimo() throws noExisteObjetoException;
	
	/**
	 * elimina el primer nodo de la lista, reduce su tamaño y 
	 * asigna el atributo primerNodo al siguiente Nodo si existe
	 */

	public void EliminarPrimero () throws noExisteObjetoException;
	
	/**
	 * Elimina el nodo en la posicion indicada, reduce el tamaño de la lista
	 * @param pPosicion
	 */

	public void EliminarNodoPos(int pPosicion) throws FueraDeAlcanceException, noExisteObjetoException;
	
	/**
	 * Elimina el nodo de la lista encadenada dada por parametro
	 * @param pNodo nodo que se desea eliminar de la lista
	 * @throws noExisteObjetoException 
	 */

	public void EliminarNodoObj(Nodo<K> pNodo) throws noExisteObjetoException; 
	
	/**
	 * agrega un nodo al inicio de la cadena 
	 * @param pNodo nodo que se desea agregar
	 */
	
	public void agregarNodoInicio(Nodo<K> pNodo) ;
	
	/**
	 * agrega un nodo al final de la cadena 
	 * @param pNodo nodo que se desea agregar
	 */
	
	public void agregarNodoAlFinal(Nodo<K> pNodo);
	
	/**
	 * agrega un nodo en la posicion dada por parametro
	 * @param pPosicion posicion de la lista en a que se va agregar el nodo
	 * @param pNodo nodo que se desea agregar
	 * @throws FueraDeAlcanceException si la posicion es mayor al numero de elementos que tiene la lista 
	 */
	
	public void agregarNodoEnPosicion(int pPosicion, Nodo<K> pNodo)throws FueraDeAlcanceException;
/**
 * agrega todos los nodos a un arrayList
 * @return el arraylist con los nodos 
 */
	public ArrayList<Nodo<K>> darNodos();






}
