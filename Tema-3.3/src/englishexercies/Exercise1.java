package englishexercies;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		//Llamamos al random para generar numeros aleatorios
		Random random = new Random();

		//creamos un arraylist ya que concuerda mejor con la connotacion del programa
		HashMap<String, Integer> words = new HashMap<>();
		
		//creamos una variable de tipo char para preguntar por su valor posteriormente
		int valorLetra;
		
		//variable String para contener la cadena
		String sentence = "";
		
		// While the user don't introduce "END" the code still asking for sentences
		while(!sentence.equals("END")) {
			sentence = scanner.nextLine();
		}
		
		//lo pasamos a minusculas para que no haya problemas a la hora de contar las letras
		sentence.toLowerCase();
		
		//creamos un for para recorrer al completo la longitud del String
		for (int i = 0 ; i < sentence.length() ; i++) {
			if (Character.isLetter(sentence.charAt(i))) {
				if (words.containsKey(sentence.charAt(i))) {
					valorLetra = words.get(sentence.charAt(i));
					words.put(sentence.split(" "), valorLetra+1);
				} else {
					words.put(sentence.charAt(i), 1);
				}
			}
		}
		//mostramos los numeros ordenados generados aleatoriamente entre 1 y 20
		System.out.println("Estos son los numeros ordenados : " + words);
	}
}