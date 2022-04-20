package primeiroProjeto;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor pago por hora de trabalho: ");
		float salarioTrabalho = teclado.nextFloat();
		
		System.out.println("Quantas horas trabalhou em um projeto");
		int horasProjeto = teclado.nextInt();
		
		System.out.println(salarioTrabalho * horasProjeto);
		
	}
}
