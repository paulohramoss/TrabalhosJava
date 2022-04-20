package primeiroProjeto;

import java.util.Scanner;

public class Lfrase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String toriginal = teclado.nextLine();
		
		int toriginalLength = toriginal.length();
		System.out.println("Tamanho da string original: " + toriginalLength);
		
		String nstring = toriginal.trim();
		
		int nstringLength = nstring.length();
		System.out.println("Tamanho nova string sem espaço no início e no final: " + nstringLength);
		
		int qvog = 0;
		char tseparado[] = toriginal.toCharArray();
		
		for(int cont = 0; cont < toriginal.length(); cont++) {
			
		}
		
		
	}

}
