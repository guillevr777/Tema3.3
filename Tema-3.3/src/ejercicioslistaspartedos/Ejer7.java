package ejercicioslistaspartedos;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejer7 {

	public static void main(String[] args) {

		//importamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//importamos el TreeMap y el set para guardar las palabra por ordenn ascendente 
		TreeMap<Integer, TreeSet<String>> palabras = new TreeMap<>();
		
		//creamos variable booleana para bucles del while
		boolean jugar = false;
		
		//creamos una variable para manejar un menu
		int opcion;
		
		//creamos variable para introducir palabra temporalm,ente
		String palabra = "";
		
		//variable para la longitud de la palabra 
		int longitud;
		
		//preguntamos por palabras de distinta longitud
		while (!jugar) {
			
			//preguntamos por la opcion que quiere escoger del menu
			System.out.println("Dime que quieres hacer.\n1. Meter palabra\n2. Ver palabras\n3. salir.");
			opcion = reader.nextInt();
			
			//switch que elige la opcion que quiere el usuario
			switch (opcion) {
			//case 1 mete palabras
			case 1 -> {
				longitud = palabra.length();
				System.out.println("Dime una palabra que quieras introducir :");
				palabra = reader.next();
				if (palabras.containsKey(longitud)) {
					palabras.get(longitud).add(palabra);
				} else {
					palabras.putIfAbsent(longitud, new TreeSet<>());
				}
			}
			//case 2 enseña la lista al completo
			case 2 -> {
				System.out.println("Esta es la lista al completo :" + palabras);
			}
			//Sale del programa dejando de iterar el bucle
			default -> {
				System.out.println("Se ha finalizado la sesion.");
				jugar = true;
			}
			}
		}
		//cerramos el escaner
		reader.close();
	}
}
