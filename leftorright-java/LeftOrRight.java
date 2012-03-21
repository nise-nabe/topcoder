public class LeftOrRight {

	public int maxDistance(String p) {
		return Math.max(maxDist(p.replace('?', 'L'), 0, 0),
				maxDist(p.replace('?', 'R'), 0, 0));
	}

	int max = 0;

	int maxDist(String p, int x, int h) {
		if (p.length() != 0) {
			maxDist(p.substring(1), x + (p.charAt(0) == 'R' ? 1 : -1), 0);
		}
		return max = Math.max(max, Math.abs(x));
	}
}
