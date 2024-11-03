package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Carreras;
import com.general.Database;
import com.general.IMetodos;

public class CarrerasDAO implements IMetodos{

	//DAO - Data Acces Object
		//Es la capa de la implementacion de la lógica
		//paraacceder a los datos de la BD
		//y poder consultarlos, amnipularlos, etc.
		//En resumen, es donde transforma la info
		
	//Decalramos las fases que implementaremos en cada método
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	//Traemos a un objeto de la clase DataBase 
	//para recuperar la info de conexion a BD
	Database db = new Database();
	
	//Traemos a un objeto de la clase Alumno para poder 
	//manipularlo o guardarlo a la BD
	Carreras a = null;
		
	//Declaramos un String para responder con un numero 1 en caso
	//de que se realice la accion satisfactoriamente
	String resultado = null;
		
	
	@Override
	public String guardar(Object ob) {
		//Aquo indicamos que el objeto a guardar que pide este método
				//en realidad seá un alumno, por lo cual hay que caestear ese valor
				a = (Carreras) ob;
				
				String query = "INSERT INTO CARRERAS VALUES (?,?,?,?,?)";
				try {
					Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
					con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
					ps = con.prepareStatement(query);
					
					ps.setInt(1, 1); // el trigger inserta el ID correcto en la BD
					ps.setNString(2,a.getNombre());
					ps.setNString(3, a.getArea());
					ps.setString(4, a.getSemestres());
					ps.setInt(5, a.getPresupuesto()); //Todos los alumnos nuevos a crear se guardan con status 1
					
					int flag = ps.executeUpdate();
					//Validamos
					if (flag==1) {
						//Cambiamos el valor de la variable resultado
						resultado = "1";
						System.out.println("Se ha guardado una nueva carrera");
						
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
a = (Carreras) ob;
		
		String query = "UPDATE CARRERAS SET NOMBRE=?, AREA=?, SEMESTRES=?, PRESUPUESTO=? WHERE CARRERA_ID=?";
		try {
			Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps = con.prepareStatement(query);
			
			ps.setNString(1,a.getNombre());
			ps.setString(2, a.getArea());
			ps.setString(3, a.getSemestres());
			ps.setInt(4, a.getPresupuesto());
			ps.setInt(5, a.getCarreraId()); //recibimos la info del id  a actualizar en la BD
			
			int flag = ps.executeUpdate();
			//Validamos
			if (flag==1) {
				//Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Se ha actualizado correctamente LA CARRERA");
				
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
		String query = "DELETE FROM CARRERAS WHERE CARRERA_ID = "+ id ;  //concatenamos
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
				System.out.println("Se ha eliminado correctamente la carrera");
				
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
				String query = "SELECT * FROM CARRERAS WHERE CARRERA_ID = " +id;
				try {
					Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
					con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
					ps = con.prepareStatement(query);
					rs = ps.executeQuery();
					
					//Creamos el ciclo para que cada valor de cada columna del Alumno consultado
					//se guarde en el objeto a
					while (rs.next()) {
						//guardamos los valotres que estan en rs, ahora en el objeto Alumno a
						a = new Carreras (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
								rs.getInt(5));
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
				String query = "SELECT * FROM CARRERAS";
				//Creamos una lista donde agregarva cada alumno recuperado de la BD
				List<Carreras>carreras = new ArrayList<Carreras>();
				try {
					Class.forName(db.getDriver());//recuperamos la info de conexion a travez del objeto
					con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
					ps = con.prepareStatement(query);
					rs = ps.executeQuery();
					
					//Creamos el ciclo para que cada valor de cada columna de cada Alumno consultado
					//se guarde en el objeto a
					while (rs.next()) {
						//guardamos los valotres que estan en rs, ahora en el objeto Alumno a
						a = new Carreras (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
								rs.getInt(5));
						//Y cada alumno lo agregamos a la lista alumno
						carreras.add(a);
					}
					
				} catch (Exception e) {
					e.printStackTrace();//aqio mejor mandamos la impresion de la excepcion
					//si se llega a reproducir
				}
				
				return carreras; //devolvemos la lista de alumnos consultados 
			}

	//DAO - Data Acces Object
	//Es la capa de la implementacion de la lógica
	//paraacceder a los datos de la BD
	//y poder consultarlos, amnipularlos, etc.
	//En resumen, es donde transforma la info
	
	
	
	
}//end
