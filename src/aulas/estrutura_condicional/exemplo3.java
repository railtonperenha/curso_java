// Encadeamento de estruturas condicionais:
// if (condição1){
// comando1
// comando2
//}
// else{
// 	if (condição2){
	// comando3
	// comando4
	//}
	// else{
	// comando5
	// comando6
	//}
//}

package estrutura_condicional;

import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas ? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		
		else {
			if (hora < 18) {
				System.out.println("Boa tarde!");				
			}
			else {
				System.out.println("Boa noite!");				
			}
		}
		
		sc.close();
		

	}

}
