
import java.util.Scanner;


public class Exe08 {
	
	public static void main (String[] args) {
		
Scanner sc = new Scanner (System.in);


 int valor=0 ;
 int negativo=0;
 
 
  System.out.println("Digite 10 valores inteiros : ");
 
 
 for (int i = 1; i <= 10; i++){
	 
	
	 valor = sc .nextInt();
	 
	 if (valor <0){
			negativo ++;
			
			}
	
	 
	 }
		
			

				System.out.println("Qtd de numeros negativos: "+ negativo);
				// System.out.println("Qtd de numeros positivos: "+ positivos);
		
	 }
 }
 
