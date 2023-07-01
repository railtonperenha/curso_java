package desafios;

import java.util.Scanner;

public class desafio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, opcao;
		System.out.println("1. Álcoo\n2. Gásolina\n3. Diesel\n4. Fim!\n");
		
		System.out.print("Opção: ");
		opcao = sc.nextInt();	
		
		while (opcao != 4) {
			if (opcao == 1) {
				System.out.println("Álcool");
				alcool = alcool + 1;				
			}
			else if (opcao == 2) {
				System.out.println("Gasolina");
				gasolina = gasolina + 1;
			}
			else if (diesel == 3) {
				System.out.println("Diesel");
				diesel = diesel + 1;
			}
			System.out.print("Opção: ");
			opcao = sc.nextInt();	
		}
		System.out.println("\nMuito Obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();

	}

}
