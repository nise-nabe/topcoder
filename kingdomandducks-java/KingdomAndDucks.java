import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KingdomAndDucks {

	public int minDucks(int[] duckTypes) {
		Map<Integer, Integer> map = new  HashMap<Integer, Integer>();
		for(int type : duckTypes){
			Integer n = map.get(type);
			if(n == null){
				n = 0;
			}
			map.put(type, n + 1);
		}
		return map.size() * Collections.max(map.values());
	}

}
