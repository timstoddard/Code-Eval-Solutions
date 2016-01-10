public class MultiplicationTables {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				int curr = i * j, len = Integer.toString(curr).length();
				if (j > 1) {
					for (int k = 0; k < 4 - len; k++)
						System.out.print(" ");
				} else {
					if (i < 10) System.out.print(" ");
				}
				System.out.print(curr);
			}
			System.out.print("\n");
		}
	}
}