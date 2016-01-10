import java.io.*;

public class HexToDecimal {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/HexToDecimal.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int sum = 0;
			for (int i = line.length() - 1; i >= 0; i--) {
				char c = line.charAt(i);
				switch(c) {
	                case '1':sum += 1 * Math.pow(16, line.length() - i - 1); break;
	                case '2':sum += 2 * Math.pow(16, line.length() - i - 1); break;
	                case '3':sum += 3 * Math.pow(16, line.length() - i - 1); break;
	                case '4':sum += 4 * Math.pow(16, line.length() - i - 1); break;
	                case '5':sum += 5 * Math.pow(16, line.length() - i - 1); break;
	                case '6':sum += 6 * Math.pow(16, line.length() - i - 1); break;
	                case '7':sum += 7 * Math.pow(16, line.length() - i - 1); break;
	                case '8':sum += 8 * Math.pow(16, line.length() - i - 1); break;
	                case '9':sum += 9 * Math.pow(16, line.length() - i - 1); break;
	                case 'a':sum += 10 * Math.pow(16, line.length() - i - 1); break;
	                case 'b':sum += 11 * Math.pow(16, line.length() - i - 1); break;
	                case 'c':sum += 12 * Math.pow(16, line.length() - i - 1); break;
	                case 'd':sum += 13 * Math.pow(16, line.length() - i - 1); break;
	                case 'e':sum += 14 * Math.pow(16, line.length() - i - 1); break;
	                case 'f':sum += 15 * Math.pow(16, line.length() - i - 1); break;
	                default: break;
	            }
			}
			System.out.println(sum);
		}
		buffer.close();
	}
}