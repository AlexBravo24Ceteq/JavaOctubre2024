package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {
		
		
		// CREATE - TABLA CARRERAS
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "INSERT INTO CARRERAS (NOMBRE, AREA, SEMESTRES, PRESUPUESTO) VALUES (?,?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);
			
			ps.setString(1, "DERECHO");
			ps.setString(2, "HUMANIDADES");
			ps.setString(3, "8 SEMESTRES");
			ps.setDouble(4, 180000.50);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1)
				System.out.println("Carrera Registrada Exitosamente");
			else
				System.out.println("Hubo un error");
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
