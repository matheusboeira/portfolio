package exercises;

import java.util.Scanner;

public class Ex01 {
	private static int a, b;
	
	public static void exercicio(Scanner entrada) {
		System.out.printf("%nDigite o 1� n�mero: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		b = entrada.nextInt();
		
		if(a > b) System.out.printf("%nO n�mero %d � o maior. Logo, %d � o menor.%n", a, b);
		else if(a == b) System.out.printf("%nOs n�meros s�o iguais (%d, %d).%n", a, b);
		else System.out.printf("%nO n�mero %d � o maior. Logo, %d � o menor.%n", b, a);
	}
}
