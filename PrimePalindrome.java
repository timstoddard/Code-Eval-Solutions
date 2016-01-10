public class PrimePalindrome {
	public static void main(String[] args) {
		for (int i = 997; i > 1; i -= 2) {
			if (isPrime(i) && isPalindrome(i + "")) {System.out.println(i); break;}
		}
	}
	
	private static boolean isPrime(int n) {
		if (n % 2 == 0) return n == 2 ? true : false;
	    for (int i = 3; i * i <= n; i += 2) {
	        if (n % i == 0)
	            return false;
	    }
	    return true;
	}
	
	private static boolean isPalindrome(String str) {
		if (str.length() <= 1) return true;
		if (str.charAt(0) == str.charAt(str.length() - 1)) return isPalindrome(str.substring(1, str.length() - 1));
		return false;
	}
}