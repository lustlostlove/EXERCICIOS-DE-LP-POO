

import java.util.Scanner;

public class Exe01{
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		
		int a[] = new int [15];
		int posicao;
		for (int i = 0; i < a.length; i ++){
			
			System.out.print("Entre com um numero: ");
			a[i] = sc.nextInt();
			
			}
			System.out.print("\n ");
			System.out.print("Leu os valores... \n");
			
			posicao = 0;
			
			while(posicao<a.length){
				
				
				System.out.print(a [posicao] + " ");
			posicao++;
			
				}
			//System.out.print(a [0]);
			
			
			
		
	}
}

