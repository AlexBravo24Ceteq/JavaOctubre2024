package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.entity.Carrera;
import com.general.Database;
import com.general.IMetodos;

public class CarreraDAO implements IMetodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	Database db = new Database();

	Carrera c = null;
	String resultado = null;

	@Override
	public String guardar(Object ob) {
		c = (Carrera) ob;

		String query = "INSERT INTO CARRERAS VALUES (?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setInt(1, 1);
			ps.setString(2, c.getNombre());
			ps.setString(3, c.getArea());
			ps.setString(4, c.getSemestres());
			ps.setDouble(5, c.getPresupuesto());

			int flag = ps.executeUpdate();

			if (flag == 1) {
				// Cambiamos el valor de la variable resultado
				resultado = "1";
				System.out.println("Carrera Registrada Exitosamente");
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
		
		c = (Carrera) ob;
		String query = "UPDATE CARRERAS SET NOMBRE=?,AREA=?,SEMESTRES=?,PRESUPUESTO=? WHERE CARRERA_ID=?";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setString(1, c.getNombre());
			ps.setString(2, c.getArea());
			ps.setString(3, c.getSemestres());
			ps.setDouble(4, c.getPresupuesto());
			ps.setInt(5, c.getCarreraId());

			int flag = ps.executeUpdate();

			if (flag == 1) {
				resultado = "1";
				System.out.println("Carrera Editada Exitosamente");
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
		String query = "DELETE FROM CARRERAS WHERE CARRERA_ID= " + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			int flag = ps.executeUpdate();

			if (flag == 1) {
				resultado = "1";
				System.out.println("Carrera Editada Exitosamente");
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
		String query = "SELECT * FROM CARRERAS WHERE CARRERA_ID= " + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {

				c = new Carrera(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return c;
	}

	@Override
	public List mostrar() {
		String query = "SELECT * FROM CARRERAS ORDER BY CARRERA_ID";

		List<Carrera> carrera = new ArrayList<Carrera>();

		try {
			Class.forName(db.getDriver()); 
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				c = new Carrera(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
				carrera.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return carrera; 
	}

}
