package model.data_structures;

public class Nodo<K> 
{
	
	private Nodo<K> siguiente;
	
	private Nodo<K> anterior;
	
	public Nodo()
	
	{
		siguiente = null;
		
		anterior = null;
				
	}
	
	public Nodo<K> darSiguiente()
	{
		return  siguiente;
	}
	
	
	public Nodo<K> darAnterior()
	{
		return  anterior;
	}
	
	public void cambiarAnterior(Nodo<K> pAnterior)
	{
		anterior = pAnterior;
	}
	
	public void cambiarSiguiente(Nodo<K> pSiguiente )
	{
		siguiente = pSiguiente;
	}
	
	public void desconectarSiguiente()
	{
		siguiente = null;
	}
	
	public void desconectarAnterior()
	{
		anterior = null;
	}
	
	
	

}
