

import java.util.Scanner;

public class Array02 {
	
	public static void main (String[] args) {
	
	Scanner sc = new Scanner (System.in);
		
		//Array literal ou declaração in-line
		//literal - pouco usada ultimamente
		
		int  Array00 []  = {1,2,3,4,5,};
		
//System.out.println(Array00);
			
			
			for(int i = 0 ; i < 5; i++){
				
				System.out.print(Array00[i]+ " ");

				}
					System.out.println("\n");
					
					// vai rodar no limite
			for(int i = 0 ; i < Array00.length; i++){
				
				System.out.print(Array00[i]+ " ");
				
					System.out.println("\n");
					System.out.println("Posicao" + i);
				
		
				}
	}
}

