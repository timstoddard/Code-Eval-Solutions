import java.io.*;
public class RemoveCharacters {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/RemoveCharacters.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(",");
            char[] c = s[1].trim().toCharArray();
            String scrubbed = "";
            for (int i = 0; i < s[0].length(); i++) {
            	for (int j = 0; j < c.length; j++) {
            		if (s[0].charAt(i) == c[j]) {break;}
            		else if (j == c.length - 1) {scrubbed += s[0].charAt(i); break;}
            	}
            }
            System.out.println(scrubbed);
        }
        buffer.close();
    }
}