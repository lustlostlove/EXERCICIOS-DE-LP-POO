


import java.util.Scanner;

public class Exe05 {
	
	public static void main (String[] args) {
		
		
			Scanner sc = new Scanner (System.in);
				
 
			
					System.out.print("Digite seu ano de nascimento :");
				int  nasc = sc.nextInt();
				System.out.print("Digite o ano atual : ");
				int  ano_atual = sc.nextInt();
				
				int total = ano_atual - nasc ;
				
	 System.out.print(" ");
	 	 System.out.print(" ");
				
				
				if( total >= 18){
					
                        
					System.out.println(" Voce vota este ano ");
					}
		else{
			
System.out.println(" Voce nao vota este ano");
			}
			
		
	}
}

