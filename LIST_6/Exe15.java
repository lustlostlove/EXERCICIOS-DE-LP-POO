<<<<<<< HEAD
/*
15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor que o primeiro valor lido,
*  ou seja, deve-se testá-los.
 */

import java.util.Scanner;

public class Exe15 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 	
		 	int soma = 0 , valor=0, valorb = 0;
		 	
		 			 valor = sc.nextInt();
		 			 valorb =sc.nextInt();
		 			 
		 			 if (valorb > valor || valorb < valor){
						  System.out.println("");
		 	  System.out.println("");
		 	 for (int i = valor;  i <= valorb; i++){
				
				  System.out.print(i + " ");
                  soma+=i;
                  

				 }
 
                   System.out.print("");
           
             				 System.out.println(" \n Total: "+soma);
						 }
		 	
           else{
			    System.out.print("O primeiro valor tem que ser maior ou menor que o segundo valor");
			   }
		   }
	   }
   
=======
/*
15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor que o primeiro valor lido,
*  ou seja, deve-se testá-los.
 */

import java.util.Scanner;

public class Exe15 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 	
		 	int soma = 0 , valor=0, valorb = 0;
		 	
		 			 valor = sc.nextInt();
		 			 valorb =sc.nextInt();
		 			 
		 			 if (valorb > valor || valorb < valor){
						  System.out.println("");
		 	  System.out.println("");
		 	 for (int i = valor;  i <= valorb; i++){
				
				  System.out.print(i + " ");
                  soma+=i;
                  

				 }
 
                   System.out.print("");
           
             				 System.out.println(" \n Total: "+soma);
						 }
		 	
           else{
			    System.out.print("O primeiro valor tem que ser maior ou menor que o segundo valor");
			   }
		   }
	   }
   
>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
