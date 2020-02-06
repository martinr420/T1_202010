package test.data_structures;

import junit.framework.TestCase;
import model.data_structures.ListaEncadenada;
import model.data_structures.Nodo;

public class TestLista extends TestCase



{
     private ListaEncadenada listaEncadenada;
     
     private void setUp1()
     {
    	 listaEncadenada = new ListaEncadenada();
    	 
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
     }
     
     private void setUp2 ()
     {
    	 listaEncadenada = new ListaEncadenada();
    	 
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    	 listaEncadenada.agregarNodoAlFinal(new Nodo());
    			 
     }
     public void testDarTamano()
     {
    	 setUp1();
    	 int numero = listaEncadenada.darTamano();
    	 assertEquals (7,numero);
    	 
    	 setUp2();
    	 int numero2 = listaEncadenada.darTamano();
    	 assertEquals (2,numero2);
    	 
     }
     
     public void testDarNodoEnPos()
     {
    	 
     }
}

