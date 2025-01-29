package ejercicioslistaspartedos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		//Importamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//Importamos el hashmap 
		HashMap<String, HashSet<String>> categorias = new HashMap<>();
		
		//creamos variable booleana para bucles del while
				boolean jugar = false;
				
				//creamos una variable para manejar un menu
				int opcion;
				
				//creamos variable para introducir palabra temporalm,ente
				String tarea = "";
				
				//se guardara en esta variable una categoria
				String categoria = "";
				
				//creamops un nuevo conjuntos
				HashSet tareas = new HashSet();
				
				//variable para la longitud de la palabra 
				int longitud;
				
				//preguntamos por palabras de distinta longitud
				while (!jugar) {
					
					//preguntamos por la opcion que quiere escoger del menu
					System.out.println("Dime que quieres hacer.\n1. Meter tarea.\n2. Ver tarea por categoria.\n3. salir.");
					opcion = reader.nextInt();
					
					//switch que elige la opcion que quiere el usuario
					switch (opcion) {
					//pide tarea y categoria 
					case 1 -> {
						System.out.println("Dime a que categoria quieres meter una tarea :");
						categoria = reader.next();
						System.out.println("Y que tarea te gustaria meter?");
						tarea = reader.next();
						if (categorias.containsKey(categoria)) {
							categorias.get(categoria).add(tarea);
						} else {
							//añadimos la tareas al HashSet tareas
							tareas.add(tarea);
							
							//añadimos a categorias la categoria y la tarea
							categorias.put(categoria, tareas);
						}
					}
					//pregunta por la tarea de una categoria
					case 2 -> {
						System.out.println("De que categoria quieres saber las tareas :");
						categoria = reader.next();
						System.out.println(categorias.get(categoria));
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
