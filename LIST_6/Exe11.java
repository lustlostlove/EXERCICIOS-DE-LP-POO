<<<<<<< HEAD
/*
 Escreva um programa em Java para ler o número de alunos existentes em uma turma e, após isto,
 *  ler as notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
 */


import java.util.Scanner;

public class Exe11 {
	
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);

 int num_alunos = 0 ;
 double nota = 0 , soma=0 , media=0;

 System.out.println("Digite o numero de alunos : ");
 num_alunos = sc .nextInt();
 System.out.print(""); 
 System.out.print(""); 
 System.out.print(""); 
      for (int i = 1; i <= num_alunos ; i++){

		
 System.out.println("Nota do aluno "+i);
 
             nota = sc .nextDouble();
             
             soma+=nota;
	 }
	 
	 media = soma/num_alunos;
	  //System.out.println(soma);
 System.out.printf("Media %.2f ",media);

		
	}
}

=======
/*
 Escreva um programa em Java para ler o número de alunos existentes em uma turma e, após isto,
 *  ler as notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
 */


import java.util.Scanner;

public class Exe11 {
	
	public static void main (String[] args) {
		
		 
		 Scanner sc = new Scanner (System.in);

 int num_alunos = 0 ;
 double nota = 0 , soma=0 , media=0;

 System.out.println("Digite o numero de alunos : ");
 num_alunos = sc .nextInt();
 System.out.print(""); 
 System.out.print(""); 
 System.out.print(""); 
      for (int i = 1; i <= num_alunos ; i++){

		
 System.out.println("Nota do aluno "+i);
 
             nota = sc .nextDouble();
             
             soma+=nota;
	 }
	 
	 media = soma/num_alunos;
	  //System.out.println(soma);
 System.out.printf("Media %.2f ",media);

		
	}
}

>>>>>>> 104a1080882590b8f21ea48086918244b1b9f270
