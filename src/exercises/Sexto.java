package exercises;

import java.util.Scanner;

public class Sexto {
	private static double peso, altura, imc;
	
	public static void exercicio(Scanner entrada) {
		System.out.printf("%nDigite o seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.printf("Digite a sua altura: ");
		altura = entrada.nextDouble();
		
		if(altura != 0) {
			imc = peso / (Math.pow(altura, 2));
			
			if(imc < 18.5) {
				System.out.printf("%nAbaixo do peso ideal.");
			} else if(imc < 25) {
				System.out.printf("%nPeso ideal.");
			} else if(imc < 30) {
				System.out.printf("%nAcima do peso (sobrepeso).");
			} else {
				System.out.printf("%nObesidade.");
			}
		} else {
			System.out.printf("%nAltura inválida.");
		}
	}
}
