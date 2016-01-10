import java.io.*;
public class ReverseAndAdd {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/ReverseAndAdd.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int reps = 0, pal = Integer.parseInt(line);
            while (!(isPal(Integer.toString(pal)))) {
            	pal = addRev(pal);
            	reps++;
            }
            System.out.println(reps + " " + pal);
        }
        buffer.close();
    }
    
    public static boolean isPal(String s) {
    	if (s.length() <= 1) return true;
    	if (s.charAt(0) == s.charAt(s.length() - 1))
    		return isPal(s.substring(1, s.length() - 1));
    	return false;
    }
    
    public static int addRev(int n) {
    	String s = "", rev = Integer.toString(n);
    	for (int i = rev.length() - 1; i >= 0; i--) {
    		s += rev.charAt(i);
    	}
    	return n + Integer.parseInt(s);
    	
    }
}