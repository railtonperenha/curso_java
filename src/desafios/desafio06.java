package desafios;

import java.util.Scanner;

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Primeiro Número: ");
		num1 = sc.nextInt();
		
		System.out.printf("Segundo Número: ");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.printf("SÃO MULTIPLOS!");
		} else {
			System.out.printf("NÃO SÃO MULTIPLOS!");
		}

	}

}
