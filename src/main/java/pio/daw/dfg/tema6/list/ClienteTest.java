package pio.daw.dfg.tema6.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ClienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("12345678A", "Juan Pérez", LocalDate.of(1985, 5, 20));
		Cliente cliente2 = new Cliente("87654321B", "María García", LocalDate.of(2002, 11, 12));
		Cliente cliente3 = new Cliente("45678912C", "Carlos Ruiz", LocalDate.of(1978, 12, 31));
		Cliente cliente4 = new Cliente("23456789D", "Lucía Fernández", LocalDate.of(1996, 2, 29));
		Cliente cliente5 = new Cliente("56781234E", "Antonio López", LocalDate.of(1955, 3, 15));
		Cliente cliente6 = new Cliente("34127856F", "Elena Belmonte", LocalDate.of(2005, 7, 22));
		Cliente cliente7 = new Cliente("99887766G", "José Ignacio Martínez", LocalDate.of(1990, 1, 10));
		Cliente cliente8 = new Cliente("11223344H", "Rosa María Soler", LocalDate.of(1968, 9, 5));
		Cliente cliente9 = new Cliente("55443322J", "Sofía Vega", LocalDate.of(2008, 12, 12));
		Cliente cliente10 = new Cliente("77665544I", "Mark Anderson", LocalDate.of(1982, 6, 18));
		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		listaClientes.add(cliente4);
		listaClientes.add(cliente5);
		listaClientes.add(cliente6);
		listaClientes.add(cliente7);
		listaClientes.add(cliente8);
		listaClientes.add(cliente9);
		listaClientes.add(cliente10);

		System.out.println("Lista de clientes: " + listaClientes);
		/*
		 * iTERATOR ES UN INTERFAZ DE JAVA QUE PERMITE RECORRER COLECCIPNES COMO LITAS
		 * DE ELEMENTO A ELEMENTO
		 */
		Iterator<Cliente> iterator = listaClientes.iterator();
		// Forma 1 de buscar
		// Vamos a buscar el cliente con DNI 12345678A para borrarlo
		boolean bEncontrado = false;
		while (!bEncontrado && iterator.hasNext()) {
			Cliente cliTMP = iterator.next();
			if (cliTMP.getDNI().equals("12345678A")) {
				bEncontrado = true;
				iterator.remove();
				}
			System.out.println("Lista Clientes Tras 1 Borrado: "+listaClientes);
			
		}
		// Forma 2
		Collections.sort(listaClientes);
		int indice = Collections.binarySearch(listaClientes,new Cliente("45678912C"));
		System.out.println("indice= "+indice);
		listaClientes.remove(indice);
		System.out.println("Lista Clientes Tras 2 Borrado: "+listaClientes);
		
		// Forma 3
		listaClientes.removeIf(Cliente -> Cliente.getDNI().equals("23456789D"));
		System.out.println("Lista de clientes tras 3 borrado: "+listaClientes);
		
		Collections.sort(listaClientes);
		System.out.println("Lista Clientes Tras Ordenar: "+listaClientes);
		
	}

}
