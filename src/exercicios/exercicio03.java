package exercicios;

public class exercicio03 {

	public static void main(String[] args) {
		
		int x = 0;
		
		System.out.println("Números pares de 1 a 100: ");
		while (x < 100) {
			x = x +1;
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}

	}

}
