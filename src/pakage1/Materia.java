package pakage1;

public class Materia {
	private int legajo;
	private String nombre;
	private String profesor;
	private int nota;
	
public Materia (int l, String n, String pro, int not) {
	this.legajo = l;
	this.nombre = n;
	this.profesor = pro;
	this.nota = not;
}

public int getLegajo() {
	return legajo;
}

public void setLegajo(int legajo) {
	this.legajo = legajo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getProfesor() {
	return profesor;
}

public void setProfesor(String profesor) {
	this.profesor = profesor;
}

public int getNota() {
	return nota;
}

public void setNota(int nota) {
	this.nota = nota;
}



}
