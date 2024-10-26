package  com.krakedev.moduloii.evaluacionFinal.entidades;

import java.util.Date;

public class RegistroMovimiento {
	private int id;
	private Articulo id_articulos;
	private int catidad;
	private Date fecha_movimiento;
	
	public RegistroMovimiento() {
		
	}

	public RegistroMovimiento(int id, Articulo id_articulos, int catidad, Date fecha_movimiento) {
		super();
		this.id = id;
		this.id_articulos = id_articulos;
		this.catidad = catidad;
		this.fecha_movimiento = fecha_movimiento;
	}

	@Override
	public String toString() {
		return "RegistroMovimiento [id=" + id + ", id_articulos=" + id_articulos + ", catidad=" + catidad
				+ ", fecha_movimiento=" + fecha_movimiento + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Articulo getId_articulos() {
		return id_articulos;
	}

	public void setId_articulos(Articulo id_articulos) {
		this.id_articulos = id_articulos;
	}

	public int getCatidad() {
		return catidad;
	}

	public void setCatidad(int catidad) {
		this.catidad = catidad;
	}

	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	
}
