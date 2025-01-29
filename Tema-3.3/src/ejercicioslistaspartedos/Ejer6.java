package ejercicioslistaspartedos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejer6 {

	public static void main(String[] args) {
		
		//Llamamos al Scanner
		Scanner reader = new Scanner(System.in);
		
		//Usamos una coleecion de tipo HashMap
		HashMap<String, Set<Integer>> numeros = new HashMap<>();
		
		//creamos un set 
		HashSet numero = new HashSet();

		//creamos una variable de tipi int para elegir la opcion del menu
		int opcion = 0;
		
		//variable para guardar nombre temporalmente
		String nombre = "";
		
		//donde se guardaran los conteactos ttemporalmente
		int telefono;
		
		//guardamos el booleano salir
		boolean salir = false;
		
		//creamos un while para recorer varias iteraciones
		while (!salir) {
			
			System.out.println("Que opcion quieres elegir ?\n1.Añadir persona\n2.Añadir telefono\n3.Preguntamos por telefono\n4.Eliminar telefono\n5.Eliminar persona\n6.Salir");
			opcion = reader.nextInt();
			
		//Creamos el switch para elegir la opcion
		switch (opcion) {
		//codigo encargado de añadir nombres a la lista
		case 1 -> {
			//preguntamos por nombres y los añadimos
			System.out.println("Dime que persona quieres añadir a la lista :");
			nombre = reader.next();
			numeros.put(nombre, null);
		}
		//coddigo encargado de preguntar el numero a introducir
		case 2 -> {
			//preguntamos por un nombre y un telefono en caso que proceda
			System.out.println("Dime a que persona quieres añadir un telefono :");
			nombre = reader.next();
			System.out.println("Dime el numero a añadir :");
			telefono = reader.nextInt();
			
			//si contiene dicho nombre le puede añadir el numeor
			if (numeros.containsKey(nombre)) {
				numeros.putIfAbsent(nombre, new TreeSet<>());
				numeros.get(nombre).add(telefono);
			} else {
				System.out.println("No se ha encontrado dicho nombre en la lista.");
			}
		}
		//Si contiene el telefono de una persona
		case 3 -> {
			//preguntamos por el nombre de persona a ver un telefono
			System.out.println("Dime la persona que buscas:");
			nombre = reader.next();
			
			//Si contiene la persona procede sino no
			if (numeros.containsKey(nombre)) {
				System.out.println("Estos son sus numeros : " + numeros.get(nombre));
			} else {
				System.out.println("No se encontro dicho nombre en la lista.");
			}
		}
		//opcion para eliminar telefono de una persona
		case 4 -> {
			//preguntamos por el telefono a eliminar
			System.out.println("Dime el telefono que deseas eliminar : ");
			nombre = reader.next();
			System.out.println("Que telefono quieres eliminar ?");
			telefono = reader.nextInt();
			
			//Si contiene dicho nombre procede sino no
			if (numeros.containsKey(nombre)) {
				numeros.get(nombre).remove(telefono);
			} else {
				System.out.println("No se encontro dicho usuario o no tiene registrado dicho telefono.");
			}
		}
		//opcion para eliminar persona
		case 5 -> {
			//preguntamos por la persona a eliminar
			System.out.println("Que persona quieres eliminar ?");
			nombre = reader.next();
			
			//si se encuentra en la lista procedemos sino no
			if (numeros.containsKey(nombre)) {
				numeros.remove(nombre);
			} else {
				System.out.println("No existe dicho nombre en la lista.");
			}
		}
		default -> {
			System.out.println("Has finalizado la sesion.");
			salir = true;
		}
		}
		}
		//cerramos el escaner
		reader.close();
	}
}
