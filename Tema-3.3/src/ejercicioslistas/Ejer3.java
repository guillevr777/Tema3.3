package ejercicioslistas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//importamos el random
		Random random = new Random();
		
		//creamos el arraylist
		ArrayList<Integer> numeros = new ArrayList<>();	
		
		//variable para almacenar numero
		int numero = 30;
		
		//variable de tipo entero numeroAleatorio
		int numeroAleatorio;
		
		for (int i = 0 ; i < numero ; i++) {
			
			numeroAleatorio = random.nextInt(1, 11);
			numeros.add(numeroAleatorio);
			
		}
		//ordenamos la lista
		numeros.sort(null);
		
		//recorremos para pintarlo en pantalla
		for (int i = 0 ; i < numero ; i++) {
			System.out.print(numeros.get(i));
		}

		//cerramos el escaner
		reader.close();
		}
	}
