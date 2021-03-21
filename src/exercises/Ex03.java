package exercises;

import java.util.Scanner;

public class Ex03 {
	private static int idade;
	
	public static void exercicio(Scanner entrada) {
		System.out.print("%nInforme sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.printf("%nCategoria: Infantil.");
		} else if(idade <= 17) {
			System.out.printf("%nCategoria: Juvenil.");
		} else if(idade <= 25) {
			System.out.printf("%nCategoria: Adulto.");
		} else {
			System.out.printf("%nCategoria inválida.");
		}
	}
}
