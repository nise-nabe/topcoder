import fj.F;
import fj.data.List;

public class TheFrog {

	public double getMinimum(int D, int[] L, int[] R) {
		List<int[]> LR = List.list();
		for (int i = 0; i < L.length; ++i) {
			LR = LR.cons(new int[] { L[i], R[i] });
		}

		double min = Double.MAX_VALUE;
		for (int x : R) {
			min = Math.min(min, go(LR, x));
		}
		return min;
	}

	private double go(List<int[]> LR, final int x) {
		if (!ok(LR, x, 1)) {
			return Double.MAX_VALUE;
		}
		double result = x;
		for (int i = 2; i <= x; ++i) {
			if (ok(LR, x, i)) {
				result = x / (double) i;
			}
		}
		return result;
	}

	private boolean ok(List<int[]> LR, final int n, final int d) {
		return LR.forall(new F<int[], Boolean>() {
			@Override
			public Boolean f(int[] lr) {
				int a = (lr[0] * d + n) / n;
				int b = (lr[1] * d + n - 1) / n;

				return a >= b;
			}
		});
	}

}