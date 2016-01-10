import java.io.*;

public class Details {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/Details.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(",");
			int n = countDots(data[0]);
			for (int i = 0; i < data.length; i++) {
				n = Math.min(n, countDots(data[i]));
			}
			System.out.println(n);
		}
		buffer.close();
	}
	
	private static int countDots(String str) {
		int dots = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') dots++;
			else if (str.charAt(i) == 'Y') break;
		}
		return dots;
	}
}