package ejercicioslistaspartedos;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer5Duda {
	public static void main(String[] args) {

		//Llamamos a la clase Scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la colleccion de tipo HashMap
		HashMap<String, Integer> series = new HashMap<>();
		
		//creamos variable para contener valor que usaremos en el switch
		int opcion;
		
		//creamos una variable booleana para que cuando elija salir deje de iterarse el while
		boolean salir = false;
		
		//creamos una variable para guardar temporalmente el nombre de la pelicula
		String serie = "";
		
		//creamos un while para que hasta que no elija la opcion de salir no finalice el programa
		while (!salir) {
		
			//preguntamos al usuario por la opcion que quiere elegir
			System.out.println("Dime que quieres hacer :\n1. Agregar serie.\n2. Buscar serie.\n3. Eliminar serie.\n4. Salir.\n");
			opcion = reader.nextInt();
			 reader.nextLine();
			//creamos un menu para que el usuario elija la opcion que quiera ejecutar
			switch (opcion) {

			//Preguntar dudas sobre buffer 
			case 1 -> {
				serie = "";
				System.out.println("Que pelicula te gustaria añadir a la lista \"Los nombres con letra y las puntuaciones de valoracion con numeros\":\n");
				serie = reader.nextLine().replaceAll(" ", "");
				series.put(serie, reader.nextInt());
				reader.nextLine();
			}
			case 2 -> {
				System.out.println("Que pelicula quieres buscar en la lista?\n");
				serie = reader.nextLine();
				if (series.containsKey(serie)) {
					System.out.println("Dicha pelicula tiene una puntuacion de " + series.get(serie));
				} else {
					System.out.println("No se encuentra en la lista o esta mal escrito... Vuelva a intentarlo.");
				}
			}
			case 3 -> {
				System.out.println("Que pelicula te gustaria eliminar?\n");
				series.remove(reader.nextLine());
			}
			default -> {
				System.out.println("El programa a finalizado.");
				salir = true;
			}
			}
		}
		//cerramos el escaner
		reader.close();
	}
}
