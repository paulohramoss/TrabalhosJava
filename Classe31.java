package primeiroProjeto;

import java.util.Scanner;

public class Classe31{
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		
		int idade = teclado.nextInt();
		
		if(idade <15) {
			System.out.println("Não vota");
		}
		else if(idade <18) {
			System.out.println("Opcional");
		}
		else if(idade >=18 && idade <=70) {
			System.out.println("Obrigatório");
		}
		else if(idade >70) {
			System.out.println("Opcional");	
		}
		
		teclado.close();
		
	}

}
