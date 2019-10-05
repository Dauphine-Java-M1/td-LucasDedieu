package fr.dauphine.ja.dedieulucas.td00;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection{
	private static List<Integer> numbers= new ArrayList<Integer>();
	
	public PrimeCollection() {
		//PrimeCollection.numbers = new ArrayList<Integer>();
	}
	
	public static void initRandom(int n, int m) {
		Random randomGenerator = new Random();
		int randomInt;
		for(int i=0; i<n; i++) {
			randomInt = randomGenerator.nextInt(m+1);
			numbers.add(randomInt);
		}
	}
	
	public static boolean isPrime(int p) {
		double squareOfP = Math.sqrt(p);	
		for(int i=2; i<=squareOfP; i++) {
			if(p%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes() {
		for(Integer n : numbers) {
			if(isPrime(n)) {
				System.out.println(n);
			}
		}
	}
	
	
    public static void main( String[] args )  {
        initRandom(100, 100);
        printPrimes();

    }
    


    
}
