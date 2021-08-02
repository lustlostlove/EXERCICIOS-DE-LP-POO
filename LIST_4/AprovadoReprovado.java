<<<<<<< HEAD
/*
Crie um arquivo chamado AprovadoReprovado.java. 
* Solicite ao usuário que digite o valor para a variável nota. 
* O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0 até 10 (inclusos), 
* exibir a mensagem VALOR INVALIDO e finalizer o programa. 
* Caso o valor digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário
 
 */



import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//int nota = (int)(Math.random() * 10);
		
		System.out.println("Digite uma nota de 0 a 10");
		
		int nota = sc.nextInt();
		
			if (nota > 10 ){
			
			         
			         System.out.println("Valor invalido !");
			
			
			
			}
			
			else if (nota >=6){

                    System.out.println("Aprovado");
			
				
				}
				
				
				else{
					System.out.println("Reprovado");
					}
				
		
				
		
	
	
		
		//System.out.println(valor);
	}
}

=======
/*
Crie um arquivo chamado AprovadoReprovado.java. 
* Solicite ao usuário que digite o valor para a variável nota. 
* O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0 até 10 (inclusos), 
* exibir a mensagem VALOR INVALIDO e finalizer o programa. 
* Caso o valor digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário
 
 */



import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//int nota = (int)(Math.random() * 10);
		
		System.out.println("Digite uma nota de 0 a 10");
		
		int nota = sc.nextInt();
		
			if (nota > 10 ){
			
			         
			         System.out.println("Valor invalido !");
			
			
			
			}
			
			else if (nota >=6){

                    System.out.println("Aprovado");
			
				
				}
				
				
				else{
					System.out.println("Reprovado");
					}
				
		
				
		
	
	
		
		//System.out.println(valor);
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
