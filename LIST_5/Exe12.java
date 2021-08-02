<<<<<<< HEAD
/*
Desenvolva um programa em Java que receba o preço de um produto e seu código deorigem 
* e mostre o preço do produto junto de sua procedência, 
* o valor calculado do frete e ovalor final a ser pago pelo produto, conforme tabela a seguir
 */


import java.util.Scanner;

public class Exe12 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double preco_prod , acres = 0;
		int cod;
		String regiao = "";
		
		
		System.out.println("Digite o preco do produto: ");
		preco_prod = sc.nextDouble();
		
		System.out.println("Digite o codigo do produto: ");
	    cod = sc.nextInt();
	    
	    
	    if ( cod == 1){
			
			regiao = "Norte";
			acres = preco_prod+(preco_prod * 0.10);
			
			}
			
	    else if(cod == 2 || cod ==5 || cod ==9){
			
			regiao = "Sul";
			acres = preco_prod+(preco_prod * 0.03);
			}
			
			 else if(cod == 3  || (cod >=10 && cod <=15) ){
			
			regiao = "Leste";
			acres = preco_prod+(preco_prod * 1.2);
			}
			
			 else if(cod == 7  || cod == 20 ){
			
			regiao = "Oeste";
			acres = preco_prod+(preco_prod * 7.3);
			
			}
			
			
		else{
			
			regiao = "Importado";
			acres = preco_prod+(preco_prod * 22.2);
			
			}
			
			System.out.printf("Regiao procedencia: %s %n" ,regiao);
	    System.out.printf(" Valor do frete: %.2f ", acres);
		
		
	    
		
	}
}

=======
/*
Desenvolva um programa em Java que receba o preço de um produto e seu código deorigem 
* e mostre o preço do produto junto de sua procedência, 
* o valor calculado do frete e ovalor final a ser pago pelo produto, conforme tabela a seguir
 */


import java.util.Scanner;

public class Exe12 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double preco_prod , acres = 0;
		int cod;
		String regiao = "";
		
		
		System.out.println("Digite o preco do produto: ");
		preco_prod = sc.nextDouble();
		
		System.out.println("Digite o codigo do produto: ");
	    cod = sc.nextInt();
	    
	    
	    if ( cod == 1){
			
			regiao = "Norte";
			acres = preco_prod+(preco_prod * 0.10);
			
			}
			
	    else if(cod == 2 || cod ==5 || cod ==9){
			
			regiao = "Sul";
			acres = preco_prod+(preco_prod * 0.03);
			}
			
			 else if(cod == 3  || (cod >=10 && cod <=15) ){
			
			regiao = "Leste";
			acres = preco_prod+(preco_prod * 1.2);
			}
			
			 else if(cod == 7  || cod == 20 ){
			
			regiao = "Oeste";
			acres = preco_prod+(preco_prod * 7.3);
			
			}
			
			
		else{
			
			regiao = "Importado";
			acres = preco_prod+(preco_prod * 22.2);
			
			}
			
			System.out.printf("Regiao procedencia: %s %n" ,regiao);
	    System.out.printf(" Valor do frete: %.2f ", acres);
		
		
	    
		
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
