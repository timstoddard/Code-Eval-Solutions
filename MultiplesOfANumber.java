import java.io.*;
public class MultiplesOfANumber {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/MultiplesOfANumber.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(",");
            int x = Integer.parseInt(s[0]), n = Integer.parseInt(s[1]);
            for (int i = 0; ; i++) {
            	if (i * n >= x) {
            		System.out.println(n * i);
            		break;
            	}
            }
        }
        buffer.close();
    }
}