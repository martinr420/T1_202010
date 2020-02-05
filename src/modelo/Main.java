package modelo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import model.data_structures.ListaEncadenada;
import model.data_structures.Nodo;
import model.data_structures.noExisteObjetoException;


public class Main {


	public static void main (String[] args) throws FileNotFoundException, noExisteObjetoException
	{
		

		String path = "./data/Gson";
		JsonReader lector;


		try {


			ListaEncadenada<Multa> listaMultas = new ListaEncadenada<>();


			lector = new JsonReader(new FileReader(path));
			JsonElement elem = JsonParser.parseReader(lector);
			JsonObject ja = elem.getAsJsonObject();

			JsonArray features = ja.getAsJsonArray("features");

			
			for(JsonElement e : features)
			{


				//	try
				//{
				JsonObject propiedades = (JsonObject) e.getAsJsonObject().get("properties");
				long id = propiedades.get("OBJECTID").getAsLong();
				String fecha = propiedades.get("FECHA_HORA").getAsString();
				String medioDete = propiedades.getAsJsonObject().get("MEDIO_DETE").getAsString();
				String claseVehiculo = propiedades.getAsJsonObject().get("CLASE_VEHI").getAsString();
				String tipoServicio = propiedades.getAsJsonObject().get("TIPO_SERVI").getAsString();
				String infraccion = propiedades.getAsJsonObject().get("INFRACCION").getAsString();
				String descripcion = propiedades.getAsJsonObject().get("DES_INFRAC").getAsString();
				String localidad = propiedades.getAsJsonObject().get("LOCALIDAD").getAsString();


				JsonObject geometry = (JsonObject) e.getAsJsonObject().get("geometry");

				String tipo = geometry.get("type").getAsString();

				double[] listaCoords = new double[3];

				JsonArray coordsJson = geometry.getAsJsonArray("coordinates");
				
				
				

				for(int i = 0; i < coordsJson.size(); i ++)
				{
					listaCoords[i] = coordsJson.get(i).getAsDouble();
					
					
				}

				Geo geometria = new Geo(tipo, listaCoords);

				Multa multa = new Multa(id, fecha, medioDete, claseVehiculo, tipoServicio, infraccion, descripcion, localidad, geometria);


				Nodo<Multa> nMulta = new Nodo<Multa>(multa);
				listaMultas.agregarNodoAlFinal(nMulta);
				
				




				//				
				//				System.out.println(id + " "+ fecha + " " + medioDete + " " + claseVehiculo + " " +
				//				claseVehiculo + " " + tipoServicio + " " + infraccion + " " + descripcion + " " + localidad);
				//				
				//				System.out.println(tipo);
				//				
				//				System.out.println(listaCoords[0] + ", "+ listaCoords[1] + ", " + listaCoords[2]+ ", " + listaCoords[3]);


			}
			Nodo<Multa> primerNodo = listaMultas.darNodoEnPos(1);
			System.out.println(primerNodo.darGenerico().toString());


		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}


	}

}
