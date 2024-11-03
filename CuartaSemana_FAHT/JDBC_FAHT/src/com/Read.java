package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	public static void main(String[] args) {
		
		// JDBC -Java DataBase Connectivity
		
		//READ - Consulta de una tabla en una Base de Datos
		// Necesitamos 3 interfaces que nos van a permitir 
		//realizar esta consulta
		
		Connection con = null; // conexion a base de datos
		PreparedStatement ps = null; //entrada de datos o
		//interpretacion de una sentencia sql precompilada
		
		ResultSet rs = null; //es una interface que nos ayudará 
		//a darle salida a los datos
		
		//vamos a guardar nuestra consulkta en un String aquí
		String query = "SELECT * FROM ALUMNO order by alumno_ID";
		
		try {//intentaremos realizar la comunicacion con la BD
			Class.forName("oracle.jdbc.OracleDriver");//se busca la clase del controlador
			//dentro de un paquete
			//Iniciamos la conexion a la BD
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","FaridCeteq","admin");
			//Vamos a pasarle el valor de la conexion a PrepareStatement y la sentencia sql
			
			ps = con.prepareStatement(query); //aqui se precompila e identifica que es una sentencia sql
			//Ahora el valor de ps se le pasa a ResultSet para ejecutar la sentencia
			//y recuperar la info
			rs = ps.executeQuery();
			
			//ResultSet recupera la info columna y fila a la vez
			//a manera de cursor, por eso, para recuperar a todos los alumnos
			//incluimos esto en un ciclo while
			while(rs.next()) {//Mientras haya filas por recuperar de Alumnos
				//Los imprimimos uno a uno en consola
				//Podemos recuperar la info por numero de columna o por
				//etiqueta o nombre de columna
				System.out.println(rs.getInt("ALUMNO_ID") + " : " + 
				rs.getNString(2)+" : " +
				rs.getDate(3)+" : " + 
				rs.getString(4)+" : " + 
				rs.getString(5)+" : " +
				rs.getString(6)+" : " + 
				rs.getInt("STATUS"));
			}
		} catch (Exception e) {
			System.out.println("No se pudo realizar la consulta");
			e.printStackTrace();
		}
		

	}//end
}//endII
