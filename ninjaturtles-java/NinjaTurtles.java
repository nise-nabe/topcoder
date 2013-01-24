public class NinjaTurtles {

	public int countOpponents(int P, int K) {
		for (int i = 1; i < 10000000; ++i) {
			int result = (int) (3 * Math.floor(i / K) + Math.floor(i / 3));
			if (result == P) {
				return i;
			}
		}
		return -1;
	}

}
