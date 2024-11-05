package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	public static void main(String[] args) {
		//JDBC - java data bace conectiviti
		// read consulta de una tabla en una base de datos
		//necesitamos tres interfaces que nos van a permitir realizar esta consulta
		
		Connection con = null;// hace la coneccion a la base de datsos
		PreparedStatement ps = null; //entrada de datos o interpretacion de una sentencia SQL precompilada
		ResultSet rs = null; //es una interface que nos ayudara a darles salida a los datos
		
		//vamos a guardar nuestra consulta en un String aqui
		String query = "SELECT * FROM ALUMNO ORDER BY ALUMNO_ID";
		
		try {//intentaremos realizar la cominucacion con la base de datos
			Class.forName("oracle.jdbc.OracleDriver");// se busca la clase del controlador dentro de un paquete
			//iniciamos la conexion a la base de datos 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			//vamos a pasarle elvalor de la conexion a preparedStarmen y la sencuencia SQL
			ps = con.prepareStatement(query);// se prencompila e idemtofoca que es una sentencia SQL 
			//ahora el valor de ps se le pasa a resulSet para ejecuatr la snetencia y recuperar la info
			rs = ps.executeQuery();
			
			// recupera la info columna por columna una fila a la vez de manera de cursos 
			//por eso para recuperar a todos los alumnos incluimos esto en un ciclo while
			
			while(rs.next()) {// mientras haya filas por recuperar por alumnos los imprimimos uno a uno en consola 
				//PODEMOS RECUPERAR LA INFO POR ETIQUETA O POR NUMERO DE COLUMNA
				System.out.println(rs.getInt("ALUMNO_ID") + 
						" : " + rs.getString(2) + 
						" : " + rs.getDate(3) + 
						" : " + rs.getString(4) + 
						" : " + rs.getString(5) + 
						" : " + rs.getString(6) + 
						" : " + rs.getInt("STATUS"));
			}
				
		} catch (Exception e) {
			//
			System.out.println("No se pudo realizar la consulta");
			e.printStackTrace();
		}
		
		
	}

}
