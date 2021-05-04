/*
 * 
 * Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. 
 * Caso o valor informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.
 * */

import java.util.Scanner;


public class Exe05 {
	
	public static void main (String[] args){
		
		
				Scanner sc = new Scanner (System.in);
		
		int N = 0;
		boolean ok = true;
		
		
		
		do{
			System.out.print("\nInsira um numero: ");
		      N = sc.nextInt();
	
			if( N > 0){
			 
			 for ( int i = 1 ; i <= N ; i++){
			
			System.out.print(i + " ");
			
			ok = false;
			
			 }
	}  
					 
			} while(ok );
	
	
}
			 
		
		
		
	
}

