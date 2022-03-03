package ExerciciosJAVA;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		 int num1, num2, num3;
		 int maior;
	        
		 
	    System.out.println("Digite o numero 1: ");
	    num1 = leia.nextInt();

	    System.out.println("Digite o numero 2: ");
	    num2 = leia.nextInt();
	    
	    System.out.println("Digite o numero 3: ");
	    num3 = leia.nextInt();

	    
	    maior =  num1;
	    if(num2 > maior)
	        maior = num2;
	    
	    if(num3 > maior)
	    	maior = num3;
	   
	        
	        

	    System.out.println("O maior número é:  " + maior);


	}

	}

