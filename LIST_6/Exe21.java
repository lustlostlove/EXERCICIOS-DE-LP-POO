/*
 21) Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números. 
 * Depois de ler todos osnúmeros o algoritmo deve apresentar na tela o maior dos números lidos e a média dos números lidos
 */
	
import java.util.Scanner;
import java.util.Random;

public class Exe21 {
	public static void main (String[] args) {
		
		 Random random = new Random();
		 Scanner sc = new Scanner (System.in);
		 
		 int  numero=0,qtd =0, maior=0, menor=0,soma=0, media=0;
		 
			System.out.print("Digite a quantidade:  ");
		  qtd= sc.nextInt();
		
	for(int i = 1; i <= qtd; i++){
			
			numero =random.nextInt(100);
			
			soma+=numero;
			media =soma/qtd;
			System.out.print(numero+" ");
			
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
		System.out.println("Numero maior: " + maior);
		System.out.println("Numero menor: " + menor);
		System.out.println("Media aritmetica: " + media);
	 }

	}

