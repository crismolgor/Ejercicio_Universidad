package UNIVERSIDAD;

public class Profesor {
	private String codigo;
	
	public Profesor() {
		
	}
	public Profesor(String codigo, String nombre, String titulo, Departamento departamento) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.titulo = titulo;
		this.departamento = departamento;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	private String nombre;
	private String titulo;
	private Departamento departamento;
	
}
