package ejercicioslistas;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejer4 {

	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//importamos el random
		Random random = new Random();
		
		//creamos el arraylist
		TreeSet<Integer> numeros = new TreeSet<>();	
		
		//variable para almacenar numero
		int numero = 20;
		
		//variable de tipo entero numeroAleatorio
		int numeroAleatorio;
		
		while (numeros.size() < numero) {
			
			numeroAleatorio = random.nextInt(0, 100);
			numeros.add(numeroAleatorio);
			
		}
		//mostramos el resultado
		System.out.println(numeros);

		//cerramos el escaner
		reader.close();
		}
	}