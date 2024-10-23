package pakage1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
//libreria para usar listas
import java.util.List;

public class Escuela {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<Alumno> ();
		List<Curso> cursos = new ArrayList<Curso> ();
		List<Materia> materias = new ArrayList<Materia> ();
		
		

		int[] numeros = {1,2,3};
		
		
		List<Materia> materiasAxel = new ArrayList<Materia> ();
		materiasAxel.add(new Materia(1, "Fisica", "Nicolas Tesla", 7));
		materiasAxel.add(new Materia(1, "Gestion de los procesos productivos", "Nuñez", 7));
		materiasAxel.add(new Materia(1, "Ciudadania", "Pablo", 10));
		
		
		List<Materia> materiasRonal = new ArrayList<Materia> ();
		materiasRonal.add(new Materia(2, "Lengua", "Arturito", 9));
		materiasRonal.add(new Materia(2, "Matematica", "Buchi", 9));
		materiasRonal.add(new Materia(2, "Fisica", "Nicolas Tesla", 9));
		
		
		List<Materia> materiasKevin = new ArrayList<Materia> ();
		materiasKevin.add(new Materia(3, "Ciencia y tecnologia", "Roberto", 6));
		
		
		List<Materia> materiasCarlos = new ArrayList<Materia> ();
		materiasCarlos.add(new Materia(4, "Ingles", "Liliana", 4));
		
		
		
		// Creando los alumnos de la clase Alumno
		Alumno Axel = new Alumno("Axel", "Chino", "6", materiasAxel);
		Alumno Ronal = new Alumno("Ronal", "Garcete", "1", materiasRonal);
		Alumno Kevin = new Alumno("Kevin", "Cocarico", "5", materiasKevin);
		Alumno Carlos = new Alumno("Carlos", "Choquetarqui", "4", materiasCarlos);
		
		
		// Cargamos la lista con los objetos creados.
		alumnos.add(Axel);
		alumnos.add(Ronal);
		alumnos.add(Kevin);
		alumnos.add(Carlos);


		System.out.println(" ");

		// buscar los nombres
		// alumnos.size() es igual a la cantidad de objetos que tiene la lista
		System.out.println("Los alumnos van a la escuela son:");
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println("El alumno: "+alumnos.get(i).getNombre()+" "+alumnos.get(i).getApellido());
		}

		System.out.println(" ");
		System.out.println("Todos los alumnos, y que materias tienen: ");

		for (int i=0; i<alumnos.size(); i++){
			for (int j=0; j<alumnos.get(i).getMaterias().size(); j++){
				System.out.println("El alumno "+alumnos.get(i).getNombre()+" tiene como materia: "+alumnos.get(i).getMaterias().get(j).getNombre());
			}
		}

		System.out.println(" ");
		System.out.println(" ");


		// ¿A qué materias está anotado un estudiante?
		Scanner tomarvalor = new Scanner(System.in);
		System.out.println("Ingrese el nombre de alummno un alumno para saber que materias tiene");
		String nombre = tomarvalor.next();

		System.out.println("Nombre ingresado: " + nombre);


		for(int j=0; j < alumnos.size(); j++) {
			// qualsIgnoreCase() esto es para comparar dos valores sin inportar si es mayuscula.x
			if (alumnos.get(j).getNombre().trim().equalsIgnoreCase(nombre.trim())) {

				for (Materia materiadelAlumno : alumnos.get(j).getMaterias()){
					System.out.println("El alumno "+alumnos.get(j).getNombre()+" tinen como materia: "+materiadelAlumno.getNombre());
				}

			}else {
				// Este else repite 4 vecez el error
				System.out.println("El nombre ingresado no esta registrado");
			}
		}

		
		tomarvalor.close();
		
	}

}
