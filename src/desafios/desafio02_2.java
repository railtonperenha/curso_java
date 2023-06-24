// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

package desafios;

import java.util.Scanner;

public class desafio02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.printf("RAIO: ");
		double raio = sc.nextDouble();
		
		double area = pi * Math.pow(raio, 2);
		System.out.printf("ÁREA = %.4f%n", area);
		
		
		sc.close();

	}

}
