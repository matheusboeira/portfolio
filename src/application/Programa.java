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
					System.out.printf("%nPor favor, entre com uma op��o v�lida.");
			}
		} catch(Exception e) {
			System.out.printf("%nEntrada inv�lida.");
		}
	}
}
