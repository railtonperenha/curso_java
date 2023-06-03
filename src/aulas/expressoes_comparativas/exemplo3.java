package aulas.expressoes_comparativas;

public class exemplo3 {

	public static void main(String[] args) {
		int x;
		x = 5;
		
		//True
		System.out.println(x == 10 || x <= 20);
		
		System.out.println();
		
		//True
		System.out.println(x > 0 || x != 3);
		
		System.out.println();
		
		//True
		System.out.println(x <= 0 || x != 3 || x != 5);

	}

}
