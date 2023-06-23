package atribuição_cumulativa;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("MINUTOS: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("VALOR DA CONTA: R$ %.2f%n", conta);
		
		sc.close();

	}

}
