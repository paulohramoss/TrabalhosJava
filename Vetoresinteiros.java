package primeiroProjeto;

import java.util.Scanner;

public class Vetoresinteiros {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe 10 números inteiros para o Vetor A: ");
	int Va[] = new int[10];
	
	for(int i=0; i<10; i++) {
		Va[i] = teclado.nextInt();
	}
	System.out.println("Informe 10 números inteiros para o Vetor B: ");
	int Vb[] = new int[10];
	
	for(int i=0; i<10; i++) {
		Vb[i] = teclado.nextInt();
	}
	float Vc[] = new float[10];
	
	for(int i=0; i<10; i++) {
		Vc[i] = Va[i] / Vb[i];
	}
	
	System.out.println("Valor do Vetor C invertido: ");	
	for(int i=9; i>0; i--) {
	System.out.println(Vc[i]);
	}
	System.out.println("Valores pares do Vetor A: ");
	for(int i=0; i<10; i++) {
		if(Va[i] %2 == 0) {
			System.out.println(Va[i]);
		}
	}
}
}