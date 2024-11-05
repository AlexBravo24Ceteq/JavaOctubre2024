package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null; 
		 
		String query = "INSERT INTO CLIENTE VALUES (?,?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			
			ps.setInt(1, 8);
			ps.setString(2, "Martin");
			ps.setString(3, "CDMX");
			ps.setString(4, "2278895645");
			
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("CLIENTE registrado exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
