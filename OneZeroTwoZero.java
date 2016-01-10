import java.io.*;

public class OneZeroTwoZero {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/OneZeroTwoZero.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			int n = Integer.parseInt(data[0]), range = Integer.parseInt(data[1]), count = 0;
			for (int i = 1; i <= range; i++) if (numZeroes(i) == n) count++;
			System.out.println(count);
		}
		buffer.close();
	}
	
	private static int numZeroes(int n) {
		String b = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < b.length(); i++) if (b.charAt(i) == '0') count++;
		return count;
	}
}