/*
 * 
 * 18) Uma loja está levantando o valor total de todas as mercadorias em estoque.
 *  Escreva um programa em Java que permita a entrada das seguintes informações:
 *  a) o número total de mercadorias no estoque;
 *  b) o valor de cada mercadoria.
 *  Ao final imprimir o valor total em estoque e a média de valor das mercadorias.

 */


import java.util.Scanner;

public class Exe18 {
	
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner (System.in);
		 
		 double valor_mercadoria = 0, soma =0;
		 int qtd_mercadoria = 0;
		 
		 System.out.println("Digite a quantidade de mercadoria: ");
                qtd_mercadoria = sc.nextInt();
                
        
              
		for (int i = 1; i <= qtd_mercadoria; i++){
 System.out.println("Digite o valor da "+i+" mercadoria: ");
            valor_mercadoria = sc.nextDouble();
             
             soma+=valor_mercadoria;
	 }
	  System.out.println("");
	 System.out.println("Total "+soma);
		
		
	}
}

