package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {

				// DELETE - Borrar un registro en la BD

				Connection con = null; // conexion a BD
				PreparedStatement ps = null;
				
				String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID=?";

				try {
					Class.forName("oracle.jdbc.OracleDriver");
					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
					ps = con.prepareStatement(query);

					// Aqui solo debemos enviar el ID a eliminar

					
					ps.setInt(1, 25);

					int flag = ps.executeUpdate();

					// Con ello puedo hacer una validacion para enviar un msj distinto en consola

					if (flag == 1)
						System.out.println("Alumno Eliminado Exitosamente");
					else
						System.out.println("Hubo un error");

				} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
