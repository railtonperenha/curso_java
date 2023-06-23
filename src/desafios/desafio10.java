package desafios;

import java.util.Scanner;

public class desafio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("PRIMEIRO NÚMERO: ");
		double x = sc.nextDouble();
		
		System.out.printf("SEGUNDO NÚMERO: ");
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("ORIGEM");
		}
		else if (x == 0.0) {
			System.out.println("EIXO Y");			
		}
		else if (y == 0.0) {
			System.out.println("EIXO X");
		}
		
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
