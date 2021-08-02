<<<<<<< HEAD
/*
Crie um arquivo chamado ADivisivelPorBRandom.java. 
* Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000 (inclusos)
*  e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário
 */


public class  ADivisivelPorBRandom{
	
	public static void main (String[] args) {
		
		
		
		
		int a  = (int)(Math.random() *1000);
		int b  = (int)(Math.random() *20);
		
	   String resultado = ( a % b == 0)? " divisivel " : " nao divisivel ";
	   
	  //  System.out.println(a);
	   //  System.out.println(b);
	   
	   System.out.println(resultado);
	}
}

=======
/*
Crie um arquivo chamado ADivisivelPorBRandom.java. 
* Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000 (inclusos)
*  e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário
 */


public class  ADivisivelPorBRandom{
	
	public static void main (String[] args) {
		
		
		
		
		int a  = (int)(Math.random() *1000);
		int b  = (int)(Math.random() *20);
		
	   String resultado = ( a % b == 0)? " divisivel " : " nao divisivel ";
	   
	  //  System.out.println(a);
	   //  System.out.println(b);
	   
	   System.out.println(resultado);
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
