package desafiotargetsistemas.invertestring;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String string;
		
		System.out.printf("Entrada: ");
		string = ler.nextLine();
		
		System.out.println();
		
		System.out.printf("Entrada: %s\n", string);
		System.out.printf("Saída: %s\n", inverterCaracteres(string));
		
	}
	public static String  inverterCaracteres(String string) {
		int i, n;
		String stringAux;
		
		n = string.length();
		stringAux = "";
		
		for(i = (n-1); i>= 0; i--) {
			stringAux = stringAux + string.charAt(i);
		}
		
		return (stringAux);
	}
}
