import java.io.*;

public class BalancedSmileys {
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/BalancedSmileys.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			System.out.println((isBalanced(line)));
		}
		buffer.close();
	}
	
	private static String isBalanced(String s) {
		return "";
	}

	// super cool solution found online
/*	private static String isBalanced(String s) {
	    int minOpen = 0, maxOpen = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == '(') {
	            maxOpen += 1;
	            if (i == 0 || s.charAt(i - 1) != ':') minOpen += 1;
	        } else if (s.charAt(i) == ')') {
	            minOpen = Math.max(0, minOpen - 1);
	            if (i == 0 || s.charAt(i-1) != ':') {
	                maxOpen -= 1;
	                if (maxOpen < 0) break;
	            }
            }
	    }
	    if (maxOpen >= 0 && minOpen == 0) return "YES";
	    else return "NO";
	} // */
}