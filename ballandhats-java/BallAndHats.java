public class BallAndHats {

	public int getHat(String hats, int numSwaps) {
		return numSwaps < 1 ? hats.indexOf('o') : (hats.indexOf('o') % 2 + numSwaps % 2) % 2;
	}

}
