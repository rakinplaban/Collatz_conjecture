import java.util.*;
import java.lang.*;

/**
 * This code generates a sequence of Collatz conjecture.
 * Collatz conjecture is also know as Syracuse suite. 
 * */

public class Main {
	public static void main(String[] args) {
		CollatzConjecture cltz = new CollatzConjecture();
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print(cltz.seqGenerate(number));
		
	}
}
