/*
22) Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:-o maior preço lido;-a média aritmética dos preços dos produtos.
 */

import java.util.Scanner;
 

public class Exe22 {
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);
		 
		 double numero=0, maior=0, menor=0,soma=0, media=0, qtd =0;
		 
		 
			System.out.print("Digite a quantidade:  ");
		  qtd= sc.nextDouble();
		
	for(int i = 1; i <= qtd; i++){
			numero = sc.nextDouble();
			
			soma+=numero;
			media =soma/qtd;
			
			
			if(i ==  1){
				menor = numero;
				  maior = numero;	
			}
		if(numero > maior){
				maior = numero;
			}
			  if(numero < menor){
				   menor = numero;
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Maior preco: " + maior);
		System.out.printf("Media: %.2f",media);
	 }

	}
