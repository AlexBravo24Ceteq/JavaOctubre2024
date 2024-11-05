package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	public static void main(String[] args) {
		
		// READ - TABLA CARRERAS
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM CARRERAS ORDER BY CARRERA_ID";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"Erraick", "admin");
			
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			System.out.println("---- TABLA CARRERAS ----");
			while(rs.next()) {
				System.out.println(rs.getInt("CARRERA_ID") + " : " +
						rs.getString(2) + ": " +
						rs.getString(3) + ": " +
						rs.getString(4) + ": " +
						rs.getDouble(5)			
						);
			}
			
		} catch (Exception e) {
			System.out.println("No se pudo realizar la consulta");
			e.printStackTrace();
		}

	}

}
