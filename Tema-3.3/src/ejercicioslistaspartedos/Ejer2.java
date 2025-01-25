package ejercicioslistaspartedos;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer2 {

public static void main(String[] args) {
		
		//Llamamos al random para generar numeros aleatorios
		Random random = new Random();

		//creamos un arraylist ya que concuerda mejor con la connotacion del programa
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		//variable que contendra el numero generado aleatoriamente
		int numeroRandom;
		
		//creamos una variable contador para asegurar el recuento del bucle
		int contador = 0;
		
		//Rellenamos el arraylist con numeros del 1 al 10 colocados de forma aleatoria
		while (contador < 10) {
			
				numeroRandom = random.nextInt(1, 21);
				numeros.add(numeroRandom);
		
			contador++;
		}
		//mostramos los numeros ordenados generados aleatoriamente entre 1 y 20
		System.out.println("Estos son los numeros ordenados : " + numeros);
	}
}
