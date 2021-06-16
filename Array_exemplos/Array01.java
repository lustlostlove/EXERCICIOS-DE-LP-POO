
import java.util.Scanner;

public class Array01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//int [] array00;  <- pode ser declarado assim ou
		int array00[]; // <- assim
		
		array00 = new int [5];
		
		
		 // 0    1    2    3    4    <- indice 0 ~ 4
		// [0], [0], [0], [0], [0] ;  <- tamanho 5
		//Tipo numerico começa com 0
        // [false], [false], [false], [false], [false] ;
		//Tipo boleaan começa com false
		//Tipo referencia começa com null
		
	 array00[0] = 7;
	  // [7], [0], [0], [0], [0] ;  <- tamanho 5
	 array00[4] = 5;
	 // [7], [0], [0], [0], [5] ;  <- tamanho 5
	 array00[1] = 10;
	  array00[2] = 8;
	   array00[3] = 20;
	   
	   System.out.println(array00[0]); // deve exibir valor 7
	}
}

