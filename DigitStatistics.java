import java.io.*;
import java.math.BigInteger;

public class DigitStatistics {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/DigitStatistics.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			int a = Integer.parseInt(data[0]);
			BigInteger n = new BigInteger(data[1]);
			BigInteger[] output = new BigInteger[10];
			for (int i = 0; i < output.length; i++) output[i] = BigInteger.ZERO;
			switch (a) {
			case 2: {
				BigInteger times = n.divide(new BigInteger(Integer.toString(4)));
				int leftover = (int) Integer.parseInt(n.mod(new BigInteger(Integer.toString(4))).toString());
				output[2] = output[2].add(times);
				output[4] = output[4].add(times);
				output[8] = output[8].add(times);
				output[6] = output[6].add(times);
				if (leftover > 2) output[8] = output[8].add(BigInteger.ONE);
				if (leftover > 1) output[4] = output[4].add(BigInteger.ONE);
				if (leftover > 0) output[2] = output[2].add(BigInteger.ONE);
				break;}
			case 3: {
				BigInteger times = n.divide(new BigInteger(Integer.toString(4)));
				int leftover = (int) Integer.parseInt(n.mod(new BigInteger(Integer.toString(4))).toString());
				output[3] = output[3].add(times);
				output[9] = output[9].add(times);
				output[7] = output[7].add(times);
				output[1] = output[1].add(times);
				if (leftover > 2) output[7] = output[7].add(BigInteger.ONE);
				if (leftover > 1) output[9] = output[9].add(BigInteger.ONE);
				if (leftover > 0) output[3] = output[3].add(BigInteger.ONE);
				break;}
			case 4: {
				BigInteger times = n.divide(new BigInteger(Integer.toString(2)));
				int leftover = (int) Integer.parseInt(n.mod(new BigInteger(Integer.toString(2))).toString());
				output[4] = output[4].add(times);
				output[6] = output[6].add(times);
				if (leftover > 0) output[4] = output[4].add(BigInteger.ONE);
				break;}
			case 5: {
				output[5] = output[5].add(n);
				break;}
			case 6: {
				output[6] = output[6].add(n);
				break;}
			case 7: {
				BigInteger times = n.divide(new BigInteger(Integer.toString(4)));
				int leftover = (int) Integer.parseInt(n.mod(new BigInteger(Integer.toString(4))).toString());
				output[7] = output[7].add(times);
				output[9] = output[9].add(times);
				output[3] = output[3].add(times);
				output[1] = output[1].add(times);
				if (leftover > 2) output[3] = output[3].add(BigInteger.ONE);
				if (leftover > 1) output[9] = output[9].add(BigInteger.ONE);
				if (leftover > 0) output[7] = output[7].add(BigInteger.ONE);
				break;}
			case 8: {
				BigInteger times = n.divide(new BigInteger(Integer.toString(4)));
				int leftover = (int) Integer.parseInt(n.mod(new BigInteger(Integer.toString(4))).toString());
				output[8] = output[8].add(times);
				output[4] = output[4].add(times);
				output[2] = output[2].add(times);
				output[6] = output[6].add(times);
				if (leftover > 2) output[2] = output[2].add(BigInteger.ONE);
				if (leftover > 1) output[4] = output[4].add(BigInteger.ONE);
				if (leftover > 0) output[8] = output[8].add(BigInteger.ONE);
				break;}
			case 9: {
				BigInteger times = n.divide(new BigInteger(Integer.toString(2)));
				int leftover = (int) Integer.parseInt(n.mod(new BigInteger(Integer.toString(2))).toString());
				output[9] = output[9].add(times);
				output[1] = output[1].add(times);
				if (leftover > 0) output[9] = output[9].add(BigInteger.ONE);
				break;}
			}
			
			for (int i = 0; i < output.length; i++)
				System.out.print(i + ": " + output[i] + (i < output.length - 1 ? ", " : ""));
			System.out.println();
		}
		buffer.close();
	}
}