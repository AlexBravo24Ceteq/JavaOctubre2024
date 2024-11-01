package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "INSERT INTO CLIENTE (NOMBRE, DIRECCION, TELEFONO) VALUES (?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);
			
			ps.setString(1, "JORGE");
			ps.setString(2, "AV. REFORMA 259");
			ps.setString(3, "551-275-7643");
			
			int flag = ps.executeUpdate();
			
			if (flag == 1)
				System.out.println("Cleinte Registrado Exitosamente");
			else
				System.out.println("Hubo un error");
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
