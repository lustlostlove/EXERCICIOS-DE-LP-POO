<<<<<<< HEAD
/*
 Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.
 */



import java.util.Scanner;

public class Exe12 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 
		int soma = 0 , valor = 0;
		
		 for (int i = 1; i <= 10; i++){

             valor = sc.nextInt();
             
             soma+=valor;
	 }
	  System.out.println("\n");
	 System.out.println("Total "+soma);
	 
	}
}

=======
/*
 Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.
 */



import java.util.Scanner;

public class Exe12 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 
		int soma = 0 , valor = 0;
		
		 for (int i = 1; i <= 10; i++){

             valor = sc.nextInt();
             
             soma+=valor;
	 }
	  System.out.println("\n");
	 System.out.println("Total "+soma);
	 
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
