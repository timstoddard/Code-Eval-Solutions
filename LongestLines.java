import java.io.*;
import java.util.ArrayList;

public class LongestLines {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/LongestLines.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		ArrayList<String> lines = new ArrayList<String>();
		while ((line = buffer.readLine()) != null) {
			lines.add(line);
		}
		int len = Integer.parseInt(lines.get(0));
		lines.remove(0);
		for (int i = 0; i < lines.size(); i++) {
			for (int j = i; j < lines.size(); j++) {
				if (lines.get(i).length() < lines.get(j).length()) {
					String str = lines.get(j);
					lines.set(j, lines.get(i));
					lines.set(i, str);
				}
			}
		}
		for (int i = 0; i < len; i++)
			System.out.println(lines.get(i));
		buffer.close();
	}
}