package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		//esta clase de update actualizara un registro en la base de datos
		
		Connection con = null;// hace la coneccion a la base de datsos
		PreparedStatement ps = null; //entrada de datos o interpretacion de una sentencia SQL precompilada
		//guardamos la sentencia para realizar un incert
		//EN ESTA SENTYENCIA SOLO DEJAMOS INDICADO EL NUMERO DE COLUMNAS CON UN SIGNO DE INTERROGACION 
		String query = "UPDATE ALUMNO SET NOMBRE = ?, FECHANAC = ?, GENERO = ?, GRADO = ?, CIUDAD = ? WHERE ALUMNO_ID = ?";
		
		//intentamos nuevamente la conexion a nuestra base de datos
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			//una ves se precompila un UPDATE se establecen los valores de forma individual a traves de ps 
			//Y SE RESPETAN EL ORDEM DE LAS COLUMNAS CONFORME APARECEN NOMBRADAS EN LA SENTENCIA
			
			ps.setString(1, "Manuel Lara");
			ps.setString(2, "25/11/2005");
			ps.setString(3, "MASCULINO");
			ps.setString(4, "1ER SEMESTRE");
			ps.setString(5, "CELAYA, GTO");
			ps.setInt(6, 8);// aqui si tengo que especificar el id que quiero modificar
			
			// una ves que tenemos los valores esttablecidos a guardar ejecutamos la insercion
			int flag = ps.executeUpdate();
			//AQUI comprobamos que cuando se guarada una incercion se guarda un numero 1
			//System.out.println(flag);
			
			//con ello podemos hacer una validacion y mandar un mensaje ne consola
			if (flag == 1) {
				System.out.println("Alumno modificado exitosamente");
			}else {
				System.out.println("Hubo un error");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
