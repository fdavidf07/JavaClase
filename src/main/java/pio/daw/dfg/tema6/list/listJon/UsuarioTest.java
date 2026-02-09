package pio.daw.dfg.tema6.list.listJon;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.Reader;
import com.google.gson.*;
import java.io.Writer;

public class UsuarioTest {
	final static String RUTA_FICH = "usuarios.json";
		
				public static void main(String[] args) {
					
					System.out.println("Leyendo archivo de : " + System.getProperty("user.dir"));
					
					try { 
					Reader readerEntrada = Files.newBufferedReader(Paths.get(RUTA_FICH));
					Gson gson= new Gson();
					List<Usuario> listaUsuarios = Arrays.asList(gson.fromJson(readerEntrada, Usuario[].class));
					
					Collections.sort(listaUsuarios);	
					System.out.println("Lista de usuarios ORDENADO"+ listaUsuarios);
					
					Writer writerSalida=Files.newBufferedWriter(Paths.get(RUTA_FICH+"usuarioOrdenados.json"));
					gson.toJson(listaUsuarios,writerSalida);
					writerSalida.close();
					System.out.println("Fichero usuarios ordenados"+listaUsuarios);
					
					} catch (java.io.IOException e) {
						e.printStackTrace();
					}
	}

}
