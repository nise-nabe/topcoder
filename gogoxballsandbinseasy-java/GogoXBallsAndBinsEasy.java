public class GogoXBallsAndBinsEasy {

	public int solve(int[] T) {
		int c = 0;
		for(int i = 0; i < T.length / 2; ++i){
			c += T[T.length - i - 1] - T[i];
		}
		return c;
	}

}
