/*
 Crie um arquivo chamado VerificaValorProdutoRandom.java. 
 * Gere dois números aleatórios entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. 
 * O programa deve exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor. 
 * Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato deve ser exibida.
 *  Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser exibida
 */


public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		int precoProduto1 = (int)(Math.random() * 1000);
		int precoProduto2 = (int)(Math.random() * 1000);
		
				if(precoProduto1 > precoProduto2){ 
	
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

