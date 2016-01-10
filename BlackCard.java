import java.io.*;
import java.util.ArrayList;

public class BlackCard {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/BlackCard.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			ArrayList<String> names = new ArrayList<String>();
			for (int i = 0; i < data.length - 2; i++) names.add(data[i]);
			int num = Integer.parseInt(data[data.length - 1]);
			while (names.size() > 1) {
				int index = 0;
				for (int i = 0; i < num - 1; i++) {
					index++;
					if (index >= names.size()) index = 0;
				}
				names.remove(index);
			}
			System.out.println(names.get(0));
		}
		buffer.close();
	}
}