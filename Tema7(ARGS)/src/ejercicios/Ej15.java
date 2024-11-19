package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		array50(array, sc);

		for (int i = 0; i < array.length; i++) {
			if (i == 0)
				System.out.print(array[i]);
			else
				System.out.print("," + (array)[i]);

		}
		System.out.println();
		mayorMenorMedia(array, sc);

	}

	public static void array50(int[] array, Scanner sc) {
		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10, 15);
		}

	}

	public static void mayorMenorMedia(int[] array, Scanner sc) {
		int mayor = 0;
		int menor = 15;
		int contadorMayor = 0;
		int contadorMenor = 0;
		int suma = 0;
		int media = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor)
				mayor = array[i];
				contadorMayor=0;
			if (array[i] < menor)
				menor=array[i];//hace que si se cv
				contadorMenor=0;
			
			if (mayor == array[i])
				contadorMayor++;

			if (menor == array[i])
				contadorMenor++;
			
			
			suma += array[i];

		}
		media = suma / 50;
		System.out.println("El mayor es " + mayor + " y se repite " + contadorMayor + " veces");
		System.out.println("El menor es " + menor + " y se repite " + contadorMenor + " veces");
		System.out.println("La media  aritmetica es " + media);
	}

}
