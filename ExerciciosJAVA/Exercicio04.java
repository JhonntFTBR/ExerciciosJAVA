package ExerciciosJAVA;

import java.util.Scanner;


public class Exercicio04 {
	

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		int numero;
		
		
		System.out.println("Digite um numero: ");
		numero=leia.nextInt();
		
		
		
		leia.close();
		
		
		if(numero%2==0) {
			
			System.out.println("O numero escolhido � par e a raiz dele � "+ Math.sqrt(numero));
			
			
		}else {
			
			System.out.println("O numero escolhido � impar e a raiz dele � "+ Math.pow(numero,2));
			
		}
		
		
		}

	}