package ejercicios;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = FuncionesValidar2.dimeEntero("Introduce un numero", sc);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+" "+array[i]);
		}
	}

}
