package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null; 
		 
		String query = "UPDATE CLIENTE SET NOMBRE = ?, DIRECCION = ?, TELEFONO = ? WHERE ID_CLIENTE = ?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			
			
			ps.setString(1, "MARTIN");
			ps.setString(2, "CDMX");
			ps.setString(3, "2278890000");
			ps.setInt(4, 8);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("CLIENTE modificasdo exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
