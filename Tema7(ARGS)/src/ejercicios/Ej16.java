package ejercicios;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArray = FuncionesValidar2.dimeEntero("Introduc el tamaño del array", sc);
		String[] arrayString = new String[sizeArray];

			pedirPalabras(arrayString, sc);
		}
	

	public static void pedirPalabras(String[] array, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");
			
			array[i] = sc.nextLine();
			
			
				
		

	}
	}
		public static void completarPalabras(String[] array){
		
	for (int i = 0; i < array.length; i++) {
		
	
			if (i == 0)
					System.out.print(array[i]);
				else
					System.out.print("," + array[i]);
	}
		
		
		
		}
		
	
	}

