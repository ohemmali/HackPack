import java.util.ArrayList;

public class Prime {
	
	// this finds all prime numbers upto limit
	// max value that can be passed in is about "200,000,000" and runs in about
	// 10 seconds
	public static ArrayList<Integer> findAll(int limit) {
		boolean[] notPrime = new boolean[limit + 1];
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for (int i = 3; i <= limit; i += 2) {
			if (!notPrime[i]) {
				list.add(i);
				if (i * i <= limit)
					for (int j = i; j <= limit; j += i)
						notPrime[j] = true;
			}
		}
		return list;
	}

	// this finds the prime factorization of all numbers upto limit
	// max value that can be passed in is about "1,000,000"
	public static int[][] findAllPrimeFactors(int limit) {
		int[][] primeFactors = new int[++limit][9];
		for (int i = 2; i < limit; i += 2) {
			primeFactors[i][++primeFactors[i][0]] = 2;
		}
		for (int i = 3; i < limit; i += 2) {
			if (primeFactors[i][0] == 0) {
				for (int j = i; j < limit; j += i) {
					primeFactors[j][++primeFactors[j][0]] = i;
				}
			}
		}
		return primeFactors;
	}

	// this finds if a number is prime
	// possibly look into BigInteger.isProbablePrime if test is very large
	public static boolean isPrime(int test) {
		if ((test & 1) == 0 && test > 2)
			return false;
		for (int i = 3; i * i <= test; i += 2) {
			if (test % i == 0)
				return false;
		}
		return true;
	}

}