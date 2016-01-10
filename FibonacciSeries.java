import java.io.*;
public class FibonacciSeries {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/FibonacciSeries.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(fib(Integer.parseInt(line)));
        }
        buffer.close();
    }
    
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}