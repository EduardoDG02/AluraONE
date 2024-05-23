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
		int exit = 0;
		int deposit = 0;
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
				8 - Si
				9 - No
				""";
		System.out.println(inicio);
		System.out.println("Hola " + Cliente + " elige una opción");
		System.out.println(Nav);
		
		
		while (Select !=9) {
			
			Select = sc.nextInt();
			
			switch (Select) {
			case 1: 
				System.out.println(Saldo);
				break;
			case 2: 
				System.out.println("¿Cuanto deseas retirar?");
				amount = sc.nextInt();
				if (amount<Saldo) {
					Saldo = Saldo - amount;
					System.out.println("Su saldo actual es de " + Saldo);
				}else {
					System.out.println("Saldo insuficiente");
				} // if 
				break;
			case 3: 
				System.out.println("Cantidad a depositar");
				deposit = sc.nextInt();
				Saldo = Saldo + deposit;
				System.out.println("Su saldo actual es de " + Saldo );
			case 9:
				System.out.println("Gracias por visitarnos, vuelva pronto");
			
			}// switch		
	
	}

		
	}

}
