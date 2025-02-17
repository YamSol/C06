import java.util.Scanner;

public class Exercicio1{
    public static void printSala(String salaID) {
	System.out.println("Sala " + salaID);
    }
    
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Digite o numero (10,20,30): ");
	int num = scan.nextInt();

	switch(num) {
	case 10:
	    printSala("I-16");
	    break;
	case 20:
	    printSala("I-16");
	    break;
	case 30:
	    printSala("I-22");
	    break;
	default:
	}
	
	scan.close();
    }
}
