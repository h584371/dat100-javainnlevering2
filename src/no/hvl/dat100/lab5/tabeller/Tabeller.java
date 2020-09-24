package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		
		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length - 1) {
				System.out.print(tabell[i] + ", ");
			} else {
				System.out.print(tabell[i]);
			}
		} 
		
		System.out.println("]");
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length - 1) {
				streng += tabell[i] + ",";
			} else {
				streng += tabell[i];
			}
		}
		streng += "]";
		return streng;
		// TODO
		// throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		int i = 0;
		while (i < tabell.length) {
			
			sum += tabell[i];
			
			i++;
		}
//		for (int j : tabell) {
//			sum += j;
//		}
		
//		for (int k = 0; k < tabell.length; k++) {
//			sum += tabell[k];
//		}
		return sum;
		// TODO
		// throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		return false;
		
		// TODO
		// throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
