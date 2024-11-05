package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null; 
		 
		String query = "UPDATE TUTORES SET NOMBRE = ?, EMAIL = ?, CLAVE = ? WHERE TUTOR_ID = ?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			
			
			ps.setString(1, "Adriana Mora Torres");
			ps.setString(2, "adriana@correo.com");
			ps.setString(3, "B");
			ps.setInt(4, 7);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("Tutor modificasdo exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
