package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		// get
		int length = tabell.length;
		if (length == 0) {
			System.out.print("Emoty table");
			return;
		}

		// Convert numbers to string and keep trac of longest
		String[] nums = new String[length];
		int longest = 0;
		for (int y = 0; y < length; y++) {
			String s = Integer.toString(tabell[y]);
			nums[y] = s;
			if (longest < s.length()) { longest = s.length(); }
		}

		// Set scale based of longest and create string per line
		int space = longest + 2;
		System.out.println("╭" + ("─".repeat(space) + "┬").repeat(length - 1) + "─".repeat(space) + "╮");

		for (int y = 0; y < length; y++) {
			System.out.print("│ " + nums[y] + " ".repeat(longest - nums[y].length()) + " ");
		}

		System.out.println("│\n╰" + ("─".repeat(space) + "┴").repeat(length - 1) + "─".repeat(space) + "╯");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
