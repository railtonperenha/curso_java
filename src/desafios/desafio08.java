package desafios;

import java.util.Scanner;

public class desafio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. CACHORRO QUENTE - R$ 4,00");
		System.out.println("2. X-SALADA - R$ 4,50");
		System.out.println("3. X-BACON - R$ 5,00");
		System.out.println("4. TORRADA SIMPLES - R$ 2,00");
		System.out.println("5. REFRIGERANTE - R$ 1,50");
		
		System.out.printf("PRODUTO: ");
		int produto = sc.nextInt();
		int quantidade;
		double total = 0;
		
		if (produto == 1) {
			System.out.printf("QUANTIDADE: ");
			quantidade = sc.nextInt();
			total = quantidade * 4.00;
		}
		
		else if (produto == 2) {
			System.out.printf("QUANTIDADE: ");
			quantidade = sc.nextInt();
			total = quantidade * 4.50;
		}
		
		else if (produto == 3) {
			System.out.printf("QUANTIDADE: ");
			quantidade = sc.nextInt();
			total = quantidade * 5.00;
		}
		
		else if (produto == 4) {
			System.out.printf("QUANTIDADE: ");
			quantidade = sc.nextInt();
			total = quantidade * 2.00;
		}
		
		else if (produto == 5) {
			System.out.printf("QUANTIDADE: ");
			quantidade = sc.nextInt();
			total = quantidade * 1.50;
		}
		
		else {
			System.out.println("PRODUTO INVÁLIDO!");			
		}
		
		System.out.printf("TOTAL: R$ %.2f%n", total);		
		
		sc.close();
	}

}
