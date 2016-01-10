import java.io.*;

public class PointInCircle {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/PointInCircle.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(";");
			for (int i = 0; i < data.length; i++) data[i] = convertToNums(data[i]);
			double cX = Double.parseDouble(data[0].split(",")[0]),
					cY = Double.parseDouble(data[0].split(",")[1]),
					r = Double.parseDouble(data[1]),
					pX = Double.parseDouble(data[2].split(",")[0]),
					pY = Double.parseDouble(data[2].split(",")[1]);
			System.out.println((Math.sqrt(Math.pow(cX - pX, 2) + Math.pow(cY - pY, 2)) < r));
		}
		buffer.close();
	}
	
	private static String convertToNums(String str) {
		String theGoodStuff = "";
		for (int i = 0; i < str.length(); i++) {
			String contains = "0123456789.-,";
			if (contains.contains(str.charAt(i) + "")) theGoodStuff += str.charAt(i);
		}
		return theGoodStuff;
	}
}