package Contador;
import java.util.Scanner;

public class Vogais {

	 public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);

	      int i;
	      String s;

	      System.out.printf("Informe uma frase:\n");
	      s = entrada.nextLine();

	      int cta = 0; 
	      int cte = 0; 
	      int cti = 0;
	      int cto = 0; 
	      int ctu = 0; 
	      int n = s.length();
	      
	      Char c = s.charAt(i);
	      
	      for (i=0; i<=n; i++) {
	        if ((s.charAt(i) == 'a') || (s.charAt(i) == 'A'))
	           cta = cta + 1;

	        if ((s.charAt(i) == 'e') || (s.charAt(i) == 'E'))
	           cte = cte + 1;

	        if ((s.charAt(i) == 'i') || (s.charAt(i) == 'I'))
	           cti = cti + 1;

	        if ((s.charAt(i) == 'o') || (s.charAt(i) == 'O'))
	           cto = cto + 1;

	        if ((s.charAt(i) == 'u') || (s.charAt(i) == 'U'))
	           ctu = ctu + 1;
	      }
	      		      	
	      	if(s.contains('A') && s.contains('a') && s.contains('E') && s.contains('e') && s.contains('I') && s.contains('i')&& s.contains('O') && s.contains('o')&& s.contains('U') && s.contains('u')) {
	      		System.out.println(s);	
	      	}
	      System.out.printf("\nExistem %d vogais \"a\" na frase.", cta);
	      System.out.printf("\nExistem %d vogais \"e\" na frase.", cte);
	      System.out.printf("\nExistem %d vogais \"i\" na frase.", cti);
	      System.out.printf("\nExistem %d vogais \"o\" na frase.", cto);
	      System.out.printf("\nExistem %d vogais \"u\" na frase.\n", ctu);
	    }

	}