import java.io.*;

public class CleanUpTheWords {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/CleanUpTheWords.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String output = " ";
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i))) {
					output += Character.toLowerCase(line.charAt(i));
				} else {
					if (output.charAt(i == 0 ? 0 : output.length() - 1) != ' ')
						output += " ";
				}
			}
			System.out.println(output.trim());
		}
		buffer.close();
	}
}