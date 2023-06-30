package exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        System.out.println("Números pares:");
        for (int i = 2; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nNúmeros ímpares:");
        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
