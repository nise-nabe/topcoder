public class SkiResortsEasy {

	public int minCost(int[] altitude) {
		int n = altitude.length, result = 0;
		for (int i = 1; i < n; ++i) {
			if (altitude[i - 1] < altitude[i]) {
				result += altitude[i] - altitude[i - 1];
				altitude[i] = altitude[i - 1];
			}
		}
		return result;
	}

}
