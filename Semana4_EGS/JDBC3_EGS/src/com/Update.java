package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps= null;
		
		String query = "UPDATE CLIENTE SET NOMBRE=?,DIRECCION=?,TELEFONO=? WHERE CLIENTE_ID=?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
			ps = con.prepareStatement(query);
			
			ps.setString(1, "GUADALUPE");
			ps.setString(2, "ORIENTE 54");
			ps.setString(3, "552-684-3249");
			ps.setInt(4, 6);
			
			int flag = ps.executeUpdate();
			
			if (flag == 1)
				System.out.println("Cliente Editado Exitosamente");
			else
				System.out.println("Hubo un error");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
