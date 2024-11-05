package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {

		// UPDATE - Actualizar un registro en la BD

		Connection con = null; // conexion a BD
		PreparedStatement ps = null;
		// Guardamos la sentencia para realizar un INSERT
		// En esta sentencia solo dejamos indicados el numero de columnas
		// con un signo de ?
		String query = "UPDATE ALUMNO SET NOMBRE=?, FECHANAC=?, GENERO=?, GRADO=?, CIUDAD=? WHERE ALUMNO_ID=?";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);

			// Una vez se precompila un UPDATE, se establecen los valores
			// de forma individual a traves de ps y se respetan el orden
			// de las columnas conforme aaparecen nombradas en la sentencia

			ps.setString(1, "ARIANNA");
			ps.setString(2, "25/06/2002");
			ps.setString(3, "FEMENINO");
			ps.setString(4, "1ER SEMESTRE");
			ps.setString(5, "QUERETARO, QRO");
			ps.setInt(6, 27); // AQUI SI TENGO QUE ENVIAR EL ID QUE QUIERO EDITAR

			// Una vez que tenemos establecidos los valores a guardar ejecutamos
			// la insercion

			int flag = ps.executeUpdate();

			// Aqui comprobamos que cuando se hace una incersion, se guarda un numero 1
			// System.out.println(flag);

			// Con ello puedo hacer una validacion para enviar un msj distinto en consola

			if (flag == 1)
				System.out.println("Alumno Editado Exitosamente");
			else
				System.out.println("Hubo un error");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
