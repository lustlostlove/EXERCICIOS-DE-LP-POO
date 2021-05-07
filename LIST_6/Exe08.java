
import java.util.Scanner;


public class Exe08 {
	
	public static void main (String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		
	 
		int numero = 0 , fatorial =1, contador = 1;
		
		  System.out.print(" Digite um numero inteiro para calcular seu fatorial : "   );
		  numero = sc.nextInt();
		  
		  while(contador <= numero)/* do */{
			  fatorial = fatorial * contador;
			  
			  contador++;
			  
			  }/*while(contador <= numero)*/
		  System.out.print(" O fatorial e : "+ fatorial);
		 
		 
		 /*
		  * 
		  * 
		int numero = 0 , fatorial =1, contador = 1;
		
		  System.out.print(" Digite um numero inteiro para calcular seu fatorial : "   );
		  numero = sc.nextInt();
		  
		 
		 for ( int contador = 1 ; contador <= N ; numero++){
		 * 
			fatorial *= contador;
			
		  * }
		  * System.out.print(" O fatorial e : "+ fatorial);
		  * 
*/
		

		
		
	}

               
			
}

