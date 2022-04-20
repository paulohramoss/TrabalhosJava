package primeiroProjeto;

import java.util.Scanner;

public class VetorString {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Escreva um texto: ");
	String vetorP[]=new String [7];
	
	for(int i=0; i<7; i++) {
		vetorP[i]=teclado.nextLine();
	}
	for(int i=6; i >= 0; i--) {
		System.out.println(vetorP[i]);
	}

	}

}
