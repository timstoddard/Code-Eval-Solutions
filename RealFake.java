import java.io.*;

public class RealFake {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/RealFake.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.replaceAll("\\s","");
			int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				if (i % 2 == 0) {
					sum += Integer.parseInt(line.charAt(i)+"") * 2;
				} else {
					sum += Integer.parseInt(line.charAt(i)+"");
				}
			}
			System.out.println(sum % 10 == 0 ? "Real" : "Fake");
		}
		buffer.close();
	}
}