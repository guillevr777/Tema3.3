package ejercicioslistaspartedos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		//Llamamos a la clase Scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la colleccion de tipo ArrayList
		ArrayList<String> nombres = new ArrayList<>();
		
		//creamos variable para contener valor que usaremos en el switch
		int opcion;
		
		//creamos una variable booleana para que cuando elija salir deje de iterarse el while
		boolean salir = false;
		
		//creamos un while para que hasta que no elija la opcion de salir no finalice el programa
		while (!salir) {
		
			//preguntamos al usuario por la opcion que quiere elegir
			System.out.println("Dime que quieres hacer :\n1. Añadir nuevo nombre a la lista.\n2. Elimina un nombre específico.\n3. Ordena la lista alfabéticamente.\n4. Busca si un nombre específico está en la lista.\n5. Salir.");
			opcion = reader.nextInt();
		
			//creamos un menu para que el usuario elija la opcion que quiera ejecutar
			switch (opcion) {
				
			case 1 -> {
				System.out.println("Que nombre te gustaria añadir a la lista :");
				nombres.add(reader.next());
			}
			case 2 -> {
				System.out.println("Que nombre te gustaria eliminar?");
				nombres.remove(reader.next());
			}
			case 3 -> {
				System.out.println("Lista antes de ser ordenada : " + nombres);
				Collections.sort(nombres);
				System.out.println("Lista despues de ser ordenada : " + nombres);

			}
			case 4 -> {
				System.out.println("Que nombre quieres buscar en la lista?");
				if (nombres.contains(reader.next())) {
					System.out.println("Dicho nombre se encuentra en la lista.");
				} else {
					System.out.println("No se encuentra en la lista o esta mal escrito... Vuelva a intentarlo.");
				}
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
