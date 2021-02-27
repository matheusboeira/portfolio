package exercises;

import java.util.Scanner;

public class Primeiro {
	private static int a, b;
	
	public static void exercicio(Scanner entrada) {
		System.out.printf("%nDigite o 1º número: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o 2º número: ");
		b = entrada.nextInt();
		
		if(a >= b) System.out.printf("%nO número %d é o maior. Logo, %d é o menor.%n", a, b);
		else System.out.printf("%nO número %d é o maior. Logo, %d é o menor.%n", b, a);
	}
}
