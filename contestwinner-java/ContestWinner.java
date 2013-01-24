import java.util.*;

public class ContestWinner {

	public int getWinner(int[] events) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0, maxi = 0;
		for (int e : events) {
			Integer i = map.get(e);
			if (i == null) {
				i = 0;
			}
			map.put(e, i + 1);
			if (max < map.get(e)){
				max = map.get(e);
				maxi = e;
			}
		}
		return maxi;
	}

}
