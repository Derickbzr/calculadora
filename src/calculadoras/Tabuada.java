package calculadoras;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " +  i + " = " + (numero * i)); // i = variavel que recebe o valor 1 e vai ser somado ao proprio valor ate o numero 10 que <= 10
		}
	
	
	
	}		
	
}
