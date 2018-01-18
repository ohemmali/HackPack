public class Verifier{

	public static void main(String[] args) throws Exception{
		
		
		
		System.out.println("All Primes <= 6: "+(Prime.findAll(6)));
		System.out.println("All Primes <= 25: "+(Prime.findAll(25)));
		System.out.println("All Primes <= 49: "+(Prime.findAll(49)));
		System.out.println("All Primes <= 113: "+(Prime.findAll(113)));
		System.out.println("All Primes <= 120: "+(Prime.findAll(120)));
		System.out.println();
		System.out.println("0 is prime? "+Prime.isPrime(0));
		System.out.println("1 is prime? "+Prime.isPrime(1));
		System.out.println("2 is prime? "+Prime.isPrime(2));
		System.out.println("49 is prime? "+Prime.isPrime(49));
		System.out.println("51 is prime? "+Prime.isPrime(51));
		System.out.println("53 is prime? "+Prime.isPrime(53));
		System.out.println("100 is prime? "+Prime.isPrime(100));
		System.out.println("65,425,440 is prime? "+Prime.isPrime(65425440));
		System.out.println();
		
		int[][] primeFactors = Prime.findAllPrimeFactors(100000);
		System.out.println("prime factors of 2:"+printPrimeFactor(primeFactors[2]));
		System.out.println("prime factors of 49:"+printPrimeFactor(primeFactors[49]));
		System.out.println("prime factors of 51:"+printPrimeFactor(primeFactors[51]));
		System.out.println("prime factors of 53:"+printPrimeFactor(primeFactors[53]));
		System.out.println("prime factors of 100:"+printPrimeFactor(primeFactors[100]));
		System.out.println("prime factors of 12346:"+printPrimeFactor(primeFactors[12346]));
		System.out.println("prime factors of 30030:"+printPrimeFactor(primeFactors[30030]));
		System.out.println("prime factors of 89365:"+printPrimeFactor(primeFactors[89365]));
		System.out.println();
		
		EulerTotientFunction.calcPhi();
		System.out.println("phi(3)="+EulerTotientFunction.tot[3]);
		System.out.println("phi(30)="+EulerTotientFunction.tot[30]);
		System.out.println("phi(83)="+EulerTotientFunction.tot[83]);
		System.out.println("phi(477)="+EulerTotientFunction.tot[477]);
		System.out.println("phi(30030)="+EulerTotientFunction.tot[30030]);
		System.out.println();

		
		long[][] triangle = PascalTriangle.getValues(67);
		System.out.println("3 choose 2 = "+triangle[3][2]);
		System.out.println("10 choose 5 = "+triangle[10][5]);
		System.out.println("26 choose 13 = "+triangle[26][13]);
		System.out.println("31 choose 10 = "+triangle[31][10]);
		System.out.println("31 choose 20 = "+triangle[31][20]);
		System.out.println("67 choose 33 = "+triangle[67][33]);
		
	}
	private static String printPrimeFactor(int[] pf) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < pf[0]; i++){
			sb.append(", "+pf[i+1]);
		}
		return sb.substring(1);
	}
}