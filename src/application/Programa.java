package application;

import java.util.Scanner;

import exercises.Primeiro;
import exercises.Quarto;
import exercises.Quinto;
import exercises.Segundo;
import exercises.Setimo;
import exercises.Sexto;
import exercises.Terceiro;

public class Programa {

	public static void main(String[] args) {
		short menu;
		
		try(Scanner entrada = new Scanner(System.in)) {
			System.out.println("Menu de exercícios:");
			System.out.printf("%n\t1 - Exercício 1");
			System.out.printf("%n\t2 - Exercício 2");
			System.out.printf("%n\t3 - Exercício 3");
			System.out.printf("%n\t4 - Exercício 4");
			System.out.printf("%n\t5 - Exercício 5");
			System.out.printf("%n\t6 - Exercício 6");
			System.out.printf("%n\t7 - Exercício 7%n");
			System.out.printf("%nDigite uma das opções acima: ");
			menu = entrada.nextShort();
			
			switch(menu) {
				case 1:
					Primeiro.exercicio(entrada);
					break;
					
				case 2:
					Segundo.exercicio(entrada);
					break;
					
				case 3:
					Terceiro.exercicio(entrada);
					break;
					
				case 4:
					Quarto.exercicio(entrada);
					break;
					
				case 5:
					Quinto.exercicio(entrada);
					break;
					
				case 6:
					Sexto.exercicio(entrada);
					break;
					
				case 7:
					Setimo.exercicio(entrada);
					break;
					
				default:
					System.out.printf("%nPor favor, entre com uma opção válida.");
			}
		} catch(Exception e) {
			System.out.printf("%nEntrada inválida.");
		}
	}
}
