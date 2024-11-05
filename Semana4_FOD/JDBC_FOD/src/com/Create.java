package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {
		// la clse create que seria nincertar registros en nuestra base de datos
		Connection con = null;// hace la coneccion a la base de datsos
		PreparedStatement ps = null; //entrada de datos o interpretacion de una sentencia SQL precompilada
		//guardamos la sentencia para realizar un incert
		//EN ESTA SENTYENCIA SOLO DEJAMOS INDICADO EL NUMERO DE COLUMNAS CON UN SIGNO DE INTERROGACION 
		String query = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";
		
		//intentamos nuevamente la conexion a nuestra base de datos
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "FerrerSystem", "admin");
			ps = con.prepareStatement(query);
			//una ves se precompila iun insert se establecen los valores de forma individual a traves de ps
			ps.setInt(1, 1);// se incertan los valores por columna y el valor
			//aqui es la columna 1 pero el id se deja por requisito encargando al trigger de ejecutarlo
			//en caso de no contar con un triggery secuencia, hay que especificar al id
			ps.setString(2, "Adriana Lara");
			ps.setString(3, "20/10/1999");
			ps.setString(4, "FEMENINO");
			ps.setString(5, "1ER SEMESTRE");
			ps.setString(6, "CELAYA, GTO");
			ps.setInt(7, 0);
			
			// una ves que tenemos los valores esttablecidos a guardar ejecutamos la insercion
			int flag = ps.executeUpdate();
			//AQUI comprobamos que cuando se guarada una incercion se guarda un numero 1
			//System.out.println(flag);
			
			//con ello podemos hacer una validacion y mandar un mensaje ne consola
			if (flag == 1) {
				System.out.println("Alumno registrado exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
