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
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import test.User;

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
			JsonArray ja = elem.getAsJsonArray();
			for(JsonElement e: ja) {
				long id = e.getAsJsonObject().get("OBJECTID").getAsLong();
				String fecha = e.getAsJsonObject().get("FECHA_HORA").getAsString();
				String medioDete = e.getAsJsonObject().get("MEDIO_DETE").getAsString();
				String claseVehiculo = e.getAsJsonObject().get("CLASE_VEHI").getAsString();
				String tipoServicio = e.getAsJsonObject().get("TIPOS_SERVI").getAsString();
				String infraccion = e.getAsJsonObject().get("INFRACCION").getAsString();
				String descripcion = e.getAsJsonObject().get("DES_INFRAC").getAsString();
				String localidad = e.getAsJsonObject().get("LOCALIDAD").getAsString();
				String tipo = e.getAsJsonObject().get("type").getAsString();
				String coordenadasBeta = e.getAsJsonObject().get("coordinates").getAsString();
				String[] coordenadasbeta2 = coordenadasBeta.split(",");
				double[] coordenadas = new double[4];
				for(int i = 0; i < coordenadasbeta2.length; i++)
				{
					 coordenadas[i]= Double.parseDouble(coordenadasbeta2[i]);
				}
				
				
				Geo geo = new Geo(tipo, coordenadas);
				Mensaje msj = new Mensaje(id, fecha, medioDete, claseVehiculo, tipoServicio, infraccion, descripcion, localidad, geo );
			
				
				lista.add(msj);
				}
				
			
			

			System.out.println(Arrays.toString(lista.toArray()));


		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
