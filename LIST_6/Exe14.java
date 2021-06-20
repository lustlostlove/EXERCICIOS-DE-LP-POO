/*
 14) Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos 
 * (incluindo os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor lido*/
 
import java.util.Scanner;

public class Exe14 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 	
		 	int soma = 0 , valor=0, valorb = 0;
		 	
		 			 valor = sc.nextInt();
		 			 valorb =sc.nextInt();
		 	 System.out.println("");
		 	  System.out.println("");
		 	 for (int i = valor;  i <= valorb; i++){
				
				  System.out.print(i + " ");
                  soma+=i;
                  

				 }
 
                   System.out.print("");
           
             				 System.out.println(" \n Total: "+soma);
           
             
	 
	}
}
