import java.io.*;

public class EmailValidation {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/EmailValidation.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		//int l = 1;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int at = line.lastIndexOf('@'), dot = line.lastIndexOf('.');
			if (line.length() >= 5 && at >= 1 && dot >= 3 && dot > at) {
				boolean badEmail = false;
				String begin = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
				String local = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#-_~!$&'()*+,;=:.";
				String domain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-";
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (i == 0) {
						if (c == '\"') {
							int end = 0;
							for (int j = at - 1; j > 0; j--) {
								if (line.charAt(j) == '\"') {
									end = j;
									break;
								}
							}
							if (end > 0) i = at + 1;
						} else if (!begin.contains(c+"")) {
							System.out.println("false");
							badEmail = true;
							break;
						}
					} else if (i > 0 && i < at) {
						if (!local.contains(c+"")) {
							System.out.println("false");
							badEmail = true;
							break;
						}
					} else if (i > at) {
						if (!domain.contains(c+"")) {
							System.out.println("false");
							badEmail = true;
							break;
						}
					}
				}
				if (!badEmail) System.out.println("true");
			} else System.out.println("false");
		}
		buffer.close();
	}
}