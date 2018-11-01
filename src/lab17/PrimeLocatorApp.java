package lab17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeLocatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max;
		String continueProgram;

		System.out.println("=====================================");
		System.out.println("PRIME LOCATION, LOCATION, LOCATION!!!");
		System.out.println("=====================================");

		System.out.println("\nPlease give the prime number generator a maximum value: \n");
		max = scan.nextInt();

		List<Integer> listOfPrimes = new ArrayList<>();

		primeGenerator(max, listOfPrimes);

		System.out.println("\nThanks! \n");
		System.out.println("An arraylist of " + listOfPrimes.size() + " primes has now been generated.");

		do {
			System.out.println("Which prime are you looking for?: \n");
			int userPrime = scan.nextInt();
			System.out.println("\nThe number " + userPrime + " is Prime " + listOfPrimes.get(userPrime) + ".");
			System.out.println("\nWould you like to find another prime? (y/n)");
			continueProgram = scan.next();
		} while (continueProgram.charAt(0) == 'y');

		System.out.println("\nVery well. \nSo long for now!");

		scan.close();

	}

	public static void primeGenerator(int max, List<Integer> listOfPrimes) {
		for (int i = 1; i < max; i++) { // the outer loop counts up to a number specified by the user.
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) { // the inner loop dumps the non-primes.
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				listOfPrimes.add(i); // and the primes are added to an arraylist.

			}
		}
	}

}
