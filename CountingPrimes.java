import java.io.*;

public class CountingPrimes {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/CountingPrimes.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(",");
			int n = Integer.parseInt(data[0]), m = Integer.parseInt(data[1]), count = 0;
			for (int i = n; i <= m; i++) if(isPrime(i)) count++;
			System.out.println(count);
		}
		buffer.close();
	}
	
	private static boolean isPrime(int n) {
		if (n == 1) return false;
		double s = Math.ceil(n);
		for (int i = 2; i < s; i++) if (n % i == 0) return false;
		return true;
	}
}