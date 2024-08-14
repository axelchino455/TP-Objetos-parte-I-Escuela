package pakage1;

import java.util.Scanner;

import java.util.ArrayList;
//libreria para usar listas
import java.util.List;

public class Escuela {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<Alumno> ();
		List<Curso> cursos = new ArrayList<Curso> ();
		List<Materia> materias = new ArrayList<Materia> ();
		
		List<Materia> materiasRonal = new ArrayList<Materia> ();
		
		int[] numeros = {1,2,3};
		materias.add(new Materia("Lengua", "Arturito", 9));
		materias.add(new Materia("Matematica", "aosiudf", 9));
		materias.add(new Materia("Lengua", "Arturito", 9));
		
		materiasRonal.add(new Materia("Lengua", "Arturito", 9));
		materiasRonal.add(new Materia("Lengua", "Arturito", 9));
		materiasRonal.add(new Materia("Lengua", "Arturito", 9));
		
		// Creando los alumnos de la clase Alumno
		Alumno Axel = new Alumno("Axel", "Chino", "6", materias);
		Alumno Ronal = new Alumno("Ronal", "Garcete", "1", materiasRonal);
		Alumno Kevin = new Alumno("Kevin", "Cocarico", "5", materiasRonal);
		Alumno Carlos = new Alumno("Carlos", "Choquetarqui", "4", materias);
		
		
		// Cargamos la lista con los objetos creados.
		alumnos.add(Axel);
		alumnos.add(Ronal);
		alumnos.add(Kevin);
		alumnos.add(Carlos);
		
		System.out.println(alumnos.get(0).getNombre());

		// buscar los nombres
		// alumnos.size() es igual a la cantidad de objetos que tiene la lista
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i).getNombre());
		}
		
		// ¿A qué materias está anotado un estudiante?
		Scanner tomarvalor = new Scanner(System.in);
		System.out.println("Ingrese el nombre del alummno: ");
		String nombre = tomarvalor.next();
		
		System.out.println("Nombre ingresado: " + nombre);
		
		for (int i = 0; i < alumnos.size(); i++) {
			
			if (alumnos.get(i).getNombre().trim().toUpperCase() == nombre.trim().toUpperCase()) {
				
				System.out.println("El alumno " + nombre+ "esta inscrito en la materia: ");
				
				for (int j = 0; j < alumnos.get(j).getMaterias().size(); j++) {
					System.out.println(alumnos.get(i).getMaterias().get(j).getNombre());
				}
			}
		}
		
	}

}
