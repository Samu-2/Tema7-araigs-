package ejercicios;

import java.util.Scanner;

public class FuncionesValidar2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=dimeEntero("7",sc);
	int n2=dimeEntero("dime edad",sc);
	
	}

	public static boolean esInt(String texto) {
		try {
			int num = Integer.parseInt(texto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble(String texto) {
		try {
			double num = Double.parseDouble(texto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
			
				System.out.println(texto);
				String orden = sc.nextLine();
				int num = Integer.parseInt(orden);
				return num;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce un número,no letras");
			}

		} while (true);
	}
	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
			
				System.out.println(texto);
				String orden = sc.nextLine();
				double num = Double.parseDouble(orden);
				return num;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce un número,no letras");
			}

		} while (true);
	}
	
}
