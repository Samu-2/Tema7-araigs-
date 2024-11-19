package ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ej13 {

	public static void main(String[] args) {
	LocalDate[]array=new LocalDate[10];
	rellenar(array);
muestraArray(array);
	}
public static void rellenar(LocalDate[]array) {
	LocalDate hoy=LocalDate.now();
	for (int i = 0; i < array.length; i++) {
		array[i]=hoy.plusDays(i+1);
	}
}
public static void muestraArray(LocalDate[]array) {
	DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//cambiar al formato del enunciado

	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i].format(formato1));
	}
	System.out.println();
}
}
