<<<<<<< HEAD

/*
Crie um arquivo chamado ADivisivelPorB.java.
*  Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, informados pelo usuário, 
* sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
*  Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário. 
* Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.
 */

import java.util.Scanner;

public class  ADivisivelPorB {
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto de 1 ate 1000");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 if ((a > 1000 ) || (b > 20)){ 
	
	                       System.out.println("Valor Invalido");	
					   }
		
		
		
		
			 else if ((a < 0 ) || (b < 0)){ 
	
	                       System.out.println("Valor Invalido");	
					   }
					   
					   
					   	else if (a > b){ 
	
	                       System.out.println("O produto B e mais barato");	
					   }
	                       
	                       else if(a < b){
							   
							     //System.out.println(precoProduto1);	
							       //   System.out.println(precoProduto2);	
							   
							    System.out.println("O produto A e mais barato" );	
	                       
							   }

					   
					      else{
							   
							   
							   System.out.println("Produto com valor igual");	
							   
							   }
							   
							      
							    if(a % b == 0){
							   
							    
							    System.out.println(" A e divisivel por B " );	
							}
	                       
	                       else  {
							   
							    System.out.println("Nao e Divisivel " );	
							   
							   }
	                       
	}
}

=======

/*
Crie um arquivo chamado ADivisivelPorB.java.
*  Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, informados pelo usuário, 
* sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
*  Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário. 
* Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.
 */

import java.util.Scanner;

public class  ADivisivelPorB {
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto de 1 ate 1000");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 if ((a > 1000 ) || (b > 20)){ 
	
	                       System.out.println("Valor Invalido");	
					   }
		
		
		
		
			 else if ((a < 0 ) || (b < 0)){ 
	
	                       System.out.println("Valor Invalido");	
					   }
					   
					   
					   	else if (a > b){ 
	
	                       System.out.println("O produto B e mais barato");	
					   }
	                       
	                       else if(a < b){
							   
							     //System.out.println(precoProduto1);	
							       //   System.out.println(precoProduto2);	
							   
							    System.out.println("O produto A e mais barato" );	
	                       
							   }

					   
					      else{
							   
							   
							   System.out.println("Produto com valor igual");	
							   
							   }
							   
							      
							    if(a % b == 0){
							   
							    
							    System.out.println(" A e divisivel por B " );	
							}
	                       
	                       else  {
							   
							    System.out.println("Nao e Divisivel " );	
							   
							   }
	                       
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
