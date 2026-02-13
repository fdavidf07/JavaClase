package pio.daw.dfg.tema6.map;

public class Jugador implements Comparable<Jugador>{

	private int codigo;
	private String nombre;
	private String nombre_equipo;
	private int goles;
	public Jugador(int codigo, String nombre, String nombre_equipo, int goles) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nombre_equipo = nombre_equipo;
		this.goles = goles;
	}
	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", nombre_equipo=" + nombre_equipo + ", goles="
				+ goles + "]\n";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public int compareTo(Jugador otroJugador) {
		// TODO Auto-generated method stub
		return -1*Integer.compare(goles, otroJugador.getGoles());
	}
	
}
