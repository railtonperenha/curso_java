// Condição Composta:
// if (condição){
// comando1
// comando2
// }
// else {
// comando3
// comando4
//}
// Regra: Verdadeira executa apenas o bloco "IF" e Falso executa apenas o bloco "ELSE".

package estrutura_condicional;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas ? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		
		else {
			System.out.println("Boa tarde!");
		}
		
		sc.close();
		

	}

}
