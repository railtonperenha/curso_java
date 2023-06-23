package aulas.expressoes_comparativas;

public class exemplo2 {

	public static void main(String[] args) {
		int x;
		x = 5;
		//False
		System.out.println(x <= 20 && x == 10);
		
		System.out.println();
		
		//True
		System.out.println(x > 0 && x != 3);
		
		System.out.println();
		
		//False
		System.out.println(x <= 20 && x == 10 && x != 3);
		

	}

}
