import java.io.*;
public class ReverseGroups {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ReverseGroups.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        //int l = 1;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int split = line.indexOf(';');
            int k = Integer.parseInt(line.substring(split + 1));
            String[] s = line.substring(0, split).split(",");
            for (int i = 0; i <= s.length - k; i+= k) {
            	for(int j = 0; j < k / 2; j++) {
            	    String temp = s[i + j];
            	    s[i + j] = s[i + k - j - 1];
            	    s[i + k - j - 1] = temp;
            	}
            }
            String str = "";
            for (int i = 0; i < s.length; i++) {
            	str += s[i] + (i < s.length - 1 ? "," : "");
            }
            System.out.println(str);
        }
        buffer.close();
    }
}