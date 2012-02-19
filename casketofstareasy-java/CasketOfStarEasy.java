import java.util.*;

public class CasketOfStarEasy {

	Set<String> set = new HashSet<String>();

	public int maxEnergy(int[] w) {
		int max = 0;
		for (int i = 1; i < w.length - 1; ++i) {
			int[] w2 = new int[w.length - 1];
			System.arraycopy(w, 0, w2, 0, i);
			System.arraycopy(w, i + 1, w2, i, w.length - i - 1);
			max = Math.max(max, w[i - 1] * w[i + 1] + maxEnergy(w2));
		}
		return max;

	}
}
