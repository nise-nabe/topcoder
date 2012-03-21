import java.util.*;

public class EvenRoute {

	public String isItPossible(int[] x, int[] y, int wantedParity) {
		w = wantedParity;
		n = x.length;
		a = new int[n + 1][n + 1];
		this.x = new int[n + 1];
		this.y = new int[n + 1];
		for (int i = 0; i < n; ++i) {
			this.x[i + 1] = x[i];
			this.y[i + 1] = y[i];
		}
		b = new boolean[n + 1];
		for (int i = 0; i < n; ++i) {
			a[i + 1][0] = a[0][i + 1] = Math.abs(x[i]) + Math.abs(y[i]);
			for (int j = 0; j < n; ++j) {
				a[i + 1][j + 1] = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
			}
		}
		list.add(0);
		return f(0, 0) ? "CAN" : "CANNOT";
	}

	int n, w;
	int[] x, y;
	int[][] a;
	boolean[] b;
	int c = 0;
	Set<Integer> map = new HashSet<Integer>();
	List<Integer> list = new ArrayList<Integer>();

	boolean f(int sum, int p) {
		if (list.size() == n) {
			return sum % 2 == w;
		}
		if (map.contains(list.hashCode())) {
			return false;
		}
		for (int i = 1; i <= n; ++i) {
			if (!b[i]) {
				b[i] = true;
				list.add(i);
				if (f(sum + a[p][i], i)) {
					return true;
				}
				b[i] = false;
				list.remove(list.size()-1);
			}
		}
		map.add(list.hashCode());
		return false;
	}
}
