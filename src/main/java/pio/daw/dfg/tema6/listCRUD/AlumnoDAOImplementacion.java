package pio.daw.dfg.tema6.listCRUD;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

import pio.daw.dfg.tema6.list.listJon.Usuario;

public class AlumnoDAOImplementacion implements AlumnoDAO {
	
	
	
	
	private List<Alumno> listaAlumnos;
	private final String RUTA_FICH = "alumnos.json";
		private List<Alumno> cargarDatos() {
			// Método que carga el json de alumnos 
			System.out.println("Leyendo archivo de : " + System.getProperty("user.dir"));
			
			try { 
			Reader readerEntrada = Files.newBufferedReader(Paths.get(RUTA_FICH));
			Gson gson= new Gson();
			List<AlumnoDAO> ListaAlumnos = Arrays.asList(gson.fromJson(readerEntrada, AlumnoDAO[].class));
			
			Collections.sort(listaAlumnos);	
			System.out.println("Lista de alumnos "+ ListaAlumnos);
			} catch (java.io.IOException e) {
				e.printStackTrace(); }
			return listaAlumnos;
			}
	
	@Override
	public int create(Alumno nuevoAlum) throws Exception {
		
		return 1;
	}

	@Override
	public Alumno read(int niaBuscar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int niaActualizar, Alumno alumnoCambiado) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int niaBorrar) throws Exception {
		// TODO Auto-generated method stub

	}

}
