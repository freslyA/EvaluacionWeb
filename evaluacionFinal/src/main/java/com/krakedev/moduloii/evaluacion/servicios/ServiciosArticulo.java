package com.krakedev.moduloii.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

<<<<<<< HEAD
import com.krakedev.persistencia.utils.ConexionBDD;


public class ServiciosArticulo {

	
	public static void eliminar(Integer codigo) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            // Abrir conexión
            con = ConexionBDD.conectar();
            
            // Preparar sentencia SQL para eliminar
            ps = con.prepareStatement("DELETE FROM grupos WHERE codigo= ?");
            
            // Establecer el parámetro
            ps.setInt(1, codigo);
            
            // Ejecutar la eliminación
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
            	LOGGER.debug("Grupo con codigo " + codigo + " eliminada exitosamente.");
            } else {
            	LOGGER.error("No se encontró ningun grupo con codigo " + codigo);
            }
        
		} catch (Exception e) {
			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
            
        } finally {
			//cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");	
			}
        }
	}
	
=======
import com.krakedev.moduloii.evaluacionFinal.entidades.Articulo;
import com.krakedev.moduloii.evaluacionFinal.entidades.Grupo;
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
	public void insertarGrupo(Grupo grupo) throws InventarioException {
		Connection con=null;
		try {
			con=ConexionBDD.obtenerConexion();
			PreparedStatement ps= con.prepareStatement("insert into categorias"
					+ "values(?,?)");
			ps.setString(1,grupo.getId());
			ps.setString(2, grupo.getNombre());
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
	
	
	public static void eliminar(Integer codigo) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            // Abrir conexión
            con = ConexionBDD.conectar();
            
            // Preparar sentencia SQL para eliminar
            ps = con.prepareStatement("DELETE FROM grupos WHERE codigo= ?");
            
            // Establecer el parámetro
            ps.setInt(1, codigo);
            
            // Ejecutar la eliminación
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
            	LOGGER.debug("Grupo con codigo " + codigo + " eliminada exitosamente.");
            } else {
            	LOGGER.error("No se encontró ningun grupo con codigo " + codigo);
            }
        
		} catch (Exception e) {
			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
            
        } finally {
			//cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");	
			}
        }
	}
}
