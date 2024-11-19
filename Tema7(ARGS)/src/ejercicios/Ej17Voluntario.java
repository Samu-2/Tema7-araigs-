package ejercicios;

import java.util.Scanner;

public class Ej17Voluntario {

	public static void main(String[] args) {
		String[] array = new String[3];
	
		String palabra="";
		String primeraLetra="";
		for (int i = 0; i < array.length; i++) {
			primeraLetra=array[i].substring(0);
		
				
			}
		System.out.println(primeraLetra);
		
		}
	public static void leerPalabras(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			
			if (i == 0)
					System.out.print(array[i]);
				else
					System.out.print("," + array[i]);
	}
	}
/*	public static String[] arrayOrdenAlfabetico(String[] array) {
		String palabra="";
		String primeraLetra="";
		for (int i = 0; i < array.length; i++) {
			primeraLetra=array[i].substring(0);
		
				
			}
		}*/
	public static void pedirPalabras(String[] array, Scanner sc) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");
			
			array[i] = sc.nextLine();
			
			
				
		

	}
	}

	


