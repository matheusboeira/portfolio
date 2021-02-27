package exercises;

import java.util.Scanner;

public class Quinto {
	private static int idade;
	
	public static void exercicio(Scanner entrada) {
		System.out.printf("%nDigite a sua idade: ");
		idade = entrada.nextInt();
		
		if(idade < 16) {
			System.out.printf("%nNão pode votar.");
		} else if(idade >= 16 && idade < 18 || idade > 70) {
			System.out.printf("%nVoto facultativo.");
		} else if(idade >= 18 && idade <= 70) {
			System.out.printf("%nVoto obrigatório.");
		}
	}
}
