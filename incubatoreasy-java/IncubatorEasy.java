import java.util.*;

public class IncubatorEasy {

	public int maxMagicalGirls(String[] love) {
		int n = love.length;
		boolean[] a = new boolean[n];
		Arrays.fill(a, true);
		l: for (int i = 0; i < n; ++i) {
			boolean[] b = new boolean[n];
			Stack<Integer> s = new Stack<Integer>();
			s.push(i);
			while (s.size() > 0) {
				int p = s.pop();
				b[p] = true;
				for (int j = 0; j < n; ++j) {
					if (love[p].charAt(j) == 'Y') {
						if (p != j) {
							if (b[j]) {
								continue l;
							}
							s.push(j);
						}
					}
				}
			}
			a[i] = false;
		}
		System.out.println(Arrays.toString(a));
		boolean[] c = new boolean[n];
		for (int i = 0; i < n; ++i) {
			if (!a[i]) {
				Stack<Integer> s = new Stack<Integer>();
				s.push(i);
				while (s.size() > 0) {
					int p = s.pop();
					if (i == p && love[i].charAt(p) == 'Y') {
						c[i] = true;
						continue;
					}
					for (int j = 0; j < n; ++j) {
						if (!c[j] && love[p].charAt(j) == 'Y') {
							s.push(j);
							c[j] = true;
						}
					}
				}
			}
		}
		int result = 0;
		for (int i = 0; i < n; ++i) {
			result += c[i] || a[i] ? 0 : 1;
		}
		return result;
	}
}
