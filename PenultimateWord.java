import java.io.*;

public class PenultimateWord {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/PenultimateWord.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(" ");
			System.out.println(words[words.length - 2]);
			
			// all in one line just fun
			// System.out.println(line.trim().split(" ")[line.trim().split(" ").length - 2]);
		}
		buffer.close();
	}
}