package ejercicios;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
char[]array=new char[26];
for (int i = 65; i <91; i++) {
	array[i-65]=(char) (i);

}
for (int i = 0; i < array.length; i++) {
	System.out.println(i+" "+array[i]);
	
}
String palabra="";
do {
	num=FuncionesValidar2.dimeEntero("Introduce un numero", sc);
	if(num==-1)
		break;
	else {
		if(num<26)
			palabra+= array[num];
	}

} while (true);

System.out.println(palabra);

	}

}
