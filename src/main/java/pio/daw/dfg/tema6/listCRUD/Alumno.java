package pio.daw.dfg.tema6.listCRUD;

public class Alumno implements Comparable<Alumno>{

	private int nia;
	private String Nombre;
	private String Apellido;
	private String ciclo;
	private String aula;
	public Alumno(int nia, String nombre, String apellido, String ciclo, String aula) {
		super();
		nia = nia;
		Nombre = nombre;
		Apellido = apellido;
		this.ciclo = ciclo;
		this.aula = aula;
	}
	@Override
	public String toString() {
		return "Alumno [NIA=" + nia + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", ciclo=" + ciclo + ", aula="
				+ aula + "]";
	}
	public int getnia() {
		return nia;
	}
	public void setnia(int nIA) {
		nia = nia;
	}
	@Override
	public int compareTo(Alumno otroAlumno) {
		// TODO Auto-generated method stub
		return Integer.compare(nia,otroAlumno.getnia());
	}
	
}
