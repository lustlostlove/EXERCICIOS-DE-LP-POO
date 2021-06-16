/*
Crie um arquivo chamado VerificaValorProduto.java.
*  Solicite ao usuário que digite os valores para as variáveis precoProduto1 e precoProduto2. 
* O programa deve testar o valor digitado pelo usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), 
* exibir a mensagem VALOR INVALIDO e finalizer o programa. 
* Caso os valores digitados sejam válidos, exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
*  Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato deve ser exibida. 
* Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser exibida.
 */




import java.util.Scanner;


public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto de 1 ate 1000");
		
		int precoProduto1 = sc.nextInt();
		int precoProduto2 = sc.nextInt();
		
		      if ((precoProduto1 > 1000 ) || (precoProduto2 > 1000)){ 
	
	                       System.out.println("Valor Invalido");	
					   }
		
		
		
		
			else if (precoProduto1 > precoProduto2){ 
	
	                       System.out.println("O produto 2 e mais barato");	
					   }
	                       
	                       else if(precoProduto1 < precoProduto2 ){
							   
							     //System.out.println(precoProduto1);	
							       //   System.out.println(precoProduto2);	
							   
							    System.out.println("O produto 1 e mais barato" );	
	                       
							   }
							 
	                       
	                       else{
							   
							   
							   System.out.println("Produto com valor igual");	
							   }
		
	}
}

