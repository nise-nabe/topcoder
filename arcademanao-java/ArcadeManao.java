import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class ArcadeManao {

	public int shortestLadder(String[] level, int coinRow, int coinColumn) {
		List<List<int[]>> list = new ArrayList<List<int[]>>();
		int n = level.length, m = level[0].length();
		int[][] a = new int[n][m];
		int t = 0, target = 99;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				char c = level[i].charAt(j);
				if (c == 'X') {
					if (j > 0 && a[i][j - 1] > 0) {
						a[i][j] = t;
					} else {
						a[i][j] = ++t;
					}
					if (i == coinRow - 1 && j == coinColumn - 1){
						target = a[i][j];
					}
				} else {
					++t;
				}
			}
		}
		for (int i = 0; i <= t; ++i) {
			list.add(new ArrayList<int[]>());
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (a[i][j] > 0) {
					for (int k = i - 1; k >= 0; --k) {
						if (a[k][j] > 0) {
							boolean b = true;
							for (int[] list2 : list.get(a[i][j])) {
								if (list2[0] == a[k][j]) {
									list2[1] = Math.min(list2[1],
											Math.abs(k - i));
									b = false;
								}
							}
							if (b) {
								list.get(a[i][j]).add(
										new int[] { a[k][j], Math.abs(k - i) });
							}
							break;
						}
					}
					for (int k = i + 1; k < n; ++k) {
						if (a[k][j] > 0) {
							boolean b = true;
							for (int[] list2 : list.get(a[i][j])) {
								if (list2[0] == a[k][j]) {
									list2[1] = Math.min(list2[1],
											Math.abs(k - i));
									b = false;
								}
							}
							if (b) {
								list.get(a[i][j]).add(
										new int[] { a[k][j], Math.abs(k - i) });
							}
							break;
						}
					}

				}
			}
		}

		PriorityQueue<int[]> q = new PriorityQueue<int[]>(10,
				new Comparator<int[]>() {
					public int compare(int[] o1, int[] o2) {
						return o1[1] - o2[1];
					}
				});
		q.add(new int[] { a[n - 1][m - 1], 0 });
		Set<Integer> set = new HashSet<Integer>();
		while (!q.isEmpty()) {
			int[] p = q.poll();
			if (target == p[0]) {
				return p[1];
			}
			set.add(p[0]);
			for (int[] x : list.get(p[0])) {
				if (!set.contains(x[0]))
					q.add(new int[] { x[0], Math.max(p[1], x[1]) });
			}
		}
		return 0;
	}

}
