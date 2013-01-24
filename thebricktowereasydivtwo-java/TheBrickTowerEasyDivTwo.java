import java.util.*;

public class TheBrickTowerEasyDivTwo {

	public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
		Set<Integer> set = new HashSet<Integer>();
		int n = redCount + blueCount;
		int h = 0;
		for (int i = 0, r = 0, b = 0; i < n; ++i) {
			if (i % 2 == 0) {
				if (r < redCount) {
					h += redHeight;
					++r;
				} else {
					break;
				}
			} else {
				if (b < blueCount) {
					h += blueHeight;
					++b;
				} else {
					break;
				}
			}
			set.add(h);
		}
		h = 0;
		for (int i = 0, r = 0, b = 0; i < n; ++i) {
			if (i % 2 == 1) {
				if (r < redCount) {
					h += redHeight;
					++r;
				} else {
					break;
				}
			} else {
				if (b < blueCount) {
					h += blueHeight;
					++b;
				} else {
					break;
				}
			}
			set.add(h);
		}

		return set.size();
	}

}
