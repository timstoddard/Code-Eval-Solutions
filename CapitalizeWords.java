import java.io.*;

public class CapitalizeWords {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/CapitalizeWords.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = Character.toUpperCase(line.charAt(0)) + line.substring(1);
			for (int i = 1; i < line.length(); i++) {
				if (line.charAt(i - 1) == ' ') {
					line = line.substring(0, i) + Character.toUpperCase(line.charAt(i)) + line.substring(i + 1);
				}
			}
			System.out.println(line);
		}
		buffer.close();
	}
}