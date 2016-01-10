import java.io.*;

public class SumOfIntegers {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/SumOfIntegers.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(",");
			int[] nums = new int[data.length];
			for (int i = 0; i < data.length; i++) {
				nums[i] = Integer.parseInt(data[i]);
			}
			/*int currSum = 0, maxSum = Integer.MIN_VALUE;
			for (int i = 0; i < nums.length; i++) {
				for (int j = nums.length; j > i; j--) {
					for (int k = i; k < j; k++) {
						currSum += nums[k];
					}
					if (currSum > maxSum) {
						maxSum = currSum;
					}
					currSum = 0;
				}
			}
			System.out.println(maxSum);*/
			
			// dynamic programming
			int currMax = nums[0], maxSum = currMax;
			for (int i = 1; i < nums.length; i++) {
				currMax = Math.max(currMax + nums[i], nums[i]);
				maxSum = currMax > maxSum ? currMax : maxSum;
			}
			System.out.println(maxSum);
		}
		buffer.close();
	}
}