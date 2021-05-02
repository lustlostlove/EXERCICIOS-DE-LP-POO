

import java.util.Scanner;
public class Exe11 {
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
			Scanner scString = new Scanner (System.in);
			
			int num1, num2, resultado;
			String operacao;
			
			System.out.print("Entre com o 1 numero :");
		      num1 = sc.nextInt();
			System.out.print("Entre com o 2 numero :");
		      num2 = sc.nextInt();
		      
		      System.out.print("Entre com uma operacao matematica [+,-,*,/]  :");
		      operacao = scString.nextLine();
		      
		      //char op = operacao.charAt(0);  banana
		      //                               012345
		      
		       
		      
		      switch(operacao){// if(operacao.equals("+")) só aceita palavra e palavra  ou if(operacao.equalsIgoneCase("+")) aceita maiuscula e Maiuscula
				  case "+": // charAt '+'
				  resultado =  num1 + num2; // fazer cast (double)
				  
				  break;
				    case "-":
				  resultado =  num1 + num2;
				  
				  break;
				    case "*":
				  resultado =  num1 + num2;
				  
				  break;
				    case "/":
				  resultado =  num1 + num2;
				   System.out.println("Resultado " + resultado);
				  break;
				 
				 default: 
				 resultado = 0;
				 System.out.println("Resultado invalido" + resultado);
				  
				  }
				  System.out.println("Resultado " + resultado);
		      
		       
	}
}

