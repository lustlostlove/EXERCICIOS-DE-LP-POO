<<<<<<< HEAD


import java.util.Scanner;

public class Exe17 {
	
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);
		  Scanner scStrg = new Scanner (System.in);


 double  nota_a = 0 , nota_b = 0 ,soma=0 , media=0;
 boolean continuar = true;
 String decidir = "";

 
do{
			System.out.println("Digite a primeira nota: ");
               nota_a = sc .nextDouble();
                System.out.println("Digite a segunda nota: ");
                nota_b = sc .nextDouble();   
                
                            System.out.println(" ");
                
                if ((nota_b<0 || nota_a<0 ) || (nota_b>10 || nota_a>10) ){
			            
			           System.out.println("Nota invalida...");
			             System.out.printf(" ");
		  }
		  
               else if ((nota_a >=0 || nota_a >=10) && (nota_b>=0 || nota_b<=10)){
			            
			             soma+=nota_a+nota_b;
	             media = soma/2;
	             
	           //System.out.println(soma);
              System.out.printf("Media %.2f ",media);

              System.out.println("  ");
 			 System.out.println(" ************************* ");
 			 
                    System.out.println(" Deseja continuar  s/n ?");
 			decidir = scStrg.nextLine().toLowerCase();
 			System.out.println("  ");
 			 System.out.println(" ************************* ");
 			
 			if(decidir.equals("n")){
			continuar = false;
				 System.out.println("Programa finalizado...");
				}
 			
                    
		  }
		   
		  
		  }while(continuar);
	 
}
	 
		
	}
=======


import java.util.Scanner;

public class Exe17 {
	
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);
		  Scanner scStrg = new Scanner (System.in);


 double  nota_a = 0 , nota_b = 0 ,soma=0 , media=0;
 boolean continuar = true;
 String decidir = "";

 
do{
			System.out.println("Digite a primeira nota: ");
               nota_a = sc .nextDouble();
                System.out.println("Digite a segunda nota: ");
                nota_b = sc .nextDouble();   
                
                            System.out.println(" ");
                
                if ((nota_b<0 || nota_a<0 ) || (nota_b>10 || nota_a>10) ){
			            
			           System.out.println("Nota invalida...");
			             System.out.printf(" ");
		  }
		  
               else if ((nota_a >=0 || nota_a >=10) && (nota_b>=0 || nota_b<=10)){
			            
			             soma+=nota_a+nota_b;
	             media = soma/2;
	             
	           //System.out.println(soma);
              System.out.printf("Media %.2f ",media);

              System.out.println("  ");
 			 System.out.println(" ************************* ");
 			 
                    System.out.println(" Deseja continuar  s/n ?");
 			decidir = scStrg.nextLine().toLowerCase();
 			System.out.println("  ");
 			 System.out.println(" ************************* ");
 			
 			if(decidir.equals("n")){
			continuar = false;
				 System.out.println("Programa finalizado...");
				}
 			
                    
		  }
		   
		  
		  }while(continuar);
	 
}
	 
		
	}
>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
