/*Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20
 * incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.*/



import java.util.Scanner;


public class Exe09 {
	
	public static void main (String[] args) {
		
Scanner sc = new Scanner (System.in);


 int valor=0 ;
 int dentro=0;
 int fora=0;
 
 
  System.out.println("Digite 10 valores inteiros : ");
 
 
 for (int i = 1; i <= 10; i++){
	 
	
	 valor = sc .nextInt();
	 
	 if (valor >= 10 && valor <=20){
			dentro ++;
			
			}
			else{
				fora++;
				}
	
	 
	 }
		
			

				System.out.println("Numeros dentro do intervalo: "+ dentro);
				 System.out.println("Numeros fora do intervalo: "+ fora);
		
	 }
 }
 


