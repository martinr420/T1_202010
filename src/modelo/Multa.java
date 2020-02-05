package modelo;

import java.util.List;

public class Multa {

	public long id;

	public String fecha;

	public String medioDete;

	public String vehiculo;

	public String servicio;

	public String infraccion;

	public String descripcion;

	public String localidad;

	public Geo geo;



	public Multa(long id, String fecha, String medioDete, String vehiculo, String servicio, String infraccion,
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

		String msj = "La id es "+ id +" la fecha del comparendo "+ fecha 
				+" el medio de detencion es "+ medioDete +
				" el vehiculo es "+ vehiculo +" el tipo de servicio es " + servicio + 
				" la infraccion es " + infraccion + 
				" la descripcion de lo sucedido es " + descripcion + " la localidad es "+
				localidad +" la geografira es "+ geo.toString();
		
		
		return msj;
	}


}
