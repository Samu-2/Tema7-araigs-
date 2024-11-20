package ejercicios;
import java.util.Scanner;
public class Ej19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Introduce una frase");
	String frase=sc.nextLine();
	String[] v =fraseFila(frase);
for (int i = 0; i <v.length; i++) {
	String palabra="";

	palabra=v[i].substring(0, 3).toUpperCase();
	palabra+=v[i].substring( 3).toLowerCase();
	System.out.println(palabra);
}

	}
public static String [] fraseFila(String frase) {
	String[] v = frase.split(" ");

	
	return v;
}
}
