package primeiroProjeto;

import java.util.Scanner;

public class DataCronologica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um dia");
		int dia1 = teclado.nextInt();
		
		System.out.println("Informe um mes");
		int mes1 = teclado.nextInt();
		
		System.out.println("Informe um ano");
		int ano1 = teclado.nextInt();
		
		System.out.println("Informe um dia");
		int dia2 = teclado.nextInt();
		
		System.out.println("Informe um mes");
		int mes2 = teclado.nextInt();
		
		System.out.println("Informe um ano");
		int ano2 = teclado.nextInt();
		
		if(ano1 > ano2){
			System.out.println("A data 1 é posterior");
		}
		else if(ano2 > ano1) {
			System.out.println("A data 2 é posterior");
		}
		else if(mes1 > mes2) {
			System.out.println("A data 1 é posterior");
		}
		else if(mes2 > mes1) {
			System.out.println("A data 2 é posterior");
		}
		else if(dia1 > dia2) {
			System.out.println("A data 1 é posterior");
		}
		else if(dia2 > dia1) {
			System.out.println("A data 2 é posterior");
		}
		
	}
}