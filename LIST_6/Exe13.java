 
import java.util.Scanner;

public class Exe13 {
	
	public static void main (String[] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 
		int soma = 0 , valor = 0;
		
		 for (int i = 1; i <= 10; i++){

             valor = sc.nextInt();
             if(valor < 40){
				 soma+=valor;
				 }
             
	 }
	  System.out.println("\n");
	 System.out.println("Total "+soma);
	 
	}
}

