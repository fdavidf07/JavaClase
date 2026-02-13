package pio.daw.dfg.tema6.map;

import java.util.Map;
import java.util.TreeMap;

import pio.daw.dfg.tema6.list.listJon.Usuario;

public class EjemploTreeMapUsuario {

	public static void main(String[] args) {
		// Creamos un TreeMap con DNI como campo clave y el propio obj usuario como valor
		// 2. Declaración del TreeMap (Ordenado por la clave String: DNI)
        TreeMap<String, Usuario> usuariosPorDNI = new TreeMap<>();

        // 3. Creación de los 5 objetos u1, u2, u3, u4, u5
        Usuario u1 = new Usuario("52345678A", "Ana García", "ana@email.com");
        Usuario u2 = new Usuario("47654321B", "Carlos Ruiz", "carlos@email.com");
        Usuario u3 = new Usuario("31223344C", "Beatriz López", "beatriz@email.com");
        Usuario u4 = new Usuario("25667788D", "David Vera", "david@email.com");
        Usuario u5 = new Usuario("19001122E", "Elena Sanz", "elena@email.com");

        // 4. Añadirlos al TreeMap usando el DNI como clave
        usuariosPorDNI.put(u1.getDNI(), u1);
        usuariosPorDNI.put(u2.getDNI(), u2);
        usuariosPorDNI.put(u3.getDNI(), u3);
        usuariosPorDNI.put(u4.getDNI(), u4);
        usuariosPorDNI.put(u5.getDNI(), u5);
       System.out.println("Usuarios; "+usuariosPorDNI);
		
       // recorrer 
       for ( Map.Entry<String, Usuario> entrada : usuariosPorDNI.entrySet()) {
    	   String DNI = entrada.getKey();
    	   Usuario usu = entrada.getValue();
    	   System.out.println("DNI "+DNI+"  Usuario: "+usu);
    	   
    	// buscar el usuario con dni 31223344C
    	   Usuario usuBuscado = usuariosPorDNI.get("31223344C");
    	   System.out.println("Usuario Buscado: "+usuBuscado);
       }
       		
	}

}
