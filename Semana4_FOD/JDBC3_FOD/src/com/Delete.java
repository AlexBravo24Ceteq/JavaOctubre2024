package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null; 
		 
		String query = "DELETE FROM CLIENTE WHERE ID_CLIENTE = ?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			
			ps.setInt(1, 8);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("CLIENTE ELIMINADO exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
