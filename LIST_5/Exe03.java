

import java.util.Scanner;

public class Exe03 {
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
				
			double total = 0 ;
			
					System.out.print("Digite a quantidade de maca(s) :");
				int  qtd_maca = sc.nextInt();
				
				if( qtd_maca >=12){
					
                           total = 1.00 * qtd_maca;
					System.out.printf("Total = %.2f " , total);
					}
		else{
			
			 total = 1.30 * qtd_maca;
			System.out.printf("Total = %.2f " , total);
			}
	}
}

