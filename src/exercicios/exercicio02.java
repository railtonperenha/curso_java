package exercicios;

public class exercicio02 {

	public static void main(String[] args) {
		
		int x = 0;
		
		System.out.println("Números ímpares de 1 a 100: ");
		while (x < 100) {
			x = x + 1;
			if (x % 2 == 1) {
				System.out.println(x);
			}
		}

	}

}
