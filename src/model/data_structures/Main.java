package model.data_structures;
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


public class Main {


	public static void main (String[] args) throws FileNotFoundException
	{
		Gson gson = new Gson();

		String path = "./data/Gson";
		JsonReader lector;


		try {
			List<Mensaje> lista = new ArrayList<Mensaje>();

			lector = new JsonReader(new FileReader(path));
			JsonElement elem = JsonParser.parseReader(lector);
			JsonObject ja = elem.getAsJsonObject();

			JsonArray features = ja.getAsJsonArray("features");

			System.out.println(features.get(0).getAsJsonObject().get("properties"));
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
				
				
				System.out.println(id + " "+ fecha + " " + medioDete + " " + claseVehiculo + " " +
				claseVehiculo + " " + tipoServicio + " " + infraccion + " " + descripcion + " " + localidad);
				//}
				//catch(Exception e1){

				//}

			}



			System.out.println(Arrays.toString(lista.toArray()));



		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
