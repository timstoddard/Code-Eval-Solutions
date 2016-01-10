import java.io.*;

public class NModM {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/NModM.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(",");
			int n = Integer.parseInt(data[0]), m = Integer.parseInt(data[1]);
			System.out.println((n - (n / m) * m));
		}
		buffer.close();
	}
}