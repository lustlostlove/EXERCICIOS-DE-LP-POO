<<<<<<< HEAD
/*
20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.
 */

import java.util.Scanner;
import java.util.Random;

public class Exe20 {
	public static void main (String[] args) {
		
		 Random random = new Random();
		 Scanner sc = new Scanner (System.in);
		 
		 int maior =0,menor =0, numero=0;
		
	for(int i = 1; i <= 100; i++){
			numero =random.nextInt(100);
			
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
	 }

	}

=======
/*
20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.
 */

import java.util.Scanner;
import java.util.Random;

public class Exe20 {
	public static void main (String[] args) {
		
		 Random random = new Random();
		 Scanner sc = new Scanner (System.in);
		 
		 int maior =0,menor =0, numero=0;
		
	for(int i = 1; i <= 100; i++){
			numero =random.nextInt(100);
			
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
	 }

	}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
