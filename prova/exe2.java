	
	// @Jejeziga
	//github: https://github.com/JEZIGA01
	
				
import java.util.Scanner;
import java.util.Random;

public class exe2{
	
	
	public static void main (String[] args) {  
		
		 Scanner sc = new Scanner (System.in);
		  Scanner scStrg = new Scanner (System.in);
		   Random random = new Random();
		  
		  //============================= VARIAVEIS=========================//
		int tentativas=0,curriculo=0,num=0,soma=0,i=0,senha = 0 ,salario=0;
		
		boolean continuar = true, cabo = true;
		
		String nome = "",decidir = "",procurar="";
		String original = "Oi amigo, seja bem vindo a nossa equipe, se quiser ajuda estou aqui !";
		String letra = original.replace('a', 'x');
		
		
		//====================================================================//
		
		  
		  /*
		            for(  i = 0; i < 5; i++){
            System.out.print("\n");*/
		  
		  // Enviando seus curriculos desesperadamente varias empresas randoms.. espero que pelo menos 1 aceite..
		  
		  do{
			  
			
			curriculo = random.nextInt(50);
			
			 System.out.println(" Enviando curriculo...  \n ");
			 
			tentativas++;
			
			}while(curriculo != 0 );
			 
			 System.out.println("                               * * * * * Meu primeiro estagio de TI * * * * *    ");
			  System.out.println("");
			System.out.println("                        Consegui um empregoooo ! Depois da "+tentativas+" tentativa hehe .. ");
			 System.out.println("");
			 System.out.println("                     * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * * * * ");
			
			//==================== ACEITA A OFERTA DA EMPRESA OU N ? :O
		do{	 
			salario = random.nextInt(1300);
			
		 System.out.println("      ------------------- O QUE A EMPRESA OFERECE: --------------------" );
		 System.out.println("                 Salario: "+ salario);
		 System.out.println("                 Vale transporte: SIM ");
		 System.out.println("                 Chances de subir de cargo: SIM ");
		  System.out.println("                 Chefe chato: NAO ");
		System.out.println("     --------------------------------------------------------------------");
		System.out.print("          Parece uma empresa boa.. quer aceitar a proposta? s/n ? desistir da carreira digite: sair \n");
		 decidir = sc.nextLine().toLowerCase();
		 
		 }while(decidir.equals("n"));
		  //-------------------------- VC ACEITOU A EMPRESA !!! VAMOS LA//
		 if(decidir.equals("s")){
			continuar = true;
			System.out.println("                           ----------------Primeiro dia -----------------        ");
				System.out.println("                               - Estou um pouco nervoso...                   ");
			System.out.println("                            Bilhete em sua mesa com um texto dizendo..   ");
			System.out.println("               "+letra);
			System.out.print("                         Qual alternativa  abaixo substitui o X ?? 1 ou 2 ? \n");
			System.out.println("1 - e ");
			System.out.println("2 - a");
				num = sc.nextInt();
				
				//==================================== switch
				switch(num){
				
			case 2:
		
		    System.out.println("                      Mto bom para um estagiario promovido para JUNIOR ! ");
			break;
			
			 
		}
		//===============================================SEGUNDO DIA=====================================================
		System.out.println("  ");
		System.out.println("  ");
		 if(num == 2){
						 
						System.out.println("                           ---------------Segundo dia ----------------- ");
						System.out.println("           - Esta pedindo para eu digitar numeros inteiros o que sera...");
												 int b[] = new int [5];
		int posicao;
		for ( i = 0; i < b.length; i ++){
			
			System.out.print("Entre com um numero: ");
			b[i] = sc.nextInt();
			soma+=b[i];
			
			}
			 System.out.println(" ");
			
			
			posicao = b.length - 1;
			
//System.out.print(b [posicao] + " ");
			System.out.println("                           A soma desses numeros vai servir para algo ... ");
		
					
			
			/*do{
				
				
				
				
				
			posicao--;
			
				}
				
				while(posicao>=0);*/
				 System.out.println(" ");
				//====================================ULTIMO DIA=====================================
						 
						System.out.println("                           ----------------Ultimo dia -----------------");
						System.out.println("                            - Entre com sua senha para ser promovido...");
						 senha = sc.nextInt();
						if(senha == soma){
							
							System.out.print("                         - Parabens voce foi promovido para Senior Pleno ");
					 
							}
							else if(senha!=soma){
								
								System.out.print("                       - Demitidoooo !!! Ih la vamos nos... :c ");
								
								}
							
					
					
					// senha : System.out.println(soma); hihihi
					
					
						} // IF DO SEGUNDO DIA
						
						// DEMITIDO ;-;
						
						else if(num == 1) {
		continuar = false;
		 System.out.println("  Voce foi demitido !!!  >:c ");
		 System.out.println("  vai procurar outro emprego "); 
		}// ELSE IF DA DEMISSAO
		
		else if (decidir.equals("sair")){
			 System.out.println("  Boa sorte meu nobre ");
			}
							
					}// IF DE ACEITAR A EMPRESA
				
		
	} //PSVM
		 
}//CLASS

