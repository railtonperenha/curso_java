// Fazer um programa que lê números inteiros até que um zero seja lido.
// Ao final mostra a soma dos números lidos.

package estrutura_repetitiva_while;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.printf("NÚMERO: ");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			System.out.printf("NÚMERO: ");
			x = sc.nextInt();
		}
		
		System.out.printf("SOMA: %d", soma);		
		
		sc.close();
	}

}
