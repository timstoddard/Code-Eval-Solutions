import java.io.*;

public class SpiralPrinting {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/SpiralPrinting.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(";");
			int rows = Integer.parseInt(data[0]), cols = Integer.parseInt(data[1]);
			if (rows > 1 && cols > 1) {
				String[] str = data[2].split(" ");
				String[][] matrix = new String[rows][cols];
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						matrix[i][j] = str[i * cols + j];
					}
				}
				//boolean right = true, left = false, down = false, up = false;
				
				System.out.println();
			} else {
				System.out.print(data[2]);
			}
			System.out.println();
		}
		buffer.close();
	}
}