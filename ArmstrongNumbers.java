import java.io.*;

public class ArmstrongNumbers {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ArmstrongNumbers.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				sum += Math.pow(Integer.parseInt(line.charAt(i) + ""), line.length());
			}
			System.out.println(Integer.parseInt(line) == sum ? "True" : "False");
		}
		buffer.close();
	}
}