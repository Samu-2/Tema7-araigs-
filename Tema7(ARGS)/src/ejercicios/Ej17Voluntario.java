package ejercicios;

import java.util.Scanner;

public class Ej17Voluntario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[3];

		String palabra = "";
		String primeraLetra = "";
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");

			array[i] = sc.nextLine();
		}
		arrayOrdenAlfabetico(array);

		// pedirPalabras(array, sc);

	}

	public static void leerPalabras(String[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == 0)
				System.out.print(array[i]);
			else
				System.out.print("," + array[i]);
		}
	}

	public static String[] arrayOrdenAlfabetico(String[] array) {
		
		String[] array2  = new String[array.length];

		String palabra="";
		
		for (int i = 0; i < array.length; i++) {
		array2[array.length].compareToIgnoreCase(array[i]);
	}
	return array2;
	}

	public static void pedirPalabras(String[] array, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");

			array[i] = sc.nextLine();

		}

	}
}
