package Uri1099;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Digite a quantidade de testes: ");
		int n = in.nextInt(); // Entrada de numeros de casos
		for (int i = 0; i < n; i++) {
			System.out.print("Digite os dois numeros: ");
			int a = in.nextInt();
			int b = in.nextInt();
			if (a > b) {
				System.out.println(metodoB(a, b+1));
			} else {
				System.out.println(metodoA(a+1, b));
			}

		}
        in.close();
	}

	public static int metodoB(int a, int b) {
		if (a == b) {
			return 0;
		}
		if (a > b) {
			if (b % 2 != 0) {
				return metodoB(a, b+1) + b;
			}
		}
		return metodoB(a, b+1);
	}

	public static int metodoA(int a, int b) {
		if (a == b) {
			return 0;
		}
		if (b > a) {
			if (a % 2 != 0 ) {
				return metodoA(1+a , b) + a;	  
			}
		}
		return metodoA(a+1, b);
	}
}
