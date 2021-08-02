<<<<<<< HEAD


import java.util.Scanner;

public class Exe02{
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		
		int b[] = new int [15];
		int posicao;
		for (int i = 0; i < b.length; i ++){
			
			System.out.print("Entre com um numero: ");
			b[i] = sc.nextInt();
			
			}
			System.out.print("\n ");
			System.out.print("Leu os valores... \n");
			
			posicao = b.length - 1;
			
			do{
				
				
				System.out.print(b [posicao] + " ");
			posicao--;
			
				}
				
				while(posicao>=0);
			//System.out.print(a [0]);
			
			
			
		
	}
}

=======


import java.util.Scanner;

public class Exe02{
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		
		int b[] = new int [15];
		int posicao;
		for (int i = 0; i < b.length; i ++){
			
			System.out.print("Entre com um numero: ");
			b[i] = sc.nextInt();
			
			}
			System.out.print("\n ");
			System.out.print("Leu os valores... \n");
			
			posicao = b.length - 1;
			
			do{
				
				
				System.out.print(b [posicao] + " ");
			posicao--;
			
				}
				
				while(posicao>=0);
			//System.out.print(a [0]);
			
			
			
		
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
