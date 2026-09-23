package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		// get
		int height = matrise.length;
		int width = matrise[0].length;

		// Convert numbers to string and keep trac of longest
		String[][] nums = new String[height][width];
		int longest = 0;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < matrise[0].length; x++) {
				String s = Integer.toString(matrise[y][x]);
				nums[y][x] = s;
				if (longest < s.length()) { longest = s.length(); }
			}
		}

		// Set scale based of longest and create string per line
		int space = longest + 2;
		System.out.println("╭" + ("─".repeat(space) + "┬").repeat(width - 1) + "─".repeat(space) + "╮");

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.print("│ " + nums[y][x] + " ".repeat(longest - nums[y][x].length()) + " ");
			}

			if (y != height - 1)
				System.out.print("│\n├" + ("─".repeat(space) + "┼").repeat(width - 1) + "─".repeat(space) + "┤\n");
		}

		System.out.println("│\n╰" + ("─".repeat(space) + "┴").repeat(width - 1) + "─".repeat(space) + "╯");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		int height = matrise.length;
		int width = matrise[0].length;

		String str = "";
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				str += matrise[y][x];
				if (x != width - 1 ) {  str += " "; }
			}
			str += "\n";
		}

		return str;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int height = matrise.length;
		int width = matrise[0].length;

		int[][] new_matrix = new int[height][width];

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				new_matrix[y][x] = matrise[y][x] * tall;
			}
		}

		return new_matrix;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		int height = a.length;
		int width = a[0].length;

		if (height != b.length || width != b[0].length)
			return false;

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (a[y][x] != b[y][x]) return false;
			}
		}

		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int height = matrise.length;
		int width = matrise[0].length;

		int[][] new_matrix = new int[matrise.length][matrise[0].length];
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				new_matrix[y][x] = matrise[height - y - 1][width - x - 1];
			}
		}

		return new_matrix;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
