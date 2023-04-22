package aulas.entrada_dados;

import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.1f%n", x);
		
		sc.close();
		
		

	}

}
