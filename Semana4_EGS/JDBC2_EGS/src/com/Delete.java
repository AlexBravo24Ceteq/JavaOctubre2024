package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps= null;
		
		String query = "DELETE FROM CARRERAS WHERE CARRERA_ID=?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);
			
			
			ps.setInt(1, 6);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1)
				System.out.println("Carrera Eliminada Exitosamente");
			else
				System.out.println("Hubo un error");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
