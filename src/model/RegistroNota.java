package model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float nota1Final;
	
	
	
	@Override
	public String toString() {
		return "RegistroNota -> codigo=" + codigo + "\n  alumno -> " + alumno + "\n materia -> " + materia + ", --- nota1Final="
				+ nota1Final + "]";
	}


	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}


	public RegistroNota(String codigo, Alumno alumno, Materia materia, Float nota1Final) {
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.nota1Final = nota1Final;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public Float getNota1Final() {
		return nota1Final;
	}


	public void setNota1Final(Float nota1Final) {
		this.nota1Final = nota1Final;
	}
	
	
}
