import java.io.*;

public class SumOfIntegersFromFile {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/SumOfIntegersFromFile.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		int total = 0;
		String line;
		while ((line = buffer.readLine()) != null) {
			total += Integer.parseInt(line);
		}
		System.out.println(total);
		buffer.close();
	}
}