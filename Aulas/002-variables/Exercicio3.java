/* By @YamSol
 */

import java.util.Scanner;

public class Exercicio3 {
    /* Read NPA, and inform discipline status (student has passed or not)
       If not, Ask for NP3 note. Inform final result.
     */

    public static void main(String args[]) {
	Scanner input = new Scanner(System.in);

	System.out.print("NPA (int value): ");
	int NPA = input.nextInt();

	if (NPA >= 60) {
	    System.out.println("You passed the discipline."); 
	} else {
	    System.out.println("You still not passed the discipline. You'll need to do the NP3.");

	    System.out.print("NP3 (int value): "); 
	    int NP3 = input.nextInt();

	    int NFA = NP3 + NPA;
	    if (NFA > 50) {
		System.out.println("You passed the discipline.");
	    } else {
		System.out.println("You have not passed the discipline");
	    }
	}
        
	input.close();
    }
}
