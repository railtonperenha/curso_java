package desafios;

import java.util.Scanner;

public class desafio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("DIGITE UM NÚMERO: ");
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("FORA DE INTERVALO!");
		}
		else if (numero < 25.0) {
			System.out.println("INTERVALO [ 0, 25 ]");
		}
		else if (numero < 50.0) {
			System.out.println("INTERVALO [ 25, 50 ]");
		}
		else if (numero < 75.0) {
			System.out.println("INTERVALOR [ 50, 75 ]");
		}
		else  {
			System.out.println("INTERVALO [ 75, 100 ]");
		}
		
		
		sc.close();

	}

}
