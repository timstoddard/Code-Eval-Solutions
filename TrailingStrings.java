import java.io.*;
public class TrailingStrings {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/TrailingStrings.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (line.length() >= 3) {
				String[] s = line.split(",");
				String str = s[0], sub = s[1];
				if (sub.length() > str.length()) System.out.println(0);
				else {
					String end = str.substring(str.length() - sub.length(), str.length());
					if (end.equals(sub)) System.out.println(1);
					else System.out.println(0);
				}
			}
		}
		buffer.close();
	}
}