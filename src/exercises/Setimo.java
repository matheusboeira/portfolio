package exercises;

import java.util.Scanner;

public class Setimo {
	private static int horas, minutos, segundos;
	
	public static void exercicio(Scanner entrada) {
		int verificar;
		
		System.out.printf("%nEntre com uma hora (0 a 23): ");
		horas = entrada.nextInt();
		
		System.out.print("Entre com os minutos (0 a 59): ");
		minutos = entrada.nextInt();
	
		verificar = (horas < 0 || horas > 23) ? 1 : 0;
		verificar += (minutos < 0 || minutos > 59) ? 2 : 0;
		
		switch(verificar) {
			case 1: 
				System.out.printf("%nHora(s) incorreta.%n");
				break;
				
			case 2: 
				System.out.printf("%nMinuto(s) incorreto.%n");
				break;
				
			case 3:
				System.out.printf("%nHoras e minutos estão incorretos.%n");
				break;
				
			default:
				horas *= 3600;
				minutos *= 60;
				segundos = horas + minutos;
				
				System.out.printf("%n%d segundos.%n", segundos);
		}
	}
}
