import java.io.*;

public class GameOfLife {
	public static void main(String[] args) throws IOException {
		File file = new File(/* args[0] */"/Users/timstoddard/Dropbox/school/homestead/Comp Sci Ap/ava/workspace/CodeEval/GameOfLife.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line = buffer.readLine();
		String[][] board = new String[line.length()][line.length()];
		board[0] = line.split("");
		int count = 1;
		while ((line = buffer.readLine()) != null) {board[count] = line.split(""); count++;}
		for (int i = 0; i < 10; i++) board = iterate(board);
		for (String[] str : board) {for (String s : str) System.out.print(s); System.out.println();}
		buffer.close();
	}
	
	private static String[][] iterate(String[][] board) {
		String[][] newBoard = new String[board.length][board.length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int n = getNeighbors(board, i, j);
				if (n < 2) newBoard[i][j] = ".";
				else if (n == 2) {
					if (board[i][j].equals("*")) newBoard[i][j] = "*";
					else newBoard[i][j] = ".";
				} else if (n == 3) newBoard[i][j] = "*";
				else if (n > 3) newBoard[i][j] = ".";
			}
		}
		return newBoard;
	}
	
	private static int getNeighbors(String[][] board, int x, int y) {
		int count = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (!(i == x && j == y) && isValidPoint(board.length, i, j) && board[i][j].equals("*")) count++;
			}
		}
		return count;
	}
	
	private static boolean isValidPoint(int len, int x, int y) {
		return x >= 0 && y >= 0 && x < len && y < len;
	}
}