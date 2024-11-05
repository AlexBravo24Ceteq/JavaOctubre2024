package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	public static void main(String[] args) {


		Connection con = null;
		PreparedStatement ps = null; 
		ResultSet rs = null; 
		String query = "SELECT * FROM CLIENTE ORDER BY ID_CLIENTE";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(rs.getInt("ID_CLIENTE") + 
						" : " + rs.getString(2) + 
						" : " + rs.getString(3) + 
						" : " + rs.getString(4));
			}
				
		} catch (Exception e) {
			//
			System.out.println("No se pudo realizar la consulta");
			e.printStackTrace();
		}

	}

}
