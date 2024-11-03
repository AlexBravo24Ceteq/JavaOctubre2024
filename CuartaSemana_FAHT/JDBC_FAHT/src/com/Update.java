package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		
		//UPDATE- Actualizar un registro en la base de datos
		
		Connection con = null; // conexion a base de datos
		PreparedStatement ps = null;
		//Guardamos la sentencia para realizar un INSERT
		//En esta sentencia solo dejamos indicados el numero de 
		//columnas con un signo de ?
		String query = "UPDATE ALUMNO SET NOMBRE=?, FECHANAC=?, GENERO=?, GRADO=?, CIUDAD=? WHERE ALUMNO_ID=?";
		
		//Intentamos nuevamente la conexion a base de datos
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","FaridCeteq","admin");
			ps = con.prepareStatement(query);
			
			//Una vez se precompila un insert, se establecen los valores
			//de forma individual a traves de ps y se respetan el orden de 
			//las columnas conforme aparecen nombradas en la sentencia
			
			
			ps.setString(1, "ARIANNA");
			ps.setString(2,"25/07/2002");
			ps.setString(3, "FEMENINO");
			ps.setString(4, "1ER SEMESTRE");
			ps.setString(5, "QUERETARO, QRO");
			ps.setInt(6, 28); //AQUI SI TENGO QUE ENVIAR EL ID QUE QUIERO EDITAR
			
			//Una vez que tenemos establecidos los valores a guardar, ejecutamos
			// la insercion
			int flag = ps.executeUpdate();
			//Aqui comprobamos que cuando se hace una insercion, se guarda un numero 1
			//System.out.println(flag);
			if (flag == 1) {
				System.out.println("Alumno Editado exitosamente");
			}else {
				System.out.println("Hubo un error en la edicion");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//end
}//end
