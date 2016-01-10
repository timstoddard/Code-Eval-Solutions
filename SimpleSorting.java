import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class SimpleSorting {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/SimpleSorting.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			ArrayList<Double> nums = new ArrayList<Double>();
			for (int i = 0; i < data.length; i++) {
				nums.add(Double.parseDouble(data[i]));
			}
			Collections.sort(nums);
			for (int i = 0; i < nums.size(); i++) {
				System.out.print(new DecimalFormat("#.000").format(nums.get(i)) + (i < nums.size() - 1 ? " " : "\n"));
			}
		}
		buffer.close();
	}
}