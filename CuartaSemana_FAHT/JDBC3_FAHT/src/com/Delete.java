package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		
		Connection con = null; // conexion a base de datos
		PreparedStatement ps = null;
		
		String query = "DELETE FROM CLIENTE WHERE CLIENTE_ID=?";
		
		//Intentamos nuevamente la conexion a base de datos
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","FaridCeteq","admin");
			ps = con.prepareStatement(query);
			
			//Solo debemos enviar el ID a eliminar
			
			ps.setInt(1, 23); //AQUI SI TENGO QUE ENVIAR EL ID a eliminar
			
			int flag = ps.executeUpdate();
			//Aqui comprobamos que cuando se hace una insercion, se guarda un numero 1
			//System.out.println(flag);
			if (flag == 1) {
				System.out.println("CLIENTE borrado exitosamente");
			}else {
				System.out.println("Hubo un error en borrar CLIENTE");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}//end

}
