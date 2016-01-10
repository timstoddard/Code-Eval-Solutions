import java.io.*;
import java.util.ArrayList;

public class NumberPairs {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/NumberPairs.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] str = line.split(";");
			if (str[0].length() > 0 && str[1].length() > 0) {
				int num = Integer.parseInt(str[1]);
				String[] data = str[0].split(",");
				int[] nums = new int[data.length];
				for (int i = 0; i < data.length; i++) nums[i] = Integer.parseInt(data[i]);
				ArrayList<int[]> pairs = new ArrayList<int[]>();
				for (int i = 0; i < nums.length; i++) {
					for (int j = 0; j < nums.length; j++) {
						if (i != j && nums[i] + nums[j] == num) {
							int[] pair = nums[i] > nums[j] ? new int[]{nums[j], nums[i]} : new int[]{nums[i], nums[j]};
							if (!alreadyContains(pairs, pair))
								pairs.add(pair);
						}
					}
				}
				if (pairs.size() > 0) {
					sort(pairs);
					for (int i = 0; i < pairs.size(); i++)
						System.out.print(pairs.get(i)[0] + "," + pairs.get(i)[1] + (i < pairs.size() - 1 ? ";" : ""));
					System.out.println();
				} else System.out.println("NULL");
			} else System.out.println("NULL");
		}
		buffer.close();
	}
	
	private static void sort(ArrayList<int[]> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size(); j++) {
				if (arr.get(j)[0] < arr.get(i)[0]) {
					int[] temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
	}
	
	private static boolean alreadyContains(ArrayList<int[]> list, int[] arr) {
		for (int[] i : list) {
			if (i[0] == arr[0] && i[1] == arr[1]) return true;
		}
		return false;
	}
}