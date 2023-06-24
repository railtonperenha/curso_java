//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package desafios;

import java.util.Scanner;

public class desafio05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, quantidade;
		double valor1, valor2;
		
		System.out.printf("CÓDIGO PEÇA: ");
		peca1 = sc.nextInt();
		
		System.out.printf("QUANTIDADE:  ");
		quantidade = sc.nextInt();
		
		System.out.printf("VALOR: R$ ");
		valor1 = sc.nextDouble() * quantidade;
		
		System.out.println();
		
		System.out.printf("CÓDIGO: %d%nQUANTIDADE: %d%nVALOR TOTAL: R$ %.2f%n", peca1, quantidade, valor1);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.printf("CÓDIGO PEÇA: ");
		peca2 = sc.nextInt();
		
		System.out.printf("QUANTIDADE:  ");
		quantidade = sc.nextInt();
		
		System.out.printf("VALOR: R$ ");
		valor2 = sc.nextDouble() * quantidade;
		
		System.out.println();
		
		System.out.printf("CÓDIGO: %d%nQUANTIDADE: %d%nVALOR TOTAL: R$ %.2f%n", peca2, quantidade, valor2);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-");
		
		double total = valor1 + valor2;
		System.out.printf("TOTAL A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		

	}

}
