import java.io.*;
public class FileSize {
    public static void main (String[] args) throws IOException {
        File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/FileSize.txt");
        System.out.println(file.length());
    }
}