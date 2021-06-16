 

import java.util.Scanner;


public class Exe08 {
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Horario de inicio da partida: ");
		int hora_inicio = sc.nextInt();
		
		System.out.print("Horario de termino da partida: ");
		int hora_termino= sc.nextInt();
		
		if(hora_inicio >= hora_termino){
			hora_termino += + 24;
		}
		
		
		int tempo_jogo = Math.abs(hora_inicio - hora_termino);
		
		
		System.out.println("Tempo de jogo foi de :" + tempo_jogo + " horas");
		
		
	}
}

