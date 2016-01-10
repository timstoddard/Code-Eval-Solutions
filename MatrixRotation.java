import java.io.*;

public class MatrixRotation {
    public static void main (String[] args) throws IOException {
        File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/MatrixRotation.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String noSpaces = "";
            for (int i = 0; i < line.length(); i++) {if (!(line.charAt(i) == ' ')) noSpaces += line.charAt(i);}
            int len = (int)Math.sqrt(noSpaces.length());
            char [][] arr = new char[len][len];
            for (int i = 0; i < arr.length; i++) {
            	for (int j = 0; j < arr.length; j++) {
            		arr[i][j] = noSpaces.charAt(i * len + j);
            	}
            }
            arr = rotate(arr);
            String s = "";
            for (int i = 0; i < arr.length; i++) {
            	for (int j = 0; j < arr.length; j++) {
            		s += arr[i][j] + " ";
            	}
            }
            System.out.println(s.substring(0, s.length() - 1));
        }
        buffer.close();
    }
    
    public static char[][] rotate(char[][] arr) {
		int x = 0, l = arr.length - 1, num = arr.length - 1;
		for (int c = 0; c < arr.length / 2; c++) {
			for (int i = 0; i < num; i++) {
				char temp = arr[x][x + i];
				arr[x][x + i] = arr[l - (x + i)][x];
				arr[l - (x + i)][x] = arr[l - c][l - (x + i)];
				arr[l - c][l - (x + i)] = arr[x + i][l - c];
				arr[x + i][l - c] = temp;
			}
			x++;
			num -= 2;
		}
		return arr;
	}
}