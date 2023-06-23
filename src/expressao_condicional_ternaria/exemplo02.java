package expressao_condicional_ternaria;

public class exemplo02 {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);

	}

}
