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
			System.out.println("Menu de exerc�cios:");
			System.out.printf("%n\t1 - Exerc�cio 1");
			System.out.printf("%n\t2 - Exerc�cio 2");
			System.out.printf("%n\t3 - Exerc�cio 3");
			System.out.printf("%n\t4 - Exerc�cio 4");
			System.out.printf("%n\t5 - Exerc�cio 5");
			System.out.printf("%n\t6 - Exerc�cio 6");
			System.out.printf("%n\t7 - Exerc�cio 7%n");
			System.out.printf("%nDigite uma das op��es acima: ");
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
					System.out.printf("%nPor favor, entre com uma op��o v�lida.");
			}
		} catch(Exception e) {
			System.out.printf("%nEntrada inv�lida.");
		}
	}
}
