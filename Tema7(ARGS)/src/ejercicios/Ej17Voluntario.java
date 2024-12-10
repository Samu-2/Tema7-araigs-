package ejercicios;

import java.util.Scanner;

public class Ej17Voluntario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[3];

		String menor = "";
		String primeraLetra = "";
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");

			array[i] = sc.nextLine();
		}


	System.out.println(OrdenAlfabetico(array, menor));	

	}

	public static void leerPalabras(String[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == 0)
				System.out.print(array[i]);
			else
				System.out.print("," + array[i]);
		}
	}

	public static String OrdenAlfabetico(String[] array,String men) {
		


	String	 menor=array[0];
		
		for (int i = 1; i < array.length-1; i++) {
			/*for(int j=2;i<array.length;i++) {
				
			}*/
		if(array[i].compareToIgnoreCase(men)>0 && menor.compareToIgnoreCase(array[i])>0) {
			menor=array[i];
		}
	}
return menor;
	}

	public static void pedirPalabras(String[] array, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");

			array[i] = sc.nextLine();

		}

	}
}
