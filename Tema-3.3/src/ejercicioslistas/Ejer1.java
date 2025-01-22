package ejercicioslistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	
	//creamos el arraylist
	ArrayList<Integer> numeros = new ArrayList<>();	
	
	//variable para almacenar numero
	int numero = 0;
	
	//creamos un for para recorrer el arraylist
	while (numero >= 0) {
		System.out.println("Dime un numero entero :");
		numero = reader.nextInt();
		if (numero > 0) {
		numeros.add(numero);
			}
		}
	
	for (int i = 0 ; i < numeros.size() ; i++) {
		
		System.out.print("\t" + numeros.get(i));
		
	}
	
	//cerramos el escaner
	reader.close();
	}
}
