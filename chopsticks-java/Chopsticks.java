import java.util.*;

public class Chopsticks {

	public int getmax(int[] length) {
		Arrays.sort(length);
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for ( int l : length){
			Integer c = map.get(l);
			if (c == null){
				c = 0;
			}
			map.put(l, c + 1);
		}
		int result = 0;
		for(int c : map.values()){
			result += c / 2;
		}
		return result;
	}

}
