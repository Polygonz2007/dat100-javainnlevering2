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

		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
