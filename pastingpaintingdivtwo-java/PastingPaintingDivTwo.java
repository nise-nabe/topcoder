public class PastingPaintingDivTwo {

	public long countColors(String[] clipboard, int T) {
		int n = clipboard.length, m = clipboard[0].length();
		int max = Math.max(n, m);
		char[][] cs = new char[n + max][m + max];
		for (int i = 0; i < n + n; ++i) {
			java.util.Arrays.fill(cs[i], '.');
		}

		long result = 0L, sub = 0L;
		for (int t = 0; t < T; ++t) {
			if (t >= max) {
				result += sub * (T - max);
				break;
			}
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < m; ++j) {
					cs[i + t][j + t] = (char) Math.max(cs[i + t][j + t],
							clipboard[i].charAt(j));
				}
			}
			int sum = 0;
			for (int i = 0; i < n + t; ++i) {
				for (int j = 0; j < m + t; ++j) {
					sum += cs[i][j] == 'B' ? 1 : 0;
				}
			}
			sub = sum - result;
			result = sum;
		}

		return result;
	}
}
