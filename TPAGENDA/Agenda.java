package TPAGENDA;


public class Agenda {
	
	protected String nombre;
	protected String fecha;
	protected String descripcion;
	protected Long ID;

	public Agenda(String nombre,String descripcion,String fecha){
			this.nombre=nombre;
			this.descripcion = descripcion;
			this.fecha = fecha;
		}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

