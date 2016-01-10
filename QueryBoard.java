import java.io.*;

public class QueryBoard {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/QueryBoard.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int dimension = 256;
		int[][] matrix = new int[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				matrix[0][0] = 0;
			}
		}
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			if (data[0].equals("SetRow")) {
				for (int i = 0; i < dimension; i++) {
					matrix[Integer.parseInt(data[1])][i] = Integer.parseInt(data[2]);
				}
			} else if (data[0].equals("SetCol")) {
				for (int i = 0; i < dimension; i++) {
					matrix[i][Integer.parseInt(data[1])] = Integer.parseInt(data[2]);
				}
			} else if (data[0].equals("QueryRow")) {
				int sum = 0;
				for (int i = 0; i < dimension; i++) {
					sum += matrix[Integer.parseInt(data[1])][i];
				}
				System.out.println(sum);
			} else if (data[0].equals("QueryCol")) {
				int sum = 0;
				for (int i = 0; i < dimension; i++) {
					sum += matrix[i][Integer.parseInt(data[1])];
				}
				System.out.println(sum);
			}
		}
		buffer.close();
	}
}