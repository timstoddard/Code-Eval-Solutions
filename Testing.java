import java.io.*;

public class Testing {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/Testing.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split("\\|");
			String dev = data[0].trim(), design = data[1].trim();
			int bugs = 0;
			bugs += Math.abs(dev.length() - design.length());
			for (int i = 0; i < Math.min(dev.length(), design.length()); i++)
				if (dev.charAt(i) != design.charAt(i)) bugs++;
			if (bugs == 0) System.out.println("Done");
			else if (bugs <= 2) System.out.println("Low");
			else if (bugs <= 4) System.out.println("Medium");
			else if (bugs <= 6) System.out.println("High");
			else System.out.println("Critical");
		}
		buffer.close();
	}
}