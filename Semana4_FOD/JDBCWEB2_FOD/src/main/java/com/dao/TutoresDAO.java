package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Tutores;
import com.general.Database;
import com.general.IMetodos;

public class TutoresDAO implements IMetodos {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
		Database db = new Database();
		Tutores t = null;
		String resultado = null;	
		

	@Override
	public String guardar(Object ob) {
		t = (Tutores) ob;
		
		String query = "INSERT INTO TUTORES VALUES (?,?,?,?)";
		 
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setInt(1,8);
			ps.setString(2, t.getNombre());
			ps.setString(3, t.getEmail());
			ps.setString(4, t.getClave());
			
			int flag = ps.executeUpdate();
			if (flag == 1) {
				resultado = "1";
				System.out.println("Se ha guardado un nuevo tutor");
			}else {
				resultado = "0";
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			resultado = e.getMessage();
			
		}
		
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		t = (Tutores) ob;
		
		String query = "UPDATE TUTORES SET NOMBRE =?, EMAIL =?, CLAVE=? WHERE TUTOR_ID=?";
		 
		try {
			Class.forName(db.getDriver());//recuperamos la info de la conexion a traves del objeto db
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setString(1, t.getNombre());
			ps.setString(2, t.getEmail());
			ps.setString(3, t.getClave());
			ps.setInt(4, t.getTutorId());//recibimos el id del alumno 
			
			int flag = ps.executeUpdate();
			//validamos 
			if (flag == 1) {
				//cambiamos el valor de la variable del resultado
				resultado = "1";
				System.out.println("Se ha actualizado correctamente el tutor");
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
		String query = "DELETE FROM TUTORES WHERE TUTOR_ID =" + id;//concatenamos el id 
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
				System.out.println("Se ha eliminado correctamenet el tutor");
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
		String query = "SELECT * FROM TUTORES WHERE TUTOR_ID = " + id; 

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			//creamos el ciclo para que cada valor de cada columna del alumno consultado 
			//se guarde en el objeto a
			while (rs.next()) {
				//guardamos los valores que estan en rs ahora en el objeto Alumno a
				t = new Tutores(rs.getInt(1), rs.getString(2),  rs.getString(3),
						rs.getString(4));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();//aqui mejor mandamos la exepsin si se llega a producir
		}

		return t;
	}

	@Override
	public List mostrar() {
		//aqui bamos a consultar todos los alumnos y devolverlos en una lista
				String query = "SELECT * FROM TUTORES"; 
				//creamos una lista donde agregar cada aulumno recuperado en nuestra base de datos
				List<Tutores> tutores = new ArrayList<Tutores>();

				try {
					Class.forName(db.getDriver());//recuperamos la info de conexion a travews del objeto
					con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
					ps = con.prepareStatement(query);
					rs = ps.executeQuery();
					
					//creamos el ciclo para que cada valor de cada columna del alumno consultado 
					//se guarde en el objeto a
					while (rs.next()) {
						//guardamos los valores que estan en rs ahora en el objeto Alumno a
						t = new Tutores(rs.getInt(1), rs.getString(2), rs.getString(3),
								rs.getString(4));
						
						//cada alumno lo agregamos a la lista alumnos
						tutores.add(t);
						
					}
					
				} catch (Exception e) {
					e.printStackTrace();//aqui mejor mandamos la exepsin si se llega a producir
				}

				return tutores;
		
	}

}
