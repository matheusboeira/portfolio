package exercises;

import java.util.Scanner;

public class Quarto {
	private static int publico;
	
	public static void exercicio(Scanner entrada) {
		System.out.printf("%nDigite a quantidade de pessoas: ");
		publico = entrada.nextInt();
		
		if(publico < 5000) {
			System.out.printf("%nP�blico fraco.");
		} else if(publico <= 20000) {
			System.out.printf("%nP�blico bom.");
		} else {
			System.out.printf("%nP�blico excelente.");
		}
	}
}
