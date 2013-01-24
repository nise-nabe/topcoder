public class MonstersValley2 {

	public int minimumPrice(int[] dread, int[] price) {
		int n = dread.length;
		long[][] sums = new long[2][n * 3];
		sums[0][price[0]] = dread[0];
		for (int i = 1; i < n; ++i) {
			for (int j = 0; j < n * 3; ++j) {
				if (sums[0][j] > 0) {
					if (dread[i] <= sums[0][j]) {
						sums[1][j] = Math.max(sums[1][j], sums[0][j]);
					}
					sums[1][j + price[i]] = sums[0][j] + dread[i];
				}
			}
			sums[0] = sums[1];
			sums[1] = new long[n * 3];
		}

		for (int i = 0; i < n * 3; ++i) {
			if (sums[0][i] > 0) {
				return i;
			}
		}
		return n;
	}
}
