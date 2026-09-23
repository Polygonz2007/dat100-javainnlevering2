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

		String str = "[";
		for (int i = 0; i < tabell.length; i++) {
			str += tabell[i];
			if (i != tabell.length - 1) { str += ","; }
		}
		str += "]";
		System.out.println(str);
		return str;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		System.out.println(sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) { funnet = true; }
			i++;
		}

		System.out.println(funnet ? "Funnet" : "Ikke funnet");
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) { pos = i; }
		}

		System.out.println(pos);
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int len = tabell.length;
		int[] new_table = new int[len];
		for (int i = 0; i < len; i++) {
			new_table[len - 1 - i] = tabell[i];
		}

		tilStreng(new_table);
		return new_table;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int prev = 0;
		for (int i = 0; i < tabell.length; i++) {
			int c = tabell[i];
			if (c <= prev) { return false; }
			prev = c;
		}

		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] new_table = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			new_table[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			new_table[tabell1.length + i] = tabell2[i];
		}

		return new_table;
	}
}
