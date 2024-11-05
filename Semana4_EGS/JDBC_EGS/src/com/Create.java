package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {

		// CREATE -- insertar registros en nuestra BD

		Connection con = null; // conexion a BD
		PreparedStatement ps = null;
		// Guardamos la sentencia para realizar un INSERT
		// En esta sentencia solo dejamos indicados el numero de columnas
		// con un signo de ?
		String query = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);

			// Una vez se precompila un INSERT, se establecen los valores
			// de forma individual a traves de ps

			ps.setInt(1, 1); // See insertan los valores por columna y el valor
			// aqui es la columna 1 y el ID se deja por requisito y el
			// trigger se encarga de asignarlo
			// En caso de no contar con el trigger, hay que especificar el ID
			ps.setString(2, "ADRIANA");
			ps.setString(3, "15/06/2002");
			ps.setString(4, "FEMENINO");
			ps.setString(5, "1ER SEMESTRE");
			ps.setString(6, "DURANGO, DGO");
			ps.setInt(7, 1);

			// Una vez que tenemos establecidos los valores a guardar ejecutamos
			// la insercion

			int flag = ps.executeUpdate();

			// Aqui comprobamos que cuando se hace una incersion, se guarda un numero 1
			// System.out.println(flag);

			// Con ello puedo hacer una validacion para enviar un msj distinto en consola

			if (flag == 1)
				System.out.println("Alumno Registrado Exitosamente");
			else
				System.out.println("Hubo un error");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
