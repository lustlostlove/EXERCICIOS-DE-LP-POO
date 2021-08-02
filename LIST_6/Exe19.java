<<<<<<< HEAD
/*
19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. 
* Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. 
* Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque.
 */



import java.util.Scanner;

public class Exe19 {
	
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);
		  Scanner scStrg = new Scanner (System.in);


 double  valor_mercadoria = 0,soma=0 , i = 0, media =0;
 boolean continuar = true;
 String decidir = "";
 
do{
         System.out.println("Digite o valor da mercadoria: ");
            valor_mercadoria = sc.nextDouble();
            
            i++;
             
             soma+=valor_mercadoria;
             media = soma/i;
		   System.out.println("  ");
		   
		     System.out.println("  *** MAIS MERCADORIAS  s/n ? ***");
 			decidir = scStrg.nextLine().toLowerCase();
 			System.out.println("  ");
 			 
 			
 			if(decidir.equals("n")){
			continuar = false;
				 System.out.printf("Media: %.2f", media);
				}
		  
		  }while(continuar);
	
}
	 
		
}

=======
/*
19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. 
* Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. 
* Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque.
 */



import java.util.Scanner;

public class Exe19 {
	
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);
		  Scanner scStrg = new Scanner (System.in);


 double  valor_mercadoria = 0,soma=0 , i = 0, media =0;
 boolean continuar = true;
 String decidir = "";
 
do{
         System.out.println("Digite o valor da mercadoria: ");
            valor_mercadoria = sc.nextDouble();
            
            i++;
             
             soma+=valor_mercadoria;
             media = soma/i;
		   System.out.println("  ");
		   
		     System.out.println("  *** MAIS MERCADORIAS  s/n ? ***");
 			decidir = scStrg.nextLine().toLowerCase();
 			System.out.println("  ");
 			 
 			
 			if(decidir.equals("n")){
			continuar = false;
				 System.out.printf("Media: %.2f", media);
				}
		  
		  }while(continuar);
	
}
	 
		
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
