package pio.daw.dfg.tema6.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHAshMap {

	public static void main(String[] args) {
		// estrucura de un hasmap <clave,vslor>
		HashMap<String,Integer> puntuaciones = new HashMap <>();
		
		// Insertar elementos en el hashmap
		puntuaciones.put("Ana", 9);
		puntuaciones.put("Juan", 2);
		puntuaciones.put("Luis", 6);
		puntuaciones.put("Claudia", 4);
		System.out.println("Puntuaciones: "+puntuaciones);
		
		// ver notas de luis
		int iNotaLuis = puntuaciones.get("Luis");
		System.out.println("Nota de Luis; "+iNotaLuis);
		
		// comporobar si existe la clave
		if(puntuaciones.containsKey("Claudia"))
			System.out.println("Nota de Claudia"+puntuaciones.get("Claudia"));
		
		
		//comprobar si existe el valor
		if ( puntuaciones.containsValue(9))
			System.out.println("Si que hay un valor de 9");
		
		//actualizar un valor
		puntuaciones.put("Juan", 5);
		System.out.println("Puntuaciones: "+puntuaciones);
		
		//Borra un elemento
		puntuaciones.remove("Luis");
		System.out.println("Puntuaciones: "+puntuaciones);
		
		//Tamaño del HashMap
		System.out.println("Tamaño de puntuaciones: "+puntuaciones.size());
		
		// Recorer el HashMap
		for(Map.Entry <String,Integer> entrada : puntuaciones.entrySet()){
			String clave = entrada.getKey();
			int valor = entrada.getValue();
			System.out.println("Clave="+clave+" valor= "+valor);
		}
	}

}
