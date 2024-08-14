package pakage1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Alumno {
	private String nombre;
	private String apellido;
	private String ano;
	private List<Materia> materias;

	public Alumno(String nombre, String apellido, String ano, List<Materia> materias) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.ano = ano;
		this.materias = materias;
	}

public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nom) {
	this.nombre = nom;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String ape) {
	this.apellido = ape;
}

public String getAno() {
	return ano;
}

public void setAno(String a) {
	this.ano = a;
}

public void imprimirMaterias() {
	for (Materia materia : materias) {
		System.out.println(materia.getNombre());
	}
}

}
