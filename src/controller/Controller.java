package controller;

import java.util.Scanner;

import model.data_structures.noExisteObjetoException;
import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run(long id) throws noExisteObjetoException 
	{
		modelo.cargarDatos();
		for(int i = 0; i < modelo.darTamano(); i++)
		System.out.println(modelo.darDatos().darNodoEnPos(i).darGenerico().toString());
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("el motodo buscar comparendo por id retorno el siguiente comparendo");
		System.out.println(modelo.buscarComparendoPorId(id).toString());


	}



}
