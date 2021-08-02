/*
16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).
* 
 */


public class Exe16 {
	
	public static void main (String[] args) {
		 
	 
		int soma = 0 , media= 0, i = 0;
		
		 for ( i = 15; i <= 1000; i++){

              
             System.out.print(i + " ");
             
             soma+=i;
	 }
	 media = soma/i;
	 
	   System.out.print("");
	  System.out.println("");
	  System.out.println("Soma "+soma);
	 System.out.println("Media aritimetica  "+media);
	 
	}
}
