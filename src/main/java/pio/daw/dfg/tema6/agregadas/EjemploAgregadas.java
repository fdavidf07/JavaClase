package pio.daw.dfg.tema6.agregadas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploAgregadas {
	
	/*las operaciones agregadas son un conjunto de funciones qu epermiten procesar colecciones de datos(4 operaciones)
	 * filtrar: selecionar elementos que cumplen una condicion 
	 * mapear: aplicar una funcion a los elementos: sumar 1 a todos
	 * reduccion: aplicar una funcion a un conjunto de datos --> un group by en BBDD
	 * ordenar: ordena la coleccion.
	 * */
	public static void main(String[] args) {
		List<Integer> numeros= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("numeros: "+ numeros);
		// 1-Calcula la suma de todos los numeros pares de esa lista
		int sumaPares = numeros.stream()
						.filter( n -> n%2 == 0) //expresion landa por cada numero n en el stream comprueba si al dividir por dos es 0
						.reduce(0, Integer::sum);// al resultado anterior aplica la funcion suma desde 0 para tdos los numeros
		System.out.println("Valor de la suma; "+sumaPares);
		//**************************************
		// media numeros impares
		double mediaImpares= numeros.stream()
							.filter(n -> n%2 != 0)//los impares
							.mapToInt(Integer::intValue)// es necesario convertir el flujo a int primitivos
							.average() // calcula la media
							.orElse(0); // si no hay impares devuelve 0
		System.out.println("Valor de la media; "+mediaImpares);
		//**************************************
		// numero maximo de la lista
		int maximo= numeros.stream()	
					.reduce(Integer.MIN_VALUE,Integer::max);
		System.out.println("Valor maximo; "+maximo);
		// minimo
		int minimo= numeros.stream()
				.reduce(Integer.MAX_VALUE,Integer::min);
		// cuantos numero son mayores de 5
		long contador = numeros.stream()
						.filter(n -> n > 5)
						.count();
		System.out.println("Contador: "+contador);
		
		List<String> nombres= Arrays.asList("Ana","Juan","Maria","Pedro","Alicia","Luis","Roberto");
		// genera una lista ordenada alfabeticamente en mayusculas pero solo de los nombres que empiezan por A
		// cosas a usar: filter, map , sorted,collect
		List<String>auxiliar= nombres.stream()
						.filter(nombre -> nombre.startsWith("A"))// nos quedamos con los que empiezan por A
						.map(String::toUpperCase)// aplicames mapeo a todos los elementos filtrados
						.sorted()
						.collect(Collectors.toList());
		System.out.println("auxiliar: "+auxiliar);
		
	}

	
}
