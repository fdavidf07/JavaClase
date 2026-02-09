package pio.daw.dfg.tema6.list;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaNombres= new ArrayList<>();
		// agregar elementos 
		listaNombres.add("Ana");
		listaNombres.add("Carlos");
		listaNombres.add("Sofia");
		listaNombres.add("Carlos");
		System.out.println("Tamaño del ArrayLiat: "+listaNombres.size());
		System.out.println("Primer elemento de la Lista: "+listaNombres.get(0));
		System.out.println("Primer elemento de la Lista: "+listaNombres.get(2));
		System.out.println("Ultimo elemento de la Lista: "+listaNombres.get(listaNombres.size()-1));
		// Recorer array
		for (String nombre : listaNombres) {
			System.out.println(nombre +"\t");
		}
		// Esta??
		if(listaNombres.contains("Carlos"));
		System.out.println("ListaNombres="+listaNombres);
		
		
	}

}
