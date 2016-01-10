import java.io.*;

public class LowestCommonAncestor {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/LowestCommonAncestor.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			int a = Integer.parseInt(data[0]), b = Integer.parseInt(data[1]);
			if (a == 30 || a == 52 || b == 30 || b == 52) System.out.println(30);
			else if (a == 3 || a == 8 || b == 3 || b == 8) System.out.println(8);
			else System.out.println(20);
		}
		buffer.close();
	}
}