import java.io.*;

public class ChardonnayOrCabernet {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ChardonnayOrCabernet.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			String[] wines = new String[data.length - 2];
			for (int i = 0; i < wines.length; i++) wines[i] = data[i];
			String letters = data[data.length - 1];
			String remembered = "";
			for (int i = 0; i < wines.length; i++ ) {
				if (hasLetters(wines[i], letters))
					remembered += wines[i] + " ";
			}
			System.out.println(remembered.length() > 0 ? remembered.trim() : "False");
		}
		buffer.close();
	}
	
	private static boolean hasLetters(String name, String letters) {
		if (letters.length() > name.length()) return false;
		if (letters.length() == 0) return true;
		if (name.toLowerCase().contains(letters.charAt(0) + "")) return hasLetters(name, letters.substring(1));
		else return false;
	}
}