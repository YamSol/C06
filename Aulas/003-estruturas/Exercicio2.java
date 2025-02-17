import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {
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
	    }
	    System.out.println("Errou");
	}
	
	scan.close();

    }
}

