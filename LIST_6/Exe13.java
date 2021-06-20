/*
 Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada
 */
 
import java.util.Scanner;

public class Exe13 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 
		int soma = 0 , valor = 0;
		
		 for (int i = 1; i <= 10; i++){

             valor = sc.nextInt();
             if(valor < 40){
				 soma+=valor;
				 }
             
	 }
	  System.out.println("\n");
	 System.out.println("Total "+soma);
	 
	}
}

