


import java.util.Scanner;

public class Exe10 {
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
		
			double salario,vendas,total,acres=0;
			
			
			
		System.out.print("Entre com o salario fixo :");
			 salario = sc.nextDouble();
						System.out.print("Entre com o valor das vendas:");
		 vendas = sc.nextDouble();
		 
		 if (vendas <= 1500 ){
			acres = vendas * 0.03;
			 }
			 else{
				 acres = 1500 * 0.03 + ((vendas - 1500)) * 0.05;
				 }
			 total = salario + acres;
		System.out.printf("Total : %.2f", total);
	}
}

