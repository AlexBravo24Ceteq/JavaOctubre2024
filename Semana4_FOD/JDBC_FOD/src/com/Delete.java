package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		// delete borra un registro de la base de datos 
		
		Connection con = null;// hace la coneccion a la base de datsos
		PreparedStatement ps = null; 
		String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID = ?";
		
		//intentamos nuevamente la conexion a nuestra base de datos
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			//AQUI solo devemos enviar el id a eliminar
	
			ps.setInt(1, 10);// aqui si tengo que especificar el id que quiero eliminar
			
			// una ves que tenemos los valores esttablecidos a guardar ejecutamos la insercion
			int flag = ps.executeUpdate();
			
			//con ello podemos hacer una validacion y mandar un mensaje ne consola
			if (flag == 1) {
				System.out.println("Alumno eliminado exitosamente");
			}else {
				System.out.println("Hubo un error");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
