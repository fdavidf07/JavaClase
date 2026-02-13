package pio.daw.dfg.tema6.map;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

public class JugadoresTreeMap {

	final static  String RUTA_FICH ="src\\main\\java\\pio\\daw\\dfg\\tema6\\map\\";
	private static final Class Jugador = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader readerEntrada;
		try {
			readerentrada= Files.newBufferedReader(Paths.get(RUTA_FICH+))
			Gson gson= new Gson();
			// cargamos el archivo json
			List<Jugadores> listaJugadores = Arrays.asList(gson.fromJson(readerEntrada, Jugador));
			System.out.println("lista de jugadores desde json: "+listaJugadores);
			listaJugadores.sort(Comparator.comparing(Jugador::getGoles));
			System.out.println("****\nlistaJugadores"+listaJugadores);
			TreeMap<Integer,Jugador> mapJugadores = new TreeMap<>();
		}catch (IOException)
		
	}

}
