package application;

import java.util.Scanner;

import exercises.Ex01;
import exercises.Ex02;
import exercises.Ex03;
import exercises.Ex04;
import exercises.Ex05;
import exercises.Ex06;
import exercises.Ex07;

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
					Ex01.exercicio(entrada);
					break;
					
				case 2:
					Ex02.exercicio(entrada);
					break;
					
				case 3:
					Ex03.exercicio(entrada);
					break;
					
				case 4:
					Ex04.exercicio(entrada);
					break;
					
				case 5:
					Ex05.exercicio(entrada);
					break;
					
				case 6:
					Ex06.exercicio(entrada);
					break;
					
				case 7:
					Ex07.exercicio(entrada);
					break;
					
				default:
					System.out.printf("%nPor favor, entre com uma opção válida.");
			}
		} catch(Exception e) {
			System.out.printf("%nEntrada inválida.");
		}
	}
}
