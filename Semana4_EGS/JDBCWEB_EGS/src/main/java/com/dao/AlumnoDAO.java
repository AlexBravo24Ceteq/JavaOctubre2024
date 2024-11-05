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

public class AlumnoDAO implements IMetodos {

	// DAO - Data acces Object
	// Es la capa de la implementacion de la logica
	// para acceder a los datos mde la BD
	// y poder consultarlos, manipularlos, etc.
	// En resumen transforma la info

	// Declaramos las interfaces que utilizaremos en
	// cada metodo

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	// Traemos a un objeto de la clase Database
	// Para recuperar la info de la conexión a BD
	Database db = new Database();

	// Traemos a un objeto de la clase Alumno para poder manipularlo o guardarlo
	// en la BD
	Alumno a = null;

	// Declaramos un String para responder con un "1" en caso de que se realice
	// la acción satisfactoriamente
	String resultado = null;

	@Override
	public String guardar(Object ob) {
		// Aqui indicamos que el objeto a guardar que pide este metodo
		// en realidad será un Alumno, por lo cual hay que castear ese valor
		a = (Alumno) ob;

		String query = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";
		try {
			Class.forName(db.getDriver()); // Recuperamos la info de conexiona a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setInt(1, 1); // El trigger inserta el ID correcto en la BD
			ps.setString(2, a.getNombre());
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getGenero());
			ps.setString(5, a.getGrado());
			ps.setString(6, a.getCiudad());
			ps.setInt(7, 1); // Todos los alumnos nuevos a crear se guardan con status 1

			int flag = ps.executeUpdate();

			if (flag == 1) {
				// Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Alumno REGISTRADO Exitosamente");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			// En cado de que ocurra una excepcion, el mensaje lo guardamos en la
			// Variable resultado para devolverlo
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public String editar(Object ob) {

		a = (Alumno) ob;

		String query = "UPDATE ALUMNO SET NOMBRE=?, FECHANAC=?," 
		+ " GENERO=?, GRADO=?, CIUDAD=? WHERE ALUMNO_ID=?";
		try {
			Class.forName(db.getDriver()); // Recuperamos la info de conexiona a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setString(1, a.getNombre());
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getGenero());
			ps.setString(4, a.getGrado());
			ps.setString(5, a.getCiudad());
			ps.setInt(6, a.getAlumnoId()); // Recibimos la info del ID a actualizar en la BD

			int flag = ps.executeUpdate();

			if (flag == 1) {
				// Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Alumno ACTUALIZADO Exitosamente");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {

		String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID= " + id;
		try {
			Class.forName(db.getDriver()); // Recuperamos la info de conexiona a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			int flag = ps.executeUpdate();

			if (flag == 1) {
				// Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Alumno ELIMINADO Exitosamente");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM ALUMNO WHERE ALUMNO_ID = " + id;

		try {
			Class.forName(db.getDriver()); // Recuperamos la info de conexiona a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			// Creamos el ciclo para que el valor de cada columna del alumno consultado
			// se guarde en el objeto a
			
			while(rs.next()) {
				// Guardamos los valores que estan en rs en el objeto Alumno "a"
				a= new Alumno(rs.getInt(1), rs.getString(2),rs.getDate(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7));
			}

		} catch (Exception e) {
			e.printStackTrace(); // Aqui mejor mandamos la impresion de la excepcion 
			// si se llega a producir
		}
		return a; // retornamos la columna del Alumno de la base de datos hacia el frente
	}

	@Override
	public List mostrar() {
		
		// Aqui vamos a consultar a todos los alumnos y devolverlos en una Lista
		String query = "SELECT * FROM ALUMNO";
		
		//Creamos una lista donde agregar a cada Alumno recuperado de la base de datos
		List<Alumno> alumnos = new ArrayList<Alumno>();

		try {
			Class.forName(db.getDriver()); // Recuperamos la info de conexiona a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			// Creamos el ciclo para que el valor de cada columna del alumno consultado
			// se guarde en el objeto a
			
			while(rs.next()) {
				// Guardamos los valores que estan en rs en el objeto Alumno "a"
				a= new Alumno(rs.getInt(1), rs.getString(2),rs.getDate(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7));
				// Y cada Alumno lo agregamos a la lista alumnos
				alumnos.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace(); // Aqui mejor mandamos la impresion de la excepcion 
			// si se llega a producir
		}
		return alumnos; // Devolvemos la lista de alumnos consultados
	}
	
	// Declaramos un nuevo metodo propio para recuperar la info del DTO
	public List detalles() {
		
		//Requerimos una Lista del objeto DTO para recuperar esa consulta
		List<DetallesDTO> lista = new ArrayList<DetallesDTO>();
		
		// Necesitamos un objeto de la clase DTO para irlo agregando a la lista
		DetallesDTO fila = null;
		
		String query = "SELECT A.ALUMNO_ID AS MATRICULA, A.NOMBRE AS ALUMNO, " + 
				"A.GRADO AS SEMESTRE, C.NOMBRE AS CARRERA FROM ALUMNO A " + 
				"INNER JOIN CARRERAS_ALUMNOS CA " + 
				"ON A.ALUMNO_ID = CA.ALUMNO_ID " + 
				"INNER JOIN CARRERAS C " + 
				"ON C.CARRERA_ID = CA.CARRERA_ID";
		try {
			Class.forName(db.getDriver()); // Recuperamos la info de conexiona a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			// Creamos el ciclo para que el valor de cada columna del alumno consultado
			// se guarde en el objeto a
			
			while(rs.next()) {
				// Guardamos los valores que estan en rs, ahora en el objeto DetallesDTO "fila"
				fila= new DetallesDTO(rs.getInt("MATRICULA"), rs.getString("ALUMNO"),
						rs.getString("SEMESTRE"), rs.getString("CARRERA"));
				// Y cada fila la agregamos a la lista
				lista.add(fila);
			}
		} catch (Exception e) {
			e.printStackTrace(); // Aqui mejor mandamos la impresion de la excepcion 
			// si se llega a producir
		}
		return lista;
	}

}
