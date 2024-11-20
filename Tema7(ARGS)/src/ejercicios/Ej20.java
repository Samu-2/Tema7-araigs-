package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {

		String fin = "fin";
		String palabra = "";
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una palabra");
			palabra = sc.nextLine();
			mostrarVocales(palabra);

		} while (palabra.equalsIgnoreCase(fin));

	}

	public static void mostrarVocales(String palabra) {
		
		int contadorA=0, contadorE=0, contadorI=0,contadorO=0,contadorU=0;
		
		palabra = palabra.toLowerCase();
		for (int i = 0; i < palabra.length(); i++) {
			switch (palabra.charAt(i)) {
			case 'a':
			contadorA++;
				

				break;
			case 'e':
				contadorE++;

				break;
			case 'i':
				contadorI++;

				break;
			case 'o':
				contadorO++;

				break;
			case 'u':
				contadorU++;

				break;
			default:
				break;
			}
		}

		System.out.println("La palabra es "+ palabra "y la vocal a se repite " +contadorA+"veces");
	}
}
