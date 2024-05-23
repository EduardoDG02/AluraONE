package firstProject;

import java.util.Scanner;

public class challlengeBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String Cliente = "Antonio Aguilar";
		String User = "Platino"; 
		Double Saldo = 1599.99;
		int amount = 0;
		int Select = 0;
		int conf = 0;
		boolean salir = false;
		String inicio = """
				===================================
					Welcome to CitiBank 
				===================================
				"""; 
		String Nav = """
				1 - Consultar Saldo
				2 - Retirar
				3 - Depositar
				9 - Salir
				""";
		String Salida = """
				¿Deseas realizar algo más?
				5 - Si
				6 - No
				""";
		System.out.println(inicio);
		System.out.println("Hola " + Cliente + " elige una opción");
		System.out.println(Nav);
		
		Select = sc.nextInt();
		
		while (!salir) {
			
			if (Select == 1) {
				System.out.println(Saldo);
				
				System.out.println(Salida);
				conf = sc.nextInt();
				
				if(conf == 5) {
					System.out.println(Nav);
				}else if (conf == 6){
					System.out.println("Gracias por visitarnos, vuelva pronto");
					break;
				}//nested if option 1
			}//option 1
			else if (Select == 2) {
				System.out.println("¿Cuanto deseas retirar?");
				amount = sc.nextInt();
				System.out.println("Su saldo actual es de " + (Saldo - amount));
				System.out.println(Salida);
				conf = sc.nextInt();
				
				if(conf == 1) {
					System.out.println(Nav);
				}else if (conf == 2){
					System.out.println("Gracias por visitarnos, vuelva pronto");
					break;
				}//nested if option 2
			}//option 2 
		}//End while
	}

}
