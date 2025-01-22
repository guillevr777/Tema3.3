package ejercicioslistas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//importamos el random
		Random random = new Random();
		
		//creamos el arraylist
		ArrayList<Integer> numeros = new ArrayList<>();	
		
		//variable para almacenar numero
		int numero = random.nextInt(5, 11);
		
		int suma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 0;
		
		//variable de tipo entero numeroAleatorio
		int numeroAleatorio;
		
		for (int i = 0 ; i < numero ; i++) {
			
			numeroAleatorio = random.nextInt(0, 101);
			numeros.add(numeroAleatorio);
			suma += numeroAleatorio;
			media += numeroAleatorio/numero;
			if (maximo < numeroAleatorio) {
				maximo = numeroAleatorio;
			}
			if (minimo > numeroAleatorio) {
			numeroAleatorio = minimo;
			}
		}
		//damos los resultado
		System.out.println(suma + " " + media + " " + maximo + " " + minimo);
		
		//cerramos el escaner
		reader.close();
		}
	}
