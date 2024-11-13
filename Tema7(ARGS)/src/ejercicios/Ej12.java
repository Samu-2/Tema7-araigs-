package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int sizeArray = FuncionesValidar2.dimeEntero("Introduc el tamaño del array", sc);
		int[] array = eligeSizeArray(sizeArray);
		for (int i = 0; i < array.length; i++) {
			if(i==0)
			System.out.print(array[i]);
			else
			System.out.print(","+array[i] );
		}

	}

	public static int[] eligeSizeArray(int size) {
		Random r = new Random();

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(0, 10);
		}
		return array;
	}
	public static void imprimirConConmasArray(int[] array) {
}
