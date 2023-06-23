package desafios;

import java.util.Scanner;

public class desafio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("COMEÇO DO JOGO: ");
		int horaInicial = sc.nextInt();
		
		System.out.printf("FINAL DO JOGO: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORAS", duracao);
		
		sc.close();
	}

}
