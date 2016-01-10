import java.awt.Point;
import java.io.*;

public class FindASquare {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/FindASquare.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			for (int i = 0; i < data.length; i++) {
				data[i] = data[i].substring((data[i].indexOf('(') + 1), data[i].indexOf(')'));
			}
			Point[] ps = new Point[4];
			for (int i = 0; i < 4; i++) ps[i] = new Point(Integer.parseInt(data[i].split(",")[0]), Integer.parseInt(data[i].split(",")[1]));
			double d1 = ps[0].distance(ps[1]), d2 = ps[0].distance(ps[2]), d3 = ps[0].distance(ps[3]);
			if (d1 > d2 && d1 > d3) {
				if (d2 == d3) System.out.println("true");
			} else if (d2 > d1 && d2 > d3) {
				if (d1 == d3) System.out.println("true");
			} else if (d3 > d1 && d3 > d2) {
				if (d1 == d2) System.out.println("true");
			} else System.out.println("false");
			
			
			
			
		}
		buffer.close();
	}
}



//boolean b1 = xy[0] == xy[1] && xy[2] == xy[3] && ((xy[4] == xy[6] && xy[5] == xy[7]) || (xy[4] == xy[7] && xy[5] == xy[6]));
//boolean b2 = xy[0] == xy[2] && xy[1] == xy[3] && ((xy[4] == xy[5] && xy[6] == xy[7]) || (xy[4] == xy[7] && xy[5] == xy[6]));
//boolean b3 = xy[0] == xy[3] && xy[1] == xy[2] && ((xy[4] == xy[5] && xy[6] == xy[7]) || (xy[4] == xy[6] && xy[5] == xy[7]));
//System.out.println(b1 || b2 || b3);