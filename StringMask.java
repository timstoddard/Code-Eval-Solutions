import java.io.*;

public class StringMask {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/StringMask.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			String output = "";
			for (int i = 0; i < data[0].length(); i++) {
				if (data[1].charAt(i) == '1')
					output += Character.toUpperCase(data[0].charAt(i));
				else output += data[0].charAt(i);
			}
			System.out.println(output);
		}
		buffer.close();
	}
}