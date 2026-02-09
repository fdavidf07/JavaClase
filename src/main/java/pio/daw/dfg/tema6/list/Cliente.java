package pio.daw.dfg.tema6.list;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente>{

	private String DNI;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	

	public Cliente(String dNI) {
		super();
		DNI = dNI;
	}

	public Cliente(String dNI, String nombre, LocalDate fechaNacimiento) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]\n";
	}

	@Override
	public int compareTo(Cliente otroClienteAComparar) {
		// TODO Auto-generated method stub
		return DNI.compareTo(otroClienteAComparar.getDNI());
	}
	
	
}
