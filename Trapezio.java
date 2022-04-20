package primeiroProjeto;

import java.util.Scanner;

public class Trapezio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a altura");
		float alturaTrapezio = teclado.nextFloat();
		
		System.out.println("Informe a base menor");
		float baseMenor = teclado.nextFloat();
		
		System.out.println("Informe a base maior");
		float baseMaior = teclado.nextFloat();
		
		System.out.println((alturaTrapezio * (baseMenor + baseMaior)) / 2);
		
	}
	
}