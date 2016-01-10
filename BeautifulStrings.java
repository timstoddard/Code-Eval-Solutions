import java.io.*;
import java.util.ArrayList;

public class BeautifulStrings {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/BeautifulStrings.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int sum = 0;
			String letters = "";
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (Character.isLetter(c)) {
					letters += Character.toLowerCase(c);
				}
			}
			int[] vals = counter(letters);
			int add = 26;
			for (int i : vals) {
				sum += add * i;
				add--;
			}
			System.out.println(sum);
		}
		buffer.close();
	}
	
	private static int[] counter(String s) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 97; i <= 122; i++) {
			int currTotal = 0;
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == (char) i) currTotal++;
			}
			ints.add(currTotal);
		}
		java.util.Collections.sort(ints);
		java.util.Collections.reverse(ints);
		int[] vals = new int[ints.size()];
		for (int i = 0; i < ints.size(); i++) vals[i] = ints.get(i);
		return vals;
	}
}