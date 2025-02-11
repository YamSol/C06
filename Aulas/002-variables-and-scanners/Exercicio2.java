import java.util.Scanner;

public class Exercicio2 {

    public static void main(String args[]) {
	Scanner input = new Scanner(System.in);

	System.out.println("Insira um valor inteiro");
	int valueInt = input.nextInt();

	System.out.println("The square of inserted value is :" + (valueInt * valueInt));

	input.close();
    }
}
