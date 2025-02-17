import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {
    public static void main(String args[]) {
	Scanner scan	= new Scanner(System.in);
	Random rand	= new Random();

	int random_number = rand.nextInt(10)+1;
	System.out.println("Numero aleatorio gerado.");

	while(true) {
	    System.out.print(">");
	    int read = scan.nextInt();
	    
	    if (read == random_number) {
		System.out.println("Acertou");
		break;
	    } else if (read < random_number) {
		System.out.println("Tente um numero maior");
	    } else {
		System.out.println("Tente um numero menor");
	    }
	    
	    System.out.println("Errou");
	}
	
	scan.close();
    }
}

