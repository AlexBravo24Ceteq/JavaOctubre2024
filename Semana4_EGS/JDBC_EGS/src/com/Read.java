package com;

import java.sql.*;

public class Read {

	public static void main(String[] args) {
		
		//JDBC - Java Database Conectivity
		
				//READ - Consulta de una tabla en una base de datos
				//Necesitamos 3 interfaces que nos van a permitir realizar
				//esta consulta
				
				Connection con = null; // conexion a BD
				PreparedStatement ps = null; //
				//Interpretacion de una sentencia SQL precompilada
				ResultSet rs = null; //es una interface que nos ayudará
				// a darle salida a los datos
				
				//Vamos a guardar nuestra consulta en un String aqui
				String query = "SELECT * FROM ALUMNO ORDER BY ALUMNO_ID";
				
				try { //intentamos realizar la comunicacion con la BD
					Class.forName("oracle.jdbc.OracleDriver"); //se busca la clase del controlador
				
				
				//dentro de un paquete
				//Iniciamos la conexion a la BD
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Erraick", "admin");
				
				//Vamos a pasarle el valor de la conexion a PreparedStatment y la sentencia SQL
				ps = con.prepareStatement(query); //aqui se precompila e identifica que es una sentencia SQL
				//Ahora el valor de ps se le pasa a ResultSet para ejecutar la sencencia
				//y recuperar la info
				rs=ps.executeQuery();
				//ResultSet recupera la info columna por columna y una fila a la vez
				//a manera de cursor, por eso, para recuperar a todos los alumnos
				// incluimos esto en un ciclo while
				while(rs.next()) { // Mientras haya filas por recuperar de Alumnos
					//Los imprimimos uno a uno en consola
					//Podemos recuperar la info por numero de columna o por
					// etiquetra o nombre de columna
					System.out.println(rs.getInt("ALUMNO_ID") + " : " +
							rs.getString(2) + " : " + 							
							rs.getDate(3) + " : " + 
							rs.getString(4) + " : " + 
							rs.getString(5) + " : " + 
							rs.getString(6) + " : " + 
							rs.getInt("STATUS"));
					}
				}catch (Exception e) {
					System.out.println("No se pudo realizar la consulta");
					e.printStackTrace();
					
				}
						

	}

}
