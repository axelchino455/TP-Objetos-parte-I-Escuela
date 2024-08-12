package pakage1;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
	private String nombre;
	private String apellido;
	private String ano;
	private List<Materia> materias;

public Alumno (String n, String ape, String a, String m){
	this.nombre = n;
	this.apellido = ape;
	this.ano = a;

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



}
