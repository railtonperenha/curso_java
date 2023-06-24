// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

package desafios;

import java.util.Scanner;

public class desafio04_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		double horas, valorHora, salario;
		
		
		System.out.printf("NÚMERO: ");
		num = sc.nextInt();
		
		System.out.printf("HORAS TRABALHADAS: ");
		horas = sc.nextDouble();
		
		System.out.printf("VALOR POR HORA: R$ ");
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println();
		
		System.out.printf("NÚMERO FUNCIONÁRIO: %d%nSALÁRIO: R$ %.2f%n", num, salario);
		

	}

}
