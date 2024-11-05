package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {

		Connection con = null; // conexion a base de datos
		PreparedStatement ps = null;
		//Guardamos la sentencia para realizar un INSERT
		//En esta sentencia solo dejamos indicados el numero de 
		//columnas con un signo de ?
		String query = "INSERT INTO CLIENTE VALUES (?,?,?,?)";
		
		//Intentamos nuevamente la conexion a base de datos
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","FaridCeteq","admin");
			ps = con.prepareStatement(query);
			
			//Una vez se precompila un insert, se establecen los valores
			//de forma individual a traves de ps
			
			ps.setInt(1, 1); //Se insertan los valores por columna y el valor
			// aqui es la columna 1, pero el id se deja por requisito y el trigger
			//se encarga de asignarlo
			//en caso de no contar con trigger y secuencia, hay que especificar el ID 
			ps.setString(2, "GUSTAVO MAYO");
			ps.setString(3,"HIDALGO 626");
			ps.setString(4, "2411264753");
			
			//Una vez que tenemos establecidos los valores a guardar, ejecutamos
			// la insercion
			int flag = ps.executeUpdate();
			//Aqui comprobamos que cuando se hace una insercion, se guarda un numero 1
			//System.out.println(flag);
			if (flag == 1) {
				System.out.println("Cliente registrado exitosamente");
			}else {
				System.out.println("Hubo un error en el registro");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//end

}
