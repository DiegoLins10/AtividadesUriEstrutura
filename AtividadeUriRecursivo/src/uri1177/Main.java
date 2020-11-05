package uri1177;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int y = 0;
		int s = 0;
		int vetor[] = new int[1000];
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor N: ");//entrada valor N
		int n = in.nextInt();
		contar(999, y, vetor, n - 1, 0, s);
		in.close();
	}


	public static int contar(int a, int y, int vetor[], int n, int d, int s) {// usa o y como contador//
		
		vetor[y] = s; // adiciona os numeros no vetor
		if (s == n)
			s = -1;
		s = s + 1;
		System.out.println("N" +"[" + y + "]" + " = " + vetor[y]);
		if (a > y) {
			return contar(a, y + 1, vetor, n, d, s); // metodo recursivo
		} else {
			return 0;
		}
		
	}
}