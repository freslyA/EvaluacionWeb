package com.krakedev.moduloii.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.moduloii.evaluacionFinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionFinal.excepciones.InventarioException;
import com.krakedev.moduloii.evaluacionFinal.utils.ConexionBDD;

public class ServiciosArticulo {
	public void insertar(Articulo articulo) throws InventarioException {
		Connection con=null;
		try {
			con=ConexionBDD.obtenerConexion();
			PreparedStatement ps= con.prepareStatement("insert into productos"
					+ "values(?,?,?,?,?)");
			ps.setString(1,articulo.getId());
			ps.setString(2, articulo.getNombre());
			ps.setBigDecimal(3, articulo.getPrecio_venta());
			ps.setBigDecimal(4, articulo.getPrecio_compra());
			ps.setObject(5, articulo.getId_grupos());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new InventarioException("Error al insertar el cliente. DETALLE: "+e.getMessage());
		} catch (InventarioException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
