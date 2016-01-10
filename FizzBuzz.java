import java.io.*;
public class FizzBuzz {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/FizzBuzz.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] nums = line.split(" ");
            int x = Integer.parseInt(nums[0]), y = Integer.parseInt(nums[1]), fb = Integer.parseInt(nums[2]);
            String s = "";
            for (int i = 1; i <= fb; i++) {
            	if (i % x == 0 && i % y == 0) s += "FB ";
            	else if (i % x == 0) s += "F ";
            	else if (i % y == 0) s += "B ";
            	else s += i + " ";
            }
            System.out.println(s.substring(0, s.length() - 1));
        }
        buffer.close();
    }
}