package desafios;

import java.util.Scanner;

public class desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.printf("Digite um número: ");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.printf("O número %d é NEGATIVO!", x);
		}
		else if (!(x < 0)) {
				System.out.printf("O número %d NÃO É NEGATIVO!", x);				
			}
		sc.close();
		}

	}
