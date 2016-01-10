import java.io.*;

public class NumberOfOnes {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/NumberOfOnes.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String bin = Integer.toBinaryString(Integer.parseInt(line));
			int ones = 0; 
			for (int i = 0; i < bin.length(); i++)
				if (bin.charAt(i) == '1') ones++;
			System.out.println(ones);
		}
		buffer.close();
	}
}