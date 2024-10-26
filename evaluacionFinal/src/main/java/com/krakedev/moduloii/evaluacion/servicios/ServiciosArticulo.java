package com.krakedev.moduloii.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	
}
