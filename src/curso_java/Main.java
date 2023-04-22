package curso_java;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Railton";
		int idade = 32;
		double renda = 4500.00;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);		
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha %.2f reais por mês%n", nome, idade, renda);

	}

}
