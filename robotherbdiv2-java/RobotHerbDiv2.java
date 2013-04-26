public class RobotHerbDiv2 {

	public int getdist(int T, int[] a) {
		long x = 0, y = 0;
		int[][] ds = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		int d = 0;
		for (; T-- > 0;) {
			for (int b : a) {
				x += ds[d][0] * b;
				y += ds[d][1] * b;
				d = (d + b % 4) % 4;
			}
		}
		return (int) (Math.abs(x) + Math.abs(y));
	}

}
