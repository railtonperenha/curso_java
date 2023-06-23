// Condição Simples:
// if ( <condição> ){
// <comando 1>
// <comando 2>
//}

///Regra: Condição Verdadeira executa o bloco de comandos, Condoção Falsa pula o bloco de comandos.

package estrutura_condicional;

public class exemplo1 {

	public static void main(String[] args) {
		
		int x = 5;
				
		System.out.println("Bom dia!");
		
		if (x < 0) {
			System.out.println("Boa tarde!"); //Não imprimiu
		}
		System.out.println("Boa noite!");		
		

	}

}
