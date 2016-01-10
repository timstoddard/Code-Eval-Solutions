import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ClosestPair {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ClosestPair.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));		
		String line;
		while ((line = buffer.readLine()) != null) {
			int num = Integer.parseInt(line);
			if (num == 0) break;
			ArrayList<int[]> coords = new ArrayList<int[]>();
			for (int i = 0; i < num; i++) {
				line = buffer.readLine();
				int[] xy = new int[]{Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1])};
				coords.add(xy);
			}
			double currSmallestDist = dist(coords.get(0)[0], coords.get(0)[1], coords.get(1)[0], coords.get(1)[1]);
			for (int i = 0; i < coords.size(); i++) {
				for (int j = i + 1; j < coords.size(); j++) {
					double dist = dist(coords.get(i)[0], coords.get(i)[1], coords.get(j)[0], coords.get(j)[1]);
					if (dist < currSmallestDist) currSmallestDist = dist;
				}
			}
			System.out.println(currSmallestDist < 10000 ? new DecimalFormat("#0.0000").format(currSmallestDist) : "INFINITY");
		}		
		buffer.close();
	}
	
	private static double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}