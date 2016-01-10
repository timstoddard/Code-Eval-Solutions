import java.io.*;

public class RoboAndRobitta {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		File file = new File(/*args[0]*/"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/RoboAndRobitta.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] data = line.split(" ");
			String[] nums = new String[] {data[0].split("x")[0], data[0].split("x")[1], data[2], data[3]};
			int rows = Integer.parseInt(nums[0]), cols = Integer.parseInt(nums[1]), x = Integer.parseInt(nums[2]) - 1, y = Integer.parseInt(nums[3]) - 1;
			boolean[][] board = new boolean[rows][cols];
			for (boolean[] b : board)
				for (boolean v : b)
					v = false;
			int[] currPos = new int[] {0, 0};
			boolean foundRobitta = false, right = true, left = false, down = false, up = false;
			int steps = 0;
			while(!foundRobitta) {
				System.out.println(currPos[0] +"  "+currPos[1]);
				board[currPos[0]][currPos[1]] = true;
				if (right) {
					if (currPos[0] < cols - 1 && !board[currPos[0] + 1][currPos[1]]) {
						currPos[0]++;
						steps++;
					} else {
						currPos[1]++;
						steps++;
						right = false; left = false; down = true; up = false;
					}
				} else if (left) {
					if (currPos[0] > 0 && !board[currPos[0] - 1][currPos[1]]) {
						currPos[1]--;
						steps++;
					} else {
						currPos[0]--;
						steps++;
						right = false; left = false; down = false; up = true;
					}
				} else if (down) {
					if (currPos[0] < rows - 1 && !board[currPos[0] + 1][currPos[1]]) {
						currPos[0]++;
						steps++;
					} else {
						currPos[1]--;
						steps++;
						right = false; left = true; down = false; up = true;
					}
				} else if (up) {
					if (currPos[0] > 0 && !board[currPos[0] - 1][currPos[1]]) {
						currPos[0]--;
						steps++;
					} else {
						currPos[1]++;
						steps++;
						right = true; left = false; down = false; up = false;
					}
				}
				if (currPos[0] == x && currPos[1] == y) foundRobitta = true;
				if (steps > 20) break;
			}
			System.out.println(steps);
		}
		buffer.close();
	}
	
	@SuppressWarnings("unused")
	private static boolean foundRobitta(int[][] board) {
		return !false;
	}
}