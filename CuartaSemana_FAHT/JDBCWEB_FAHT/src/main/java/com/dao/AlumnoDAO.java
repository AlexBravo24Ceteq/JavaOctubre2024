package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetallesDTO;
import com.entity.Alumno;
import com.general.Database;
import com.general.IMetodos;

public class AlumnoDAO  implements IMetodos {

	//DAO - Data Acces Object
		//Es la capa de la implementacion de la lógica
		//paraacceder a los datos de la BD
		//y poder consultarlos, amnipularlos, etc.
		//En resumen, es donde transforma la info
	
	//Declaramos las interfaces que utilizaremos en cada método
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	//Traemos a un objeto de la clase Data Base
	//Para recuperar la info de conexionna BD
	
	Database db = new Database();
	
	//Traemos a un objeto de la clase Alumno para poder 
	//manipularlo o guardarlo a la BD
	Alumno a = null;
	
	//Declaramos un String para responder con un numero 1 en caso
	//de que se realice la accion satisfactoriamente
	String resultado = null;
	
	@Override
	public String guardar(Object ob) {
		//Aquo indicamos que el objeto a guardar que pide este método
		//en realidad seá un alumno, por lo cual hay que caestear ese valor
		a = (Alumno) ob;
		
		String query = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setInt(1, 1); // el trigger inserta el ID correcto en la BD
			ps.setNString(2,a.getNombre());
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getGenero());
			ps.setString(5, a.getGrado());
			ps.setString(6, a.getCiudad());
			ps.setInt(7, 1); //Todos los alumnos nuevos a crear se guardan con status 1
			
			int flag = ps.executeUpdate();
			//Validamos
			if (flag==1) {
				//Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Se ha guardado un nuevo alumno");
				
			}else {
				resultado = "0";
						System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			//En caso de que ocurra una excepcion, el msj lo guardaremos en la
			//variable resultado para devolverlo
			resultado = e.getMessage();
		}
		
		return resultado;
	}

	@Override
	public String editar(Object ob) {
a = (Alumno) ob;
		
		String query = "UPDATE ALUMNO SET NOMBRE=?, FECHANAC=?, GENERO=?, GRADO=?, CIUDAD=? WHERE ALUMNO_ID=?";
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setNString(1,a.getNombre());
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getGenero());
			ps.setString(4, a.getGrado());
			ps.setString(5, a.getCiudad());
			ps.setInt(6, a.getAlumnoId()); //recibimos la info del id  a actualizar en la BD
			
			int flag = ps.executeUpdate();
			//Validamos
			if (flag==1) {
				//Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Se ha actualizado correctamente al alumno");
				
			}else {
				resultado = "0";
						System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			//En caso de que ocurra una excepcion, el msj lo guardaremos en la
			//variable resultado para devolverlo
			resultado = e.getMessage();
		}
		
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID= "+ id ;  //concatenamos
		// el id que recibimos para  copletar la setencia SQL
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps = con.prepareStatement(query);
			
			int flag = ps.executeUpdate();
			//Validamos
			if (flag==1) {
				//Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Se ha eliminado correctamente al alumno");
				
			}else {
				resultado = "0";
						System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			//En caso de que ocurra una excepcion, el msj lo guardaremos en la
			//variable resultado para devolverlo
			resultado = e.getMessage();
		}
		
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		
		//Aquí solo consultamos a un alumno
		String query = "SELECT * FROM ALUMNO WHERE ALUMNO_ID = " +id;
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			//Creamos el ciclo para que cada valor de cada columna del Alumno consultado
			//se guarde en el objeto a
			while (rs.next()) {
				//guardamos los valotres que estan en rs, ahora en el objeto Alumno a
				a = new Alumno (rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4),
						rs.getString(5),rs.getString(6),rs.getInt(7));
			}
			
		} catch (Exception e) {
			e.printStackTrace();//aqio mejor mandamos la impresion de la excepcion
			//si se llega a reproducir
		}
		
		return a;//retornamos la consulta del Alumno de l BD hacia el frente
	}

	@Override
	public List mostrar() {
		//Aqui vamos a consultar a todos los alumnos y devolverlos en una lista
		String query = "SELECT * FROM ALUMNO";
		//Creamos una lista donde agregarva cada alumno recuperado de la BD
		List<Alumno>alumnos = new ArrayList<Alumno>();
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			//Creamos el ciclo para que cada valor de cada columna de cada Alumno consultado
			//se guarde en el objeto a
			while (rs.next()) {
				//guardamos los valotres que estan en rs, ahora en el objeto Alumno a
				a = new Alumno (rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4),
						rs.getString(5),rs.getString(6),rs.getInt(7));
				//Y cada alumno lo agregamos a la lista alumno
				alumnos.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();//aqio mejor mandamos la impresion de la excepcion
			//si se llega a reproducir
		}
		
		return alumnos; //devolvemos la lista de alumnos consultados 
	}

	
	//Declaramos un nuevo método propio para recuperar la info del DTO
	
	public List detalles() {
	//Requerimos una Lista del objeto DTO para recuperar esa consulta
	List<DetallesDTO> lista = new ArrayList<DetallesDTO>();
	
	//Necesitamos un objeto de la clase DTO parav irlo agregando a la lista
	DetallesDTO fila = null;
	
	String query = "SELECT A.ALUMNO_ID AS MATRICULA,A.NOMBRE AS ALUMNO , " + 
			"A.GRADO AS SEMESTRE,C.NOMBRE AS CARRERA FROM ALUMNO A " + 
			"INNER JOIN CARRERAS_ALUMNOS CA " + 
			"ON A.ALUMNO_ID=CA.ALUMNO_ID " + 
			"INNER JOIN CARRERAS C " + 
			"ON C.CARRERA_ID = CA.CARRERA_ID";
	
	try {
		Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
		con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
		ps = con.prepareStatement(query);
		rs = ps.executeQuery();
		
		//Creamos el ciclo para que cada valor de cada columna de cada Alumno consultado
		//se guarde en el objeto a
		while (rs.next()) {
			//guardamos los valotres que estan en rs, ahora en el objeto DetallesDTO fila
			fila = new DetallesDTO (rs.getInt("MATRICULA"),rs.getString("ALUMNO"),rs.getString("SEMESTRE"),
					rs.getString("CARRERA"));
			//Y cada fila lo agregamos a la lista
			lista.add(fila);
		}
		
	} catch (Exception e) {
		e.printStackTrace();//aqio mejor mandamos la impresion de la excepcion
		//si se llega a reproducir
	}
	
	return lista;
	}
}//END
