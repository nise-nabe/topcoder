import java.util.*;

public class ValueHistogram {

	public String[] build(int[] values) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < 10; ++i){
			map.put(i, 0);
		}
		for(int v : values){
			map.put(v, map.get(v) + 1);
		}
		String[] result = new String[Collections.max(map.values()) + 1];
		for(int i = 0; i < result.length; ++i){
			result[i] = "";
			for(int j = 0; j < 10; ++j){
				result[i] += result.length - i <= map.get(j) ? "X" : ".";
			}
		}
		return result;
	}

}
