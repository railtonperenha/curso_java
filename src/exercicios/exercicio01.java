// Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:

package exercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.printf("Quantos Patinhos Foram Passear ?: ");
		n = sc.nextInt();
		while (n != 0) {
			if (n > 0) {
				System.out.println(n + " patinhos foram passear");
				System.out.println("Além das montanhas para brincar");
				System.out.println("A mamãe gritou: Quá, quá, quá, quá.");
				System.out.printf("Mas só %d patinhos voltaram de lá.", n - 1);

				System.out.println();	
				
				System.out.printf("Quantos Patinhos Foram Passear ?: ");
				n = sc.nextInt();
				
				System.out.println();
			}
		}
		System.out.println("A mamãe patinha foi procurar");
		System.out.println("Além das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mamãe gritou: Quá, quá, quá, quá");
		System.out.println("E os " + n + " patinhos voltaram de lá.");
		

	}

}
