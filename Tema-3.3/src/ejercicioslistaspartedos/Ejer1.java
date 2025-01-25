package ejercicioslistaspartedos;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class Ejer1 {

	public static void main(String[] args) {
		
		//Llamamos al random para generar numeros aleatorios
		Random random = new Random();

		//creamos un arraylist ya que concuerda mejor con la connotacion del programa
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//variable que contendra el numero generado aleatoriamente
		int numeroRandom;
		
		//creamos una variable contador para asegurar el recuento del bucle
		int contador = 0;
		
		//Rellenamos el arraylist con numeros del 1 al 10 colocados de forma aleatoria
		while (contador < 10) {
			
			do {
				numeroRandom = random.nextInt(1, 11);
			} while (numeros.contains(numeroRandom));
				numeros.add(numeroRandom);
			
			contador++;
		}
		System.out.println("Estos son los numeros desordenados : " + numeros);
		numeros.sort(null);
		System.out.println("Estos son los numeros ordenados : " + numeros);
	}
}
