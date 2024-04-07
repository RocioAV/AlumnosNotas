package main;

import java.util.Scanner;

import model.Alumno;
import model.Materia;
import model.RegistroNota;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//PARA EL ALUMNO ARIEL VEGA SE REGIDTRE LAS NOTAS FINALES DE PROGVISUAL Y POO
		
		Alumno alumno = generarAlumno();
		
		System.out.println(alumno.toString());
		
		
		
		registrarNotas(alumno, 2);
		
	}
	
	public static Alumno generarAlumno() {
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		System.out.println("ingrese el legajo: ");
		Integer legajo = sc.nextInt();
		System.out.println("ingrese nombre: ");
		String nombreA= sc.next();
		System.out.println("ingrese apellido: ");
		String apellidoA= sc.next();
		
		alumno.setApellido(apellidoA);
		alumno.setLegajo(legajo);
		alumno.setNombre(nombreA);
		//sc.close();
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		
		while(i <=numMaterias) {
			//carga de materia
			System.out.println("Ingrese nombre de la materia: ");
			String nombreMateria= sc.next();
			System.out.println("Ingrese codigo de la materia: ");
			String codigoMateria= sc.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
		
			System.out.println("Ingrese codigo del registro de nota ");
			String codigoNota= sc.next();
			System.out.println("Ingrese nota final: ");
			Float nota = sc.nextFloat();
			
			RegistroNota registroNota= new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			i++;
			
		}
		sc.close();
	}

}
