import java.io.*;

public class HappyNumbers {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/HappyNumbers.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int lastNum = Integer.parseInt(line);
			while (lastNum != 89 && lastNum != 1) {
				int sum = 0, n = lastNum;
				while (n > 0) {
					sum += Math.pow(n % 10, 2);
					n /= 10;
				}
				lastNum = sum;
			}
			System.out.println(lastNum == 1 ? "1" : "0");
		}
		buffer.close();
	}
}