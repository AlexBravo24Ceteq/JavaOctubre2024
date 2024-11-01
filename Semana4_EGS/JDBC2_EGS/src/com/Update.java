package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		
		// UPDATE -- TABLA CARRERAS
		
		Connection con = null;
		PreparedStatement ps= null;
		
		String query = "UPDATE CARRERAS SET NOMBRE=?,AREA=?,SEMESTRES=?,PRESUPUESTO=? WHERE CARRERA_ID=?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);
			
			ps.setString(1, "ODONTOLOGIA");
			ps.setString(2, "SALUD");
			ps.setString(3, "8 SEMESTRES");
			ps.setDouble(4, 280000.99);
			ps.setInt(5, 6);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1)
				System.out.println("Carrera Editada Exitosamente");
			else
				System.out.println("Hubo un error");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
