package com.dto;

public class DetallesDTO {

	private int matricula;
	private String alumno;
	private String semestre;
	private String carrera;
	
	public DetallesDTO () {}

	public DetallesDTO(int matricula, String alumno, String semestre, String carrera) {
		super();
		this.matricula = matricula;
		this.alumno = alumno;
		this.semestre = semestre;
		this.carrera = carrera;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "DetallesDTO [matricula=" + matricula + ", alumno=" + alumno + ", semestre=" + semestre + ", carrera="
				+ carrera + "]";
	}
	
	
	
}//END
