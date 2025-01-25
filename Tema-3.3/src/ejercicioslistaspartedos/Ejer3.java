package ejercicioslistaspartedos;

import java.util.HashMap;
import java.util.Random;

public class Ejer3 {

	public static void main(String[] args) {
		
		//Llamamos al random para generar numeros aleatorios
		Random random = new Random();

		//creamos un arraylist ya que concuerda mejor con la connotacion del programa
		HashMap<Character, Integer> letras = new HashMap<>();
		
		//creamos una variable de tipo char para preguntar por su valor posteriormente
		int valorLetra;
		
		//variable String para contener la cadena
		String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad.";
		
		//lo pasamos a minusculas para que no haya problemas a la hora de contar las letras
		frase.toLowerCase();
		
		//creamos un for para recorrer al completo la longitud del String
		for (int i = 0 ; i < frase.length() ; i++) {
			if (Character.isLetter(frase.charAt(i))) {
				if (letras.containsKey(frase.charAt(i))) {
					valorLetra = letras.get(frase.charAt(i));
					letras.put(frase.charAt(i), valorLetra+1);
				} else {
					letras.put(frase.charAt(i), 1);
				}
			}
		}
		//mostramos los numeros ordenados generados aleatoriamente entre 1 y 20
		System.out.println("Estos son los numeros ordenados : " + letras);
	}
}
