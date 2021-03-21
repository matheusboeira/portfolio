package exercises;

import java.util.Scanner;

public class Ex02 {
	private final static int NOTAS = 3;
	private static double[] nota = new double[NOTAS];
	private static double media;
	
	public static void exercicio(Scanner entrada) {	
		System.out.println();
		for(int i = 0; i < nota.length; i++) {
			System.out.printf("Digite a %dª nota: ", i + 1);
			nota[i] = entrada.nextDouble();
			
			while(nota[i] < 0 || nota[i] > 10) {
				System.out.printf("%n* Por favor, digite notas válidas (0 a 10).");
				System.out.printf("%nDigite a %dª nota: ", i + 1);
				nota[i] = entrada.nextDouble();
			}
			
			media += nota[i] / (double) NOTAS;
		}
		
		if(media >= 6) System.out.printf("%nSituação: Aprovado. Média: %.2f.", media);
		else System.out.printf("%nSituação: Reprovado. Média: %.2f.", media);
	}
}
