import java.util.Scanner;

public class Exe14 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 	
		 	int soma = 0 , valor=0, valorb = 0;
		 	
		 			 valor = sc.nextInt();
		 			 valorb =sc.nextInt();
		 			 
		 			 if (valorb > valor){
						  System.out.println("");
		 	  System.out.println("");
		 	 for (int i = valor;  i <= valorb; i++){
				
				  System.out.print(i + " ");
                  soma+=i;
                  

				 }
 
                   System.out.print("");
           
             				 System.out.println(" \n Total: "+soma);
						 }
		 	
           else{
			    System.out.print("O primeiro valor tem que ser menor que o segundo valor");
			   }
             
	 
	}
}

