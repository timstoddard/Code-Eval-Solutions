public class SumOfPrimes {
	public static void main(String[] args) {
		int sum = 0, primesCounted = 0;
		for (int i = 2; primesCounted < 1000; i++) {
			if (isPrime(i)) {
				sum += i;
				primesCounted++;
			}
		}
		System.out.println(sum);
	}
	
	private static boolean isPrime(int n) {
		if (n % 2 == 0) return n == 2 ? true : false;
	    for (int i = 3; i * i <= n; i += 2) {
	        if (n % i == 0)
	            return false;
	    }
	    return true;
	}
}