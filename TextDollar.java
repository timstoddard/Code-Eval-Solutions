import java.io.*;

public class TextDollar {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/TextDollar.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int n = Integer.parseInt(line);
			System.out.println(toText(n));
		}
		buffer.close();
	}
	
	private static String toText(int n) {
		String text = "";
		text += hundText(n / 1000000) + (n >= 1000000 ? "Million" : "");
		String toS = Integer.toString(n);
		if (n >= 1000000) toS = toS.substring(toS.length() - 6, toS.length() - 3);
		text += hundText((n % 1000000) / 1000) + (toS.equals("000") ? "" : (n >= 1000 ? "Thousand" : ""));
		text += hundText((n % 1000000) % 1000) + (n == 1 ? "Dollar" : "Dollars");
		return text;
	}
	
	private static String hundText(int n) {
		String text = "";
		switch (n / 100) {
		case 1: {text += "OneHundred"; break;}
		case 2: {text += "TwoHundred"; break;}
		case 3: {text += "ThreeHundred"; break;}
		case 4: {text += "FourHundred"; break;}
		case 5: {text += "FiveHundred"; break;}
		case 6: {text += "SixHundred"; break;}
		case 7: {text += "SevenHundred"; break;}
		case 8: {text += "EightHundred"; break;}
		case 9: {text += "NineHundred"; break;}
		}
		boolean hasTeen = false;
		switch ((n % 100) / 10) {
		case 1: {
			switch (n % 100) {
			case 10: {text += "Ten"; hasTeen = true; break;}
			case 11: {text += "Eleven"; hasTeen = true; break;}
			case 12: {text += "Twelve"; hasTeen = true; break;}
			case 13: {text += "Thirteen"; hasTeen = true; break;}
			case 14: {text += "Fourteen"; hasTeen = true; break;}
			case 15: {text += "Fifteen"; hasTeen = true; break;}
			case 16: {text += "Sixteen"; hasTeen = true; break;}
			case 17: {text += "Seventeen"; hasTeen = true; break;}
			case 18: {text += "Eighteen"; hasTeen = true; break;}
			case 19: {text += "Nineteen"; hasTeen = true; break;}
			}
			break;
		}
		case 2: {text += "Twenty"; break;}
		case 3: {text += "Thirty"; break;}
		case 4: {text += "Forty"; break;}
		case 5: {text += "Fifty"; break;}
		case 6: {text += "Sixty"; break;}
		case 7: {text += "Seventy"; break;}
		case 8: {text += "Eighty"; break;}
		case 9: {text += "Ninety"; break;}
		}
		if (!hasTeen) {
			switch (n % 10) {
			case 1: {text += "One"; break;}
			case 2: {text += "Two"; break;}
			case 3: {text += "Three"; break;}
			case 4: {text += "Four"; break;}
			case 5: {text += "Five"; break;}
			case 6: {text += "Six"; break;}
			case 7: {text += "Seven"; break;}
			case 8: {text += "Eight"; break;}
			case 9: {text += "Nine"; break;}
			}
		}
		return text;
	}
}