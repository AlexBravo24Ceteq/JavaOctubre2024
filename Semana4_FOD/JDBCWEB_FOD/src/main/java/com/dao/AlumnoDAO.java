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
	
	//DAO data acces object es la capa de la implementacion de la logica para acceder a los datos de la base de datos 
	//y poder consultarlos, manipularlos , etc. es donde se transforma la informacion
	//declaramos las interfaces que utilizaremos en cada metodo
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	//traeos a un objeto de la clase database para recuperar la info de la conexion de la DB
	Database db = new Database();
	
	//traemos a un objeto de la clase alumno para poder manipularlo o guardarlo en la base de datos
	Alumno a = null;
	
	//declaramos un String para responder con un numero 1 en caso de que se realize la accion satisfactoriamente
	String resultado = null;	
	
	@Override
	public String guardar(Object ob) {
		//aqui indicamos que el objeto a guardar que pide este metodo en realidad sera un alumno
		//por lo cual tendremos que castear este valor
		a = (Alumno) ob;
		
		String query = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";
		 
		try {
			Class.forName(db.getDriver());//recuperamos la info de la conexion a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setInt(1,1);//el triger incerta el id correcto en la base de datos
			ps.setString(2, a.getNombre());
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getGenero());
			ps.setString(5, a.getGrado());
			ps.setString(6, a.getCiudad());
			ps.setInt(7, 1);//todos loa alumnos uevos a crear se guardan con status 1
			
			int flag = ps.executeUpdate();
			//validamos 
			if (flag == 1) {
				//cambiamos el valor de la variable del resultado
				resultado = "1";
				System.out.println("Se ha guardado un nuevo alumno");
			}else {
				resultado = "0";
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			//en caso de que ocurra un exepcion el mensaje lo guardamos en la variable resultado
			resultado = e.getMessage();
			
		}
		
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		a = (Alumno) ob;
		
		String query = "UPDATE ALUMNO SET NOMBRE =?, FECHANAC =?, GENERO=?, GRADO =?, CIUDAD =? WHERE ALUMNO_ID=?";
		 
		try {
			Class.forName(db.getDriver());//recuperamos la info de la conexion a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setString(1, a.getNombre());
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getGenero());
			ps.setString(4, a.getGrado());
			ps.setString(5, a.getCiudad());
			ps.setInt(6, a.getAlumnoId());//recibimos el id del alumno 
			
			int flag = ps.executeUpdate();
			//validamos 
			if (flag == 1) {
				//cambiamos el valor de la variable del resultado
				resultado = "1";
				System.out.println("Se ha actualizado correctamente el alumno");
			}else {
				resultado = "0";
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			//en caso de que ocurra un exepcion el mensaje lo guardamos en la variable resultado
			resultado = e.getMessage();
			
		}
		
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID =" + id;//concatenamos el id 
		//que recibimos para completar la sentencia  SQL
		 
		try {
			Class.forName(db.getDriver());//recuperamos la info de la conexion a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			
			int flag = ps.executeUpdate();
			//validamos 
			if (flag == 1) {
				//cambiamos el valor de la variable del resultado
				resultado = "1";
				System.out.println("Se ha eliminado correctamenet el alumno");
			}else {
				resultado = "0";
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			//en caso de que ocurra un exepcion el mensaje lo guardamos en la variable resultado
			resultado = e.getMessage();
			
		}
		
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM ALUMNO WHERE ALUMNO_ID = " + id; 

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			//creamos el ciclo para que cada valor de cada columna del alumno consultado 
			//se guarde en el objeto a
			while (rs.next()) {
				//guardamos los valores que estan en rs ahora en el objeto Alumno a
				a = new Alumno(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4),
						rs.getString(5), rs.getString(6),rs.getInt(7));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();//aqui mejor mandamos la exepsin si se llega a producir
		}

		return a;
	}

	@Override
	public List mostrar() {
		//aqui bamos a consultar todos los alumnos y devolverlos en una lista
		String query = "SELECT * FROM ALUMNO"; 
		//creamos una lista donde agregar cada aulumno recuperado en nuestra base de datos
		List<Alumno> alumnos = new ArrayList<Alumno>();

		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travews del objeto
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			//creamos el ciclo para que cada valor de cada columna del alumno consultado 
			//se guarde en el objeto a
			while (rs.next()) {
				//guardamos los valores que estan en rs ahora en el objeto Alumno a
				a = new Alumno(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4),
						rs.getString(5), rs.getString(6),rs.getInt(7));
				
				//cada alumno lo agregamos a la lista alumnos
				alumnos.add(a);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();//aqui mejor mandamos la exepsin si se llega a producir
		}

		return alumnos;// devolvemos la lista de alumnos consultados
		
		
	}
	
	
	//declaramos un nuevo metodo propio para recuperar la info del dto
	public List detalles() {
		//requerimos una lista del objeto dto para recuperar esa consulta
		List<DetallesDTO> lista = new ArrayList<DetallesDTO>();
		//necesitamos un objeto d ela clase dtom para irlo agregando a la lista
		DetallesDTO fila = null;
		String query = "SELECT A.ALUMNO_ID AS MATRICULA, A.NOMBRE AS ALUMNO, " +
				"A.GRADO AS SEMESTRE, C.NOMBRE AS CARRERA FROM ALUMNO A " + 
				" INNER JOIN CARRERAS_ALUMNOS CA " + 
				" ON A.ALUMNO_ID = CA.ALUMNO_ID " + 
				" INNER JOIN CARRERAS C " + 
				" ON C.CARRERA_ID = CA.CARRERA_ID"; 
		
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travews del objeto
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			//creamos el ciclo para que cada valor de cada columna del alumno consultado 
			//se guarde en el objeto a
			while (rs.next()) {
				//guardamos los valores que estan en rs ahora en el objeto DetallesDTO fila
				fila = new DetallesDTO(rs.getInt("MATRICULA"), rs.getString("ALUMNO"), 
						rs.getString("SEMESTRE"), rs.getString("CARRERA"));
				
				//cada fila lo agregamos a la lista
				lista.add(fila);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();//aqui mejor mandamos la exepsin si se llega a producir
		}

		
		
		return lista;
	}
	
	
}
