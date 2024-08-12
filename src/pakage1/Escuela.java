package pakage1;

import java.util.ArrayList;
//libreria para usar listas
import java.util.List;

public class Escuela {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<Alumno> ();
		List<Curso> cursos = new ArrayList<Curso> ();
		List<Materia> materias = new ArrayList<Materia> ();
		
		// Creando los alumnos de la clase Alumno
		Alumno Axel = new Alumno("Axel", "Chino", "6", "Matematica");
		Alumno Ronal = new Alumno("Ronal", "Garcete", "1", "Lengua");
		Alumno Kevin = new Alumno("Kevin", "Cocarico", "5", "Ingles");
		Alumno Carlos = new Alumno("Carlos", "Choquetarqui", "4", "Geografia");
		
		
		// Cargamos la lista con los objetos creados.
		alumnos.add(Axel);
		alumnos.add(Ronal);
		alumnos.add(Kevin);
		alumnos.add(Carlos);

		// buscar los nombres
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i).getNombre());
		}
		
		// ¿A qué materias está anotado un estudiante?
		
		
		
		
	}

}
