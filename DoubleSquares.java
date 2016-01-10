import java.io.*;
import java.util.ArrayList;

public class DoubleSquares {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/DoubleSquares.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int n = Integer.parseInt(line);
			for (int i = 0; i < n; i++) {
				int x = Integer.parseInt(line = buffer.readLine());
				ArrayList<int[]> pairs = new ArrayList<int[]>();
				for (int j = 0; j * j < x; j++) {
					double c = Math.sqrt(x - j * j);
					if (Math.floor(c) == c) {
						int[] temp = c > j ? new int[]{j, (int) c} : new int[]{(int) c, j};
						if (!alreadyContains(pairs, temp)) pairs.add(temp);
					}
				}
				System.out.println(pairs.size());
			}
		}
		buffer.close();
	}
	
	private static boolean alreadyContains(ArrayList<int[]> list, int[] arr) {
		for (int[] i : list) {
			if (i[0] == arr[0] && i[1] == arr[1]) return true;
		}
		return false;
	}
}