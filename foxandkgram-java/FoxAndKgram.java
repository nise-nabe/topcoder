import java.util.Arrays;

public class FoxAndKgram {

	public int maxK(int[] len) {
		Arrays.sort(len);
		int n = len.length;
		for (int max = len[n - 1] + 1 + (n > 1 ? len[n - 2] : 0); max > 0; --max) {
			boolean[] b = new boolean[n];
			int c = 0;
			for (int i = n; i-- > 0;) {
				if (!b[i]) {
					if (max == len[i]) {
						b[i] = true;
						++c;
					} else {
						for (int j = 0; j < i; ++j) {
							int len2 = len[i] + len[j];
							if (!b[j] && max - 1 == len2) {
								b[i] = b[j] = true;
								++c;
								break;
							}
						}
					}
				}
			}
			if (c >= max) {
				return max;
			}
		}
		return 0;
	}

}
