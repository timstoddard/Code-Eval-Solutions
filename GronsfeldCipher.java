import java.io.*;

public class GronsfeldCipher {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/GronsfeldCipher.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String letters = " !\"#$%&\'()*+,-./0123456789:<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(";");
			String[] raw_nums = data[0].split("");
			int[] nums = new int[raw_nums.length];
			for (int i = 0; i < raw_nums.length; i++) nums[i] = Integer.parseInt(raw_nums[i]);
			String /*dec = "",*/ enc = data[1];
			for (int i = 0; i < enc.length(); i++) {
				int index = letters.indexOf(enc.charAt(i)), currDiff = nums[i % nums.length],
						newIndex = index - currDiff < 0 ? letters.length() - (currDiff - index) : index - currDiff;
				System.out.print(letters.charAt(newIndex));
			}
			System.out.println();
		}
		buffer.close();
	}
}