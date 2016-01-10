import java.io.*;
public class ReverseWords {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ReverseWords.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(" ");
            for (int i = 0; i < s.length / 2; i++) {
            	String temp = s[i];
            	s[i] = s[s.length - 1 - i];
            	s[s.length - 1 - i] = temp;
            }
            String str = "";
            for (int i = 0; i < s.length; i++) str += s[i] + " ";
            System.out.println(str.trim());
        }
        buffer.close();
    }
}