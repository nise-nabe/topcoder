public class SurroundingGameEasy {

	public int score(String[] cost, String[] benefit, String[] stone) {
		int n = stone.length, m = stone[0].length();
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			l: for (int j = 0; j < m; ++j) {
				if (stone[i].charAt(j) == 'o') {
					sum += benefit[i].charAt(j) - cost[i].charAt(j);
				} else {
					for (int[] is : new int[][] { { i - 1, j }, { i + 1, j },
							{ i, j - 1 }, { i, j + 1 } }) {
						if (is[0] >= 0 && is[0] < n && is[1] >= 0 && is[1] < m
								&& stone[is[0]].charAt(is[1]) == '.') {
							continue l;
						}
					}
					sum += benefit[i].charAt(j) - '0';
				}
			}
		}
		return sum;
	}

}
