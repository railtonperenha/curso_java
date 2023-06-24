// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package desafios;

import java.util.Scanner;

public class desafio03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("A = ");
		int a = sc.nextInt();
		
		System.out.printf("B = ");
		int b = sc.nextInt();
		
		System.out.printf("C = ");
		int c = sc.nextInt();
		
		System.out.printf("D = ");
		int d = sc.nextInt();
		
		int dif = a * b - c * d;
		System.out.printf("DIFERENÇA = %d", dif);
		
		
		sc.close();

	}

}
