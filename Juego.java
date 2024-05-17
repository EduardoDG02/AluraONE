package oracleOne;

import java.util.Scanner;
import java.util.Random;

public class Juego {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		
		int guess = 0;
		int answer = rand.nextInt(100);
		int intentos = 0;
		String win = """
				================================
				     Acertaste, Felicidades
				================================
				""";
		String lose = """
				================================
				          Mala Suerte
				================================
				""";
		
		
		
		System.out.println("Juguemos un juego, Adivina un numero del 1 al 100");
		
		
		while (intentos < 5) {
			guess = sc.nextInt();
			intentos++;
			
			
			if (guess == answer) {
				System.out.println(win);
			}else  if (intentos >= 1 && intentos <= 4 && answer < guess){
				System.out.println("tu numero es más grande intenta de nuevo, te quedan " + (5 - intentos) + " intentos");	
			}else  if (intentos >= 1 && intentos <= 4 && answer > guess){
				System.out.println("tu numero es más pequeño intenta de nuevo, te quedan " + (5 - intentos) + " intentos");	
			}
			else {
				System.out.println(lose);
			}
		}
		System.out.println("Ya no tienes intentos el número era " + answer);
		
	}

}
