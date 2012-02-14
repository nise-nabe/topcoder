import java.util.*;

public class DengklekTryingToSleep {

	public int minDucks(int[] ducks) {
		Arrays.sort(ducks);
		return ducks[ducks.length - 1] - ducks[0] + 1 - ducks.length;
	}

}
