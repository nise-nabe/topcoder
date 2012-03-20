public class PrinceXToastbook {

	public double eat(int[] prerequisite) {
		int n = prerequisite.length;
		double d = 0;
		l: for (int i = 0; i < n; ++i) {
			int p = prerequisite[i], c = 1;
			while (p >= 0) {
				p = prerequisite[p];
				if (c > n) {
					continue l;
				}
				++c;
			}
			long x = 1;
			for (int j = 1; j <= c; ++j) {
				x *= j;
			}
			d += 1 / (double) x;
		}
		return d;
	}

}
