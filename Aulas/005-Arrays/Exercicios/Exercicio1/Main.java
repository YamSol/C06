import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String args[]) {
        Posicao[][] campo = new boolean[2][2]; // Create a 2x2 boolean array for the minefield
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // Randomly place a mine in the 2x2 field
	int numeroBombas = rand.nextInt(7);
        campo[posX][posY] = true; // Set the mine position to true

	while(true) {
	
	    System.out.println("Campo minado: 2x2");n
	    System.out.println("Enter your guess (row and column) separated by a space (0 or 1):");

	    // Get user input
	    String a = scan.nextLine();
	    String parts[] = a.split(" ");

	    // Parse user input
	    int playerX = Integer.parseInt(parts[0]);
	    int playerY = Integer.parseInt(parts[1]);

	    // visit location

	    // Check if the player's guess is a mine
	    if (campo[playerX][playerY]) {
		System.out.println("Boom! You hit a mine!");
		break;
	    } else {
		System.out.println("Safe! No mine here.");
	    }
	}

        scan.close(); // Close the scanner
    }

    public static int[] num2bits(int numero, int n) {
	
	int[] arrayBits = new int[n];
	
	for(int i = 0; i < n; i++) {
	    arrayBits[n - 1 - i] = (numero >> i) & 1;
	}
	
	return arrayBits;
    }
    
}
