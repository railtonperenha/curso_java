package desafios;

import java.util.Scanner;

public class desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d é PAR!", num);
		} else {
			System.out.printf("O número %d é ÍMPAR!", num);
		}

	}

}
