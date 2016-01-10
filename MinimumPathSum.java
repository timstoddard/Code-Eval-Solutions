import java.io.*;

public class MinimumPathSum {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/MinimumPathSum.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int n = Integer.parseInt(line);
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				String[] data = buffer.readLine().split(",");
				for (int j = 0; j < n; j++) {
					matrix[i][j] = Integer.parseInt(data[j]);
				}
			}
			
			// start with the right and bottom sides
			for (int i = n - 2; i >= 0; i--) {
				matrix[i][n - 1] += matrix[i + 1][n - 1];
				matrix[n - 1][i] += matrix[n - 1][i + 1];
			}
			
			// do the rest of the matrix
			for (int i = n - 2; i  >= 0; i--) {
				for (int j = n - 2; j  >= 0; j--) {
					matrix[i][j] += Math.min(matrix[i][j + 1], matrix[i + 1][j]);
				}
			}
			
			System.out.println(matrix[0][0]);
		}
		buffer.close();
	}
}