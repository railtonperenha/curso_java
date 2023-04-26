package desafios;

public class desafio03 {

	public static void main(String[] args) {
		double pi, raio, area, A;
		pi = 3.14159;
		raio = 2.00;
		area = Math.pow(raio, 2.00);
		A = pi * area;
		System.out.printf("A área do circulo é %.4f%n ", A);
		
		System.out.println();
		
		pi = 3.14159;
		raio = 100.64;
		area = Math.pow(raio, 2);
		A = pi * area;
		System.out.printf("A área do circulo é %.4f%n ", A);
		
		System.out.println();
		
		pi = 3.14159;
		raio = 150.00;
		area = Math.pow(raio, 2);
		A = pi * area;
		System.out.printf("A área do circulo é %.4f ", A);

	}

}
