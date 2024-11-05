package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null; 
		 
		String query = "INSERT INTO TUTORES VALUES (?,?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			
			ps.setInt(1, 7);
			ps.setString(2, "Adriana Lara");
			ps.setString(3, "adriana@correo.com");
			ps.setString(4, "B");
			
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("Tutor registrado exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
