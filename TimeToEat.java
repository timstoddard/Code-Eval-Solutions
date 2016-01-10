import java.io.*;

public class TimeToEat {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/TimeToEat.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] times = line.split(" ");
			for (int i = 0; i < times.length; i++) {
				for (int j = i; j < times.length; j++) {
					if (times[j].compareTo(times[i]) > 0) {
						String str = times[j];
						times[j] = times[i];
						times[i] = str;
					}
				}
			}
			for (int i = 0; i < times.length; i++) {
				System.out.print(times[i] + (i < times.length - 1 ? " " : ""));
			}
			System.out.println();
		}
		buffer.close();
	}
}