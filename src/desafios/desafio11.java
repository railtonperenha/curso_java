package desafios;

import java.util.Scanner;

public class desafio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Renda / Imposto");
		System.out.println("R$ 0,00 - R$ 2.000,00 / ISENTO");
		System.out.println("R$ 2000,01 - R$ 3.000,00 / 8%");
		System.out.println("R$ 3000,01 - R$ 4.500,00 / 18%");
		System.out.println("R$ 4500,01 ~ / 28%");
		
		System.out.println();
		
		System.out.printf("SALÁRIO: R$ ");
		double salario = sc.nextDouble();
		
		double imposto;		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08 ;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0) {
			System.out.printf("IMPOSTO: ISENTO");			
		}
		else {
			System.out.printf("IMPOSTO: R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
