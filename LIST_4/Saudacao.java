/*
Crie um arquivo chamado Saudacao.java. 
* Implemente um programa em Java que declare uma variável chamada hora.
*  Essa variável deve armazenar a hora do dia. 
* Esse programa deve exibir a mensagem Zzzzz se a hora estiver no intervalo [0, 6],
*  Bom dia se a hora estiver no intervalo [7, 11], Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23].
*  Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre fazendo todas as validações necessária
 */



import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
				Scanner sc = new Scanner (System.in);
				
				System.out.println("1 - hora manual \n 2 - hora automatica ");
				int  h = sc.nextInt();
				
				
				if ( h  == 1)  {
					
					System.out.println("Digite a hora manualmente : ");
					
					
					  int hora = sc.nextInt();
					  if(hora >= 0 && hora <= 6){
			System.out.println("ZzzzzZZ");
		}
		else if(hora >= 7 && hora <= 11){
			System.out.println("Bom dia!");
		}
		else if(hora >= 12 && hora <= 17){
			System.out.println("Boa tarde!");
		}
		else{
			System.out.println("Boa noite!");
		}
					 
					
					} 
					
					 else {
						 
						 int  hora = (int) (Math.random() * 23); 
						 System.out.println("Hora random " + hora);
						 
						  if(hora >= 0 && hora <= 6){
			System.out.println("ZzzzzZZ");
		}
		else if(hora >= 7 && hora <= 11){
			System.out.println("Bom dia!");
		}
		else if(hora >= 12 && hora <= 17){
			System.out.println("Boa tarde!");
		}
		else{
			System.out.println("Boa noite!");
		}
					 
						  
						}
            
              
            
             
				
	}
}

