import java.io.*;
import java.util.ArrayList;

public class ArrayAbsurdity {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ArrayAbsurdity.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] str = line.split(";");
			String[] data = str[1].split(",");
			ArrayList<String> nums = new ArrayList<String>();
			for (String s : data) nums.add(s);
			java.util.Collections.sort(nums);
			for (int i = 0; i < nums.size() - 1; i++) {
				if (nums.get(i).equals(nums.get(i + 1))) System.out.println(nums.get(i));
			}
		}
		buffer.close();
	}
}