package pio.daw.dfg.tema6.list.listJon;

public class Usuario implements Comparable<Usuario>{
	private String dni;
	private String nombre;
	private String apellido; 
	
	public Usuario(String dni,String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Usuario(String DNI) {
		super();
		this.dni = dni;
	}

	public String getDNI() {
		return dni;
	}
	public void setDNI(String dNI) {
		dni = dNI;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getapellido() {
		return apellido;
	}

	public void setapellido(String email) {
		this.apellido = apellido;
	}

	public int compareTo(Usuario otroUsuarioAComparar) {
		// TODO Auto-generated method stub
		return dni.compareTo(otroUsuarioAComparar.getDNI());
	}
	@Override
	public String toString() {
	    return "Usuario [DNI=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
