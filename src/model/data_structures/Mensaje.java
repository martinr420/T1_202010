package model.data_structures;

import java.util.List;

public class Mensaje {
	
public long id;
	
	public String fecha;
	
	public String medioDete;
	
	public String vehiculo;
	
	public String servicio;
	
	public String infraccion;
	
	public String descripcion;
	
	public String localidad;
	
	public Geo geo;
	

	
	public Mensaje(long id, String fecha, String medioDete, String vehiculo, String servicio, String infraccion,
			String descripcion, String localidad, Geo geo) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.medioDete = medioDete;
		this.vehiculo = vehiculo;
		this.servicio = servicio;
		this.infraccion = infraccion;
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.geo = geo;
	}

	public String toString()
	{
		
		
		return "";
	}
	
	
}
