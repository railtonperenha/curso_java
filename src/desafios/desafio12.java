package desafios;

import java.util.Scanner;

public class desafio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.print("X: ");
		x = sc.nextInt();
		
		System.out.print("Y: ");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Quadrante: Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Quadrante: Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Quadrante: Terceiro");
			}
			else {
				System.out.println("Quadrante: Quarto");
			}
			System.out.print("X: ");
			x = sc.nextInt();
			
			System.out.print("Y: ");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
