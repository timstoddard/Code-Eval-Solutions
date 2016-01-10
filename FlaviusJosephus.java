import java.io.*;
import java.util.ArrayList;

public class FlaviusJosephus {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/FlaviusJosephus.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int n = Integer.parseInt(line.split(",")[0]), m = Integer.parseInt(line.split(",")[1]);
			ArrayList<String> nums = new ArrayList<String>();
			ArrayList<Integer> killed = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) nums.add(i + "");
			int index = m - 1, len = nums.size();
			while (len > 0) {
				len = nums.size();
				System.out.print(nums.get(index) + (len > 1 ? " " : ""));
				killed.add(index);
				
				if (index + m > len) {
					index = m - 1 - ((len - 1) - index);
					for (int i = killed.size() - 1; i >= 0; i--)
						nums.remove(killed.get(i));
					killed.clear();
				} else index += m;
			}
			System.out.println();
		}
		buffer.close();
	}

}