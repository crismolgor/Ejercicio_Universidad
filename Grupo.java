package UNIVERSIDAD;

public class Grupo {
private String id;
private int capacidad;

public Grupo() {
	
}
public Grupo(String id, int capacidad) {
	
	this.id = id;
	this.capacidad = capacidad;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getCapacidad() {
	return capacidad;
}
public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}
}
